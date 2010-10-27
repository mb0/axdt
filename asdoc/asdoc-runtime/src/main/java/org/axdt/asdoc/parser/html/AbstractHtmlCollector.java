/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser.html;

import javax.xml.xpath.XPathExpression;

import org.apache.log4j.Logger;
import org.axdt.asdoc.parser.AbstractCollector;

public abstract class AbstractHtmlCollector extends AbstractCollector {
	protected final Logger logger = Logger.getLogger(getClass());
	
	protected XPathExpression findMain;
	protected XPathExpression findLinks;
	protected XPathExpression findFlex4Main;

	public AbstractHtmlCollector() {
		xml = new HtmlLoader();
		findFlex4Main = xml.xexpr("//html:div[@class='maincontainer']//html:div[@class='content']");
		findMain = xml.xexpr("//html:div[@class='MainContent']");
		findLinks = xml.xexpr(".//html:a[@href]");
	}
}
