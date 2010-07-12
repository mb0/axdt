package org.axdt.common.preferences;

import java.util.Arrays;
import java.util.List;

import org.axdt.common.preferences.fields.BooleanField;
import org.axdt.common.preferences.fields.ComboField;
import org.axdt.common.preferences.fields.FileField;
import org.axdt.common.preferences.fields.HelpField;
import org.axdt.common.preferences.fields.IntegerField;
import org.axdt.common.preferences.fields.ResourceField;
import org.axdt.common.preferences.fields.StringField;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.texteditor.ChainedPreferenceStore;

import com.google.common.collect.Lists;

public abstract class AbstractPreferences extends AbstractPreferenceInitializer implements
		IAxdtPreferences {

	private List<PrefPage> pages;
	private List<PrefGroup> groups;
	private List<FieldSpec<?>> specs;
	private PrefPage lastPage;
	private PrefGroup lastGroup = null;

	private ScopedPreferenceStore store;

	private ScopedPreferenceStore configStore;
	private IPreferenceStore readOnlyStore;

	public AbstractPreferences(String desc) {
		super();
		lastPage = new PrefPage(this, PAGE_DEFAULT, desc);
		pages = Lists.newArrayList(lastPage);
		groups = Lists.newArrayList();
		specs = Lists.newArrayList();
		initializeFieldSpecs();
		zipLastPage();
	}

	@Override
	public void initializeDefaultPreferences() {
		IEclipsePreferences def = new DefaultScope().getNode(getQualifier());
		for (FieldSpec<?> spec : getAllFieldSpecs())
			spec.setDefault(def);
	}

	protected void zipLastPage() {
		endGroup();
		lastPage.setSpecs(specs);
		lastPage.setGroups(groups);
		specs.clear();
		groups.clear();
	}

	protected PrefGroup addGroup(String title, boolean keepLayout) {
		int index = endGroup();
		lastGroup = new PrefGroup(title, keepLayout, index);
		groups.add(lastGroup);
		return lastGroup;
	}

	protected int endGroup() {
		int index = specs.size();
		if (lastGroup != null) {
			lastGroup.setEnd(index);
			lastGroup = null;
		}
		return index;
	}

	protected PrefPage addPage(String key, String desc) {
		zipLastPage();
		lastPage = new PrefPage(this, key, desc);
		pages.add(lastPage);
		return lastPage;
	}

	protected FieldSpec<?> add(FieldSpec<?> spec) {
		specs.add(spec);
		return spec;
	}

	protected FieldSpec<?> add(String key, String desc, String defValue, boolean absolute,
			String[] extensions) {
		return add(new FileField(key, desc, defValue, absolute, extensions));
	}

	protected FieldSpec<?> add(String key, String desc, String defValue, String[] extensions) {
		return add(new ResourceField(key, desc, defValue, extensions));
	}

	protected FieldSpec<?> add(String key, String desc, String[][] choices) {
		return add(new ComboField(key, desc, choices));
	}

	protected FieldSpec<?> add(String key, String desc, String defValue) {
		return add(new StringField(key, desc, defValue));
	}

	protected FieldSpec<?> add(String key, String desc, Integer defValue) {
		return add(new IntegerField(key, desc, defValue));
	}

	protected FieldSpec<?> add(String key, String desc, Boolean defValue) {
		return add(new BooleanField(key, desc, defValue));
	}

	protected FieldSpec<?> addHelp(String helpText) {
		return add(new HelpField(helpText));
	}

	public PrefPage getPage(String pageKey) {
		for (PrefPage p : pages) {
			if (p.getKey().equals(pageKey))
				return p;
		}
		return null;
	}

	public List<FieldSpec<?>> getAllFieldSpecs() {
		List<FieldSpec<?>> result = Lists.newArrayList();
		for (PrefPage p : pages) {
			result.addAll(Arrays.asList(p.getFieldSpecs()));
		}
		return result;
	}

	public IPreferenceStore getStore() {
		// cache and return the instance scope store
		if (store == null) {
			IScopeContext[] search = new IScopeContext[] { new InstanceScope(),
					new ConfigurationScope() };
			store = new ScopedPreferenceStore(search[0], search, getQualifier());
		}
		return store;
	}

	public IPreferenceStore getConfigStore() {
		// cache and return a configuration scope store
		if (configStore == null)
			configStore = new ScopedPreferenceStore(new ConfigurationScope(), getQualifier());
		return configStore;
	}

	public IPreferenceStore getProjectStore(IResource res) {
		if (res == null || res.getProject() == null || !res.getProject().exists()) {
			// cache and return a read only instance scope store
			if (readOnlyStore == null)
				readOnlyStore = new ChainedPreferenceStore(new IPreferenceStore[] { getStore() });
			return readOnlyStore;
		}
		// return a fresh project scope store
		IScopeContext[] search = new IScopeContext[] { new ProjectScope(res.getProject()),
				new InstanceScope(), new ConfigurationScope() };
		ScopedPreferenceStore store = new ScopedPreferenceStore(search[0], search, getQualifier());
		return store;
	}
	public boolean getBoolean(IResource resource, String name) {
		return getProjectStore(resource).getBoolean(name);
	}
	public int getInt(IResource resource, String name) {
		return getProjectStore(resource).getInt(name);
	}
	public double getDouble(IResource resource, String name) {
		return getProjectStore(resource).getDouble(name);
	}
	public String getString(IResource resource, String name) {
		return getProjectStore(resource).getString(name);
	}

	public boolean getBoolean(ILaunchConfiguration config, String name) throws CoreException {
		return config.getAttribute(name, getStore().getBoolean(name));
	}

	public String getString(ILaunchConfiguration config, String name) throws CoreException {
		return config.getAttribute(name, getStore().getString(name));
	}
	public String getConfigId() {
		return getQualifier();
	}
}
