/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.ui.preferences;

import java.net.URL;
import java.util.List;

import org.axdt.asdoc.ui.AsdocUiActivator;
import org.axdt.asdoc.ui.preferences.DocTableFieldEditor.DocItem;
import org.axdt.common.preferences.AbstractPreferences;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.osgi.framework.Bundle;

import com.google.inject.internal.Lists;

public class AsdocPreferences extends AbstractPreferences {
	
	public static final String PAGE_BUILT_INS = "builtIns";

	public final static String ASDOC_URIS = "ASDOC_URIS";
	public final static String BUILT_IN_LOCALE = "builtInLocale";
	public final static String BUILT_IN_HTML_URL = "builtInHtmlUrl";

	public static enum Locale1 {
		en_US("English"),
		zh_CN("Chinese"),
		da_DK("Danish", true),
		nl_NL("Dutch", true),
		fi_FI("Finnish", true),
		fr_FR("French"),
		de_DE("German"),
		it_IT("Italian", true),
		ja_JP("Japanese"),
		ko_KR("Korean", true),
		nb_NO("Norwegian", true),
		pt_BR("Portuguese",	true),
		ru_RU("Russian"),
		es_ES("Spanish", true),
		sv_SE("Swedish", true),
		zh_tw("Taiwanese", "zh_CN");
		
		public final String label;
		public final String defaultLocale;

		private Locale1(String label) {
			this(label, null);
		}

		private Locale1(String label, boolean partial) {
			this(label, "en_US");
		}

		private Locale1(String label, String defaultLocale) {
			this.label = label;
			this.defaultLocale = defaultLocale;
		}

		public static String[][] comboArray() {
			Locale1[] values = values();
			String[][] result = new String[values.length][];
			for (int i = 0; i < values.length; i++)
				result[i] = new String[] { values[i].label, values[i].name() };
			return result;
		}

		public Locale1 getDefaultLocale() {
			return defaultLocale == null ? this : Locale1.valueOf(defaultLocale);
		}
	}

	public static enum BuiltIn {
		PLAYER("playerglobal", "Flash Player", true, true),
		FRAMEWORK("framework", "Flex Framework", true, false),
		SPARK("spark", "Spark Components", true, false),
		AUTOMATION("automation", "Automation"),
		VISUALIZATION("datavisualization", "Data Visualization"),
		INTEGRATION("flash-integration", "Flash Integration", false, true),
		OSMF("osmf", "Open Source Media Framework"), 
		RPC("rpc", "RPC and Messaging"), 
		TEXTLAYOUT("textLayout", "Text Layout");

		public final String id;
		public final String label;
		public final boolean isDefault;
		public final boolean useDefaultLocale;

		private BuiltIn(String id, String label) {
			this(id, label, false, false);
		}

		private BuiltIn(String id, String label, boolean isDefault,
				boolean useDefaultLocale) {
			this.id = id;
			this.label = label;
			this.isDefault = isDefault;
			this.useDefaultLocale = useDefaultLocale;
		}

		private static List<String> ids = null;

		public static List<String> getIds() {
			if (ids == null) {
				ids = Lists.newArrayList();
				for (BuiltIn b : values())
					ids.add(b.id);
			}
			return ids;
		}

		public String getUrl(String base, Locale1 loc) {
			if (useDefaultLocale)
				loc = loc.getDefaultLocale();
			return "jar:" + base + loc + "/" + id
					+ "_rb.swc!/docs/packages.dita";
		}
	}

	private static AsdocPreferences instance;

	public static AsdocPreferences getInstance() {
		if (instance == null)
			new AsdocPreferences();
		return instance;
	}

	public AsdocPreferences() {
		super("Preferences for asdoc support");
		assert (instance == null);
		instance = this;
	}

	public String getQualifier() {
		return AsdocUiActivator.PLUGIN_ID;
	}

	public void initializeFieldSpecs() {
		add(new DocTableField(ASDOC_URIS, "Asdoc Urls", ""));
		// TODO add help link instead
		addHelp("Add the root url of an asdoc like 'http://asunit.org/docs/asunit3/'.");
		addHelp("Urls can point into zip encoded archives 'jar:file:/home/mb0/doc.zip!/langref/'");
		addPage(PAGE_BUILT_INS, "Built-in Asdoc");
		addGroup("Asdoc for framework libraries", true);
		for (BuiltIn builtIn : BuiltIn.values()) {
			add(builtIn.id, builtIn.label, builtIn.isDefault);
		}
		addGroup("Options", true);
		add(BUILT_IN_LOCALE, "Language", Locale1.comboArray());
		add(BUILT_IN_HTML_URL, "Html url", "http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/");
	}

	public URL getFrameworksLocaleUrl() {
		try {
			Bundle bundle = Platform.getBundle("org.axdt.flex4.sdk");
			URL[] urls = FileLocator.findEntries(bundle, new Path(
					"flexsdk/frameworks/locale/"));
			return FileLocator.resolve(urls[0]);
		} catch (Exception e) {
		}
		return null;
	}

	public String getAsdocUrisString(IPreferenceStore store) {
		return store.getString(ASDOC_URIS);
	}

	public List<DocItem> getBuiltinDocItems(IPreferenceStore store) {
		URL localeUrl = getFrameworksLocaleUrl();
		if (localeUrl == null)
			return Lists.newArrayList();
		String baseUrl = localeUrl.toString();
		String asdocUrl = store.getString(BUILT_IN_HTML_URL);
		String locale = store.getString(BUILT_IN_LOCALE);
		Locale1 loc = Locale1.valueOf(locale);
		List<DocItem> list = Lists.newArrayList();
		for (BuiltIn b : BuiltIn.values()) {
			if (store.getBoolean(b.id)) {
				DocItem docItem = new DocItem(b.id, b.getUrl(baseUrl, loc));
				docItem.asdocUrl = asdocUrl;
				list.add(docItem);
			}
		}
		return list;
	}

	public List<DocItem> getPrefDocItems(IPreferenceStore store) {
		String string = getAsdocUrisString(store);
		return DocTableFieldEditor.deserializeList(string);
	}

	public Object[] getDocItems(IPreferenceStore store) {
		List<DocItem> items = getBuiltinDocItems(store);
		items.addAll(getPrefDocItems(store));
		return items.toArray();
	}

	@Override
	public void initializeDefaultPreferences() {
		super.initializeDefaultPreferences();
	}
}
