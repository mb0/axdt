package org.axdt.asdoc.parser;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.avm.model.AvmMember;
import org.w3c.dom.Node;

import com.google.common.base.Function;

public class CollectGlobalInfo extends AbstractMemberCollector<AsdocPackage> {

	private static Logger logger = Logger.getLogger(CollectPackageList.class);

	public CollectGlobalInfo() {
		super();
	}

	public void collectAllGlobalInfo(AsdocPackage pack) throws Exception {
		if (pack.isGlobalContentAvailable())
			collectGlobalInfo(pack);
		for (AsdocPackage child:pack.getPackages())
			collectAllGlobalInfo(child);
	}
	public void collectGlobalInfo(final AsdocPackage pack) throws Exception {
		String uri = pack.getFullUri()+AsdocUris.PACKAGE;
		logger.info("loading: "+ uri);
		Node node = load(uri);
		eIter(findDetailBody,eval(findMain, node), new Function<Node, AvmMember>() {
			public AvmMember apply(Node from) {
				if (!from.hasChildNodes()) return null;
				try {
					AsdocMember member = parseMember(pack,from);
					member.getName();
					pack.getMembers().add(member);
					return member;
				} catch (Exception e) {
					logger.error("error parsing type", e);
					return null;
				}
			}
		});
	}
	
	protected Logger getLogger() {
		return logger;
	}
}
