package org.axdt.asdoc.parser;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	public static class TransformLink2Package implements
			Function<Node, AsdocPackage> {

		private final AsdocRoot root;
		private Pattern pattern;

		public TransformLink2Package(AsdocRoot root) {
			this.root = root;
			pattern = Pattern.compile("^.*'(.*/" + AsdocUris.PACKAGE_DETAIL
					+ ")'.*$");
		}

		public AsdocPackage apply(Node link) {
			String href = attribute(link, "href");
			String fqn = getFQN(href);
			if (fqn != null) {
				AsdocPackage pack = root.createPackage(fqn);
				pack.setTypeContentAvailable(true);
				return pack;
			}
			return null;
		}

		public String getFQN(String href) {
			if (href == null)
				return null;
			if (!href.endsWith(AsdocUris.PACKAGE_DETAIL)) {
				Matcher matcher = pattern.matcher(href);
				if (!matcher.matches()) {
					logger.debug("ignored link: " + href);
					return null;
				}
				href = matcher.group(1);
			}
			int lastSlash = href.lastIndexOf('/');
			return lastSlash < 0 ? ""
					: href.substring(0, lastSlash).replace('/', '.');
		}
	}
}
