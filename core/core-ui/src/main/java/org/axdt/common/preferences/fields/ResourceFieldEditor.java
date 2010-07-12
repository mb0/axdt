package org.axdt.common.preferences.fields;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

public class ResourceFieldEditor extends StringButtonFieldEditor {

	private IWorkspaceRoot workspaceroot;
	private String[] extensions;

	public ResourceFieldEditor(String key, String desc, Composite parent) {
		init(key, desc);
		createControl(parent);
		workspaceroot = ResourcesPlugin.getWorkspace().getRoot();
	}

	@Override
	protected String changePressed() {
        IResource d = getResource();
        if (d == null) {
			return null;
		}
        return d.getFullPath().toPortableString();
	}
	
	private IResource getResource() {
		ResourceListSelectionDialog dialog = new FilteredResourceSelectionDialog(getShell(), workspaceroot, IResource.FILE);
		dialog.setTitle(getLabelText());
		if (dialog.open() == Window.OK) {
			Object[] files = dialog.getResult();
			if (files.length > 0) {
				return (IFile) files[0];
			}
		}
		return null;
	}
	
	@Override
	protected boolean checkState() {
		IResource member = workspaceroot.findMember(getTextControl().getText());
		if (member instanceof IFile) {
			if (checkFileExtension(member.getFileExtension())) {
				return true;
			}
			StringBuilder buf = new StringBuilder("Resource must have a ");
			for (String ext:extensions)
				buf.append(ext).append(" or ");
			buf.replace(buf.length()-3, buf.length(), "extensions.");
			showErrorMessage(buf.toString());
			return false;
		}
		showErrorMessage("Resource does not exist.");
		return false;
	}

	private boolean checkFileExtension(String ext) {
		if (extensions == null|| extensions.length == 0)
			return true;
		for (String acExt:extensions)
			if (acExt.equals(ext))
				return true;
		return false;
	}

	public void setFileExtensions(String[] extensions) {
        this.extensions = extensions;
    }

	private class FilteredResourceSelectionDialog extends ResourceListSelectionDialog {
		public FilteredResourceSelectionDialog(Shell shell,
				IWorkspaceRoot root, int type) {
			super(shell, root, type);
		}
		@Override
		protected boolean select(IResource resource) {
			return checkFileExtension(resource.getFileExtension());
		}
	}
}