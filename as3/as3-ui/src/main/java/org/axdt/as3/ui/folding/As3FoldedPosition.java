/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.folding;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldedPosition;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionAcceptor;
import org.eclipse.xtext.ui.editor.folding.FoldedPosition;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.ITextRegion;

public class As3FoldedPosition extends DefaultFoldedPosition {
	private static final Logger log = Logger
			.getLogger(DefaultFoldingRegionAcceptor.class);
	private final String regionType;

	public As3FoldedPosition(int offset, int length, int contentStart,
			int contentLength, String regionType) {
		super(offset, length, contentStart, contentLength);
		this.regionType = regionType;
	}

	public String getRegionType() {
		return regionType;
	}

	public static class Acceptor implements IFoldingRegionAcceptor<ITextRegion> {
		private Collection<FoldedPosition> result;
		private IXtextDocument document;
		private int header = 0;

		public Acceptor(IXtextDocument document,
				Collection<FoldedPosition> result) {
			this.result = result;
			this.document = document;
		}

		public void accept(int offset, int length) {
			accept(offset, length, null, null);
		}

		public void accept(int offset, int length, ITextRegion significantRegion) {
			accept(offset, length, significantRegion, null);
		}

		public void accept(int offset, int length,
				ITextRegion significantRegion, String regionType) {
			IRegion position = getLineRegion(offset, length);
			FoldedPosition foldingRegion = newFoldedPosition(position,
					significantRegion, regionType);
			if (foldingRegion != null) {
				result.add(foldingRegion);
			}
		}

		protected IRegion getLineRegion(int offset, int length) {
			IRegion position = null;
			try {
				int startLine = document.getLineOfOffset(offset);
				int endLine = document.getLineOfOffset(offset + length);
				if (startLine < endLine) {
					int start = document.getLineOffset(startLine);
					int end = document.getLineOffset(endLine)
							+ document.getLineLength(endLine);
					position = new Region(start, end - start);
				}
			} catch (BadLocationException e) {
				log.error(e);
			}
			return position;
		}

		protected As3FoldedPosition newFoldedPosition(IRegion region,
				ITextRegion significantRegion, String regionType) {
			if (region == null)
				return null;
			if (significantRegion != null)
				return new As3FoldedPosition(region.getOffset(),
						region.getLength(), significantRegion.getOffset()
								- region.getOffset(),
						significantRegion.getLength(), regionType);
			return new As3FoldedPosition(region.getOffset(),
					region.getLength(), -1, -1, regionType);
		}

		public void setHeader(int header) {
			this.header = header;
		}

		public int getHeader() {
			return header;
		}
	}
}
