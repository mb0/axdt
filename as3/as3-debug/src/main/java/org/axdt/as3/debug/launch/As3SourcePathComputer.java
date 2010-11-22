/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.debug.launch;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.eclipse.debug.core.sourcelookup.ISourceContainerType;
import org.eclipse.debug.core.sourcelookup.ISourcePathComputerDelegate;
import org.eclipse.debug.core.sourcelookup.containers.AbstractSourceContainer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class As3SourcePathComputer implements ISourcePathComputerDelegate {

	private ISourceContainer[] containers;

	public ISourceContainer[] computeSourceContainers(
			ILaunchConfiguration configuration, IProgressMonitor monitor)
			throws CoreException {
		if (containers == null) {
			ISourceContainer sourceContainer = new As3RootSourceContainer();
			containers = new ISourceContainer[] { sourceContainer };
		}
		return containers;
	}

	public static class As3RootSourceContainer extends AbstractSourceContainer {

		private final static As3RootSourceContainerType type = new As3RootSourceContainerType();
		private final IWorkspaceRoot root;

		public As3RootSourceContainer() {
			root = ResourcesPlugin.getWorkspace().getRoot();
		}

		public Object[] findSourceElements(String name) throws CoreException {
			IResource file = root.findMember(new Path(name));
			if (file != null)
				return new Object[] { file };
			return new Object[0];
		}

		public String getName() {
			return "Workspace path container";
		}

		public ISourceContainerType getType() {
			return type;
		}
	}

	public static class As3RootSourceContainerType implements
			ISourceContainerType {

		public ISourceContainer createSourceContainer(String memento)
				throws CoreException {
			Node node = DebugPlugin.parseDocument(memento);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				if (getName().equals(element.getNodeName())) {
					return new As3RootSourceContainer();
				}
			}
			return null;
		}

		public String getMemento(ISourceContainer container)
				throws CoreException {
			Document document = DebugPlugin.newDocument();
			Element element = document.createElement(getName());
			document.appendChild(element);
			return DebugPlugin.serializeDocument(document);
		}

		public String getName() {
			return "wroot";
		}

		public String getId() {
			return "org.axdt.debug.launch.srcContainerType";
		}

		public String getDescription() {
			return "";
		}
	}
}
