/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.swc.ui.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SwcInfo {

	protected SwcModel model = null;

	public SwcInfo() {
	}

	public void readFile(IFile file) {
		model = new SwcModel(file.getName());
		try {
			ZipFile zip = new ZipFile(file.getLocation().toFile(),
					ZipFile.OPEN_READ);
			Enumeration<? extends ZipEntry> entries = zip.entries();
			while (entries.hasMoreElements()) {
				ZipEntry entry = entries.nextElement();
				readEntry(zip, entry);
			}
			zip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void readEntry(ZipFile zip, ZipEntry entry) {
		String name = entry.getName();
		model.addFileName(name);
		if (name.equals("catalog.xml")) {
			try {
				InputStream stream = zip.getInputStream(entry);
				readCatalogXml(stream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	protected void readCatalogXml(InputStream stream) {
		SAXParser parser = getParser();
		DefaultHandler handler = new DefaultHandler() {
			@Override
			public void startElement(String uri, String localName, String name,
					Attributes attributes) throws SAXException {
				if (name.equals("def")) {
					model.addScriptName(attributes.getValue("id"));
				}
			}
		};
		try {
			parser.parse(stream, handler);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected SAXParser getParser() {
		try {
			return SAXParserFactory.newInstance().newSAXParser();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
		return null;
	}

	public SwcModel getModel() {
		return model;
	}
}
