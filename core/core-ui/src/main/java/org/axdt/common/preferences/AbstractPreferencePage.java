package org.axdt.common.preferences;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;

/**
 * @author mb0
 *
 */
public abstract class AbstractPreferencePage extends AbstractFieldEditorPage implements
		IAxdtPreferencePage {

	/**
	 * only when used as property page
	 */
	private IAdaptable element;

	public AbstractPreferencePage(PrefPage page) {
		super(page);
	}

	public AbstractPreferencePage(AbstractPreferences pref) {
		this(pref, AbstractPreferences.PAGE_DEFAULT);
	}

	public AbstractPreferencePage(AbstractPreferences pref, String pageKey) {
		this(pref.getPage(pageKey));
	}

	protected IPreferenceStore retrievePreferenceStore(AbstractPreferences prefs) {
		return prefs.getStore();
	}

	public void init(IWorkbench workbench) {
		setPreferenceStore(retrievePreferenceStore(page.getPreferences()));
	}

	/**
	 * only when used as property page
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#getElement()
	 */
	public IAdaptable getElement() {
		return element;
	}

	/**
	 * only when used as property page
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#setElement(org.eclipse.core.runtime.IAdaptable)
	 */
	public void setElement(IAdaptable element) {
		this.element = element;
		setPreferenceStore(retrievePreferenceStore(page.getPreferences()));
	}
}
