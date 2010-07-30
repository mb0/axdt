package org.axdt.common.wizards;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

public abstract class AbstractFileWizardPage extends WizardPage implements ModifyListener {

	protected ISelection selection;
	protected Text fileText;
	protected Text containerText;
	
	public AbstractFileWizardPage(String id, ISelection selection) {
		super(id);
		this.selection = selection;
	}
	
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		createContent(composite);
		
		initialize();
		dialogChanged();
		setControl(composite);
	}

	protected void createContent(Composite parent) {
		createContainerContent(parent);
		createFileContent(parent);
	}

	protected void createContainerContent(Composite parent) {
		createContainerContentLable(parent);
		containerText = new Text(parent, SWT.BORDER | SWT.SINGLE);
		containerText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		containerText.addModifyListener(this);
		Button button = new Button(parent, SWT.PUSH);
		button.setText("&Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
	}
	protected void handleBrowse() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), root, false, "Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length >= 1) {
				initializeWithSelection(root.findMember((IPath) result[0]));
			}
		}
	}

	protected void createContainerContentLable(Composite parent) {
		Label label = new Label(parent, SWT.NULL);
		label.setText("Source &folder:");
	}
	protected void createFileContentLable(Composite parent) {
		Label label = new Label(parent, SWT.NULL);
		label.setText("File &name:");
	}
	protected void createFileContent(Composite parent) {
		createFileContentLable(parent);
		fileText = new Text(parent, SWT.BORDER | SWT.SINGLE);
		fileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		fileText.addModifyListener(this);
		new Label(parent, SWT.NULL);
	}

	protected void dialogChanged() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath containerPath = getContainerPath();
		IResource container = root.findMember(containerPath);
		String fileName = getFileName();
		if (getContainerName().length() == 0) {
			updateStatus("Container must be specified");
		} else if (container == null) {
			updateStatus("Container must be existing.");
		} else if ((container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("Container must be a project or folder.");
		} else if (!container.isAccessible()) {
			updateStatus("Container must be writable");
		} else if (fileName.length() == 0) {
			updateStatus("File name must be specified");
		} else if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must not contain slashes");
		} else if (root.findMember(getFilePath()) != null) {
			updateStatus("File already exists");
		} else {
			updateStatus(null);
		}
	}

	protected void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource)
				initializeWithSelection((IResource) obj);
		}
		initializeFocus();
	}
	
	protected void initializeFocus() {
		containerText.setFocus();
		containerText.setSelection(containerText.getText().length());
	}

	protected abstract void initializeWithSelection(IResource obj);

	public String getContainerName() {
		return containerText.getText();
	}

	public IPath getContainerPath() {
		return new Path(getContainerName());
	}
	public abstract String getExtension();

	public IPath getFilePath() {
		return getContainerPath().append(getFileName());
	}

	public String getFileName() {
		String fileName = fileText.getText();
		if (!fileName.endsWith(getExtension())) 
			fileName += getExtension();
		return fileName;
	}
	protected void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	public void modifyText(ModifyEvent e) {
		dialogChanged();
	}

}
