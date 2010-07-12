package org.axdt.asdoc.parser;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.ParseLevel;
import org.eclipse.emf.ecore.resource.Resource;

public class AsdocParser {
	
	private static Logger logger = Logger.getLogger(CollectPackageList.class);
	
	public static interface Flags {
		int PACKAGE_GLOBALS = 16;
		int PACKAGE_TYPES = 32;
	}

	public AsdocRoot parseDoc(AsdocRoot root, ParseLevel level) throws Exception {
		boolean modified = false;
		if (ParseLevel.PACKAGE_VALUE <= level.getValue()
				&& !root.isPackageContentParsed()) {
			logger.info("Parsing package list");
			parsePackageLevel(root);
			modified = true;
			root.setPackageContentParsed(true);
		}
		if (ParseLevel.TYPE_VALUE <= level.getValue()
				&& !root.isTypeContentParsed()) {
			logger.info("Parsing type list");
			parseTypeLevel(root);
			modified = true;
			root.setTypeContentParsed(true);
		}
		if (ParseLevel.GLOBAL_VALUE <= level.getValue()
				&& root.isGlobalContentAvailable()
				&& !root.isGlobalContentParsed()) {
			logger.info("Parsing type list");
			parseGlobalLevel(root);
			modified = true;
			root.setGlobalContentParsed(true);
		}
		if (ParseLevel.MEMBER_VALUE <= level.getValue() 
				&& !root.isMemberContentParsed()) {
			logger.info("Parsing type members");
			parseMemberLevel(root);
			modified = true;
			root.setMemberContentParsed(true);
		}
		if (modified) {
			Resource eResource = root.eResource();
			if (eResource != null) eResource.setModified(true);
		}
		return root;
	}
	protected void parsePackageLevel(AsdocRoot root) throws Exception {
		CollectPackageList collectPackageList = new CollectPackageList();
		collectPackageList.collectPackages(root, false);
	}
	protected void parseTypeLevel(AsdocRoot root) throws Exception {
		CollectTypeList collectTypeList = new CollectTypeList();
		collectTypeList.collectAllTypes(root, false);
	}
	protected void parseGlobalLevel(AsdocRoot root) throws Exception {
		CollectGlobalInfo collectGlobalInfo = new CollectGlobalInfo();
		collectGlobalInfo.collectAllGlobalInfo(root);
	}
	protected void parseMemberLevel(AsdocRoot root) throws Exception {
		CollectTypeInfo collectTypeInfo = new CollectTypeInfo();
		collectTypeInfo.collectAllTypeInfo(root);
	}
}
