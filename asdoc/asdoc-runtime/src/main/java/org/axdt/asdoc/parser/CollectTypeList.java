package org.axdt.asdoc.parser;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocField;
import org.axdt.asdoc.model.AsdocOperation;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.avm.model.AvmDeclaredElement;
import org.w3c.dom.Node;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class CollectTypeList extends AbstractCollector {
	
	private static Logger logger = Logger.getLogger(CollectTypeList.class);
	
	public CollectTypeList() {
		super();
	}

	public void collectAllTypes(AsdocPackage pack, boolean detail) throws Exception {
		if (pack.isTypeContentAvailable())
			collectTypes(pack, detail);
		for (AsdocPackage child:pack.getPackages())
			collectAllTypes(child, detail);
	}
	
	public List<AvmDeclaredElement> collectTypes(AsdocPackage pack, boolean detail) throws Exception {
		String uri = AsdocUris.types(pack, detail);
		logger.info("loading : " + uri);
		try {
			Node node = load(uri);
			if (detail) {
				Node found = eval(findMain, node);
				if (found == null)
					found = eval(findFlex4Main, node);
				node = found;
			}
			return eIter(findLinks, node, new TransformLink2Element(pack));
		} catch (FileNotFoundException e) {
			return Collections.emptyList();
		}
	}

	protected static class TransformLink2Element implements
			Function<Node, AvmDeclaredElement> {

		private final static List<String> ignored = Lists.newArrayList("", "appendixes", "conventions",
				"index", "package");
		private final AsdocPackage pack;
		protected AsdocEFactory asFactory = AsdocEFactory.eINSTANCE;

		public TransformLink2Element(AsdocPackage pack) {
			this.pack = pack;
		}

		public AvmDeclaredElement apply(Node link) {
			String href = attribute(link, "href");
			if (isMember(href)) {
				pack.setGlobalContentAvailable(true);
				return null;
			} else if (isType(href)) {
				AsdocType type = createType(link, href);
				pack.getTypes().add(type);
				return type;
			}
			logger.debug("ignored link: " + href);
			return null;
		}

		boolean isMember(String href) {
			return href.startsWith(AsdocUris.PACKAGE + "#")
					&& !(href.endsWith("#methodSummary") || href
							.endsWith("#constantSummary"));
		}

		boolean isMethod(String href) {
			return href.endsWith("()");
		}

		boolean isType(String href) {
			String typeName = href.split("\\.")[0].trim();
			return !(typeName == null || ignored.contains(typeName) || typeName
					.startsWith("javascript:") || typeName.contains("-"));
		}

		AsdocField createField(Node link, String href) {
			String name = href.split("#")[1];
			AsdocField field = asFactory.createAsdocField();
			field.setName(name);
			return field;
		}

		AsdocOperation createMethod(Node link, String href) {
			String name = href.split("#")[1];
			name = name.substring(0, name.length() - 2);
			AsdocOperation method = asFactory.createAsdocOperation();
			method.setName(name);
			return method;
		}

		AsdocType createType(Node link, String href) {
			String name = href.split("\\.")[0].trim();
			AsdocType type = isInterface(link)
					? asFactory.createAsdocInterface()
					: asFactory.createAsdocClass();
			type.setName(name);
			return type;
		}

		boolean isInterface(Node link) {
			if ("i".equals(link.getParentNode().getNodeName())
					|| link.hasChildNodes()
					&& "i".equals(link.getFirstChild().getNodeName()))
				return true;
			return false;
		}
	}
}
