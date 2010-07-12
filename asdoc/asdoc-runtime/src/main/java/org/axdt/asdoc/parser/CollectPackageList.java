package org.axdt.asdoc.parser;

import java.util.List;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.w3c.dom.Node;

import com.google.common.base.Function;

public class CollectPackageList extends AbstractCollector {
	
	private static Logger logger = Logger.getLogger(CollectPackageList.class);
	
	public CollectPackageList() {
		super();
	}

	public List<AsdocPackage> collectPackages(AsdocRoot root, boolean summary)
			throws Exception {
		String uri = AsdocUris.packages(root, summary);
		logger.info("loading: " + uri);
		Node node = load(uri);
		if (summary)
			node = eval(findMain, node);
		return eIter(findLinks, node, new TransformLink2Package(root));
	}

	private final static class TransformLink2Package implements
			Function<Node, AsdocPackage> {

		private final AsdocRoot root;

		public TransformLink2Package(AsdocRoot root) {
			this.root = root;
		}

		public AsdocPackage apply(Node link) {
			String href = attribute(link, "href");
			if (!href.endsWith(AsdocUris.PACKAGE_DETAIL)) {
				logger.debug("ignored link: " + href);
				return null;
			}
			AsdocPackage pack = root.createPackage(getFQN(href));
			pack.setTypeContentAvailable(true);
			return pack;
		}

		String getFQN(String href) {
			int lastSlash = href.lastIndexOf('/');
			if (lastSlash < 0)
				return "";
			return href.substring(0, lastSlash).replace('/', '.');
		}
	}
}
