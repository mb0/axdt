package org.axdt.asdoc.ui.preferences;

import java.util.ArrayList;

import org.axdt.asdoc.ui.AsdocUiActivator;
import org.axdt.asdoc.ui.preferences.DocTableFieldEditor.DocItem;
import org.axdt.common.preferences.AbstractPreferences;
import org.eclipse.jface.preference.IPreferenceStore;

public class AsdocPreferences extends AbstractPreferences {

	public final static String ASDOC_URIS = "ASDOC_URIS";
	private static AsdocPreferences instance;

	public static AsdocPreferences getInstance() {
		if (instance == null)
			new AsdocPreferences();
		return instance;
	}

	public AsdocPreferences() {
		super("Preferences for asdoc support");
		assert(instance == null);
		instance = this;
	}

	public String getQualifier() {
		return AsdocUiActivator.PLUGIN_ID;
	}

	public void initializeFieldSpecs() {
		add(new DocTableField(ASDOC_URIS, "Asdoc URLs", "http://www.adobe.com/livedocs/flash/9.0/ActionScriptLangRefV3/"));
		// TODO add help link instead
		addHelp("Add the root url of an asdoc like 'http://asunit.org/docs/asunit3/'.");
		addHelp("Urls can point into zip encoded archives 'jar:file:/home/mb0/doc.zip!/langref/'");
	}

	public String getAsdocUrisString(IPreferenceStore store) {
		return store.getString(ASDOC_URIS);
	}

	public Object[] getDocItems(IPreferenceStore store) {
		String string = getAsdocUrisString(store);
		return DocTableFieldEditor.deserializeValue(string);
	}

	public String[] getAsdocUris(IPreferenceStore store) {
		ArrayList<String> list = new ArrayList<String>();
		for (Object value : getDocItems(store)) {
			if (value instanceof DocItem) {
				DocItem item = (DocItem) value;
				list.add(item.url);
			}
		}
		return list.toArray(new String[list.size()]);
	}

	@Override
	public void initializeDefaultPreferences() {
		super.initializeDefaultPreferences();
	}
}
