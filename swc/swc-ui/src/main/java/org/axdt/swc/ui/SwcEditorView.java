package org.axdt.swc.ui;

import java.util.ArrayList;

import org.axdt.core.ui.img.AxdtImageHelper;
import org.axdt.core.ui.img.AxdtImages;
import org.axdt.swc.ui.model.SwcContainer;
import org.axdt.swc.ui.model.SwcEntry;
import org.axdt.swc.ui.model.SwcInfo;
import org.axdt.swc.ui.model.SwcModel;
import org.axdt.swc.ui.model.SwcModelObject;
import org.axdt.swc.ui.model.SwcPackage;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;

public class SwcEditorView extends EditorPart {

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite base = new Composite(parent, SWT.NONE);
		base.setLayout(new FillLayout());
		TreeViewer treeViewer = new TreeViewer(base);
		treeViewer.setLabelProvider(new SwcLabelProvider());
		treeViewer.setContentProvider(new SwcContentProvider());
		IEditorInput input = getEditorInput();
		SwcInfo info = new SwcInfo();
		if (input instanceof IFileEditorInput) {
			IFileEditorInput fileInput = (IFileEditorInput) input;
			info.readFile(fileInput.getFile());
		}
		treeViewer.setInput(info.getModel());
		treeViewer.expandToLevel(3);
	}

	@Override
	public void setFocus() {
	}
}

class SwcLabelProvider extends LabelProvider {
	IEditorRegistry editorRegistry = PlatformUI.getWorkbench()
			.getEditorRegistry();
	ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
	AxdtImageHelper imageHelper = AxdtImageHelper.getInstance();
	@Override
	public String getText(Object element) {
		return element.toString();
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof SwcPackage) {
			return imageHelper.getImage(AxdtImages.PACKAGE);
		} else if (element instanceof SwcContainer) {
			if (((SwcContainer) element).getParent() instanceof SwcModel
					&& "catalog".equals(element.toString()))
				return imageHelper.getImage(AxdtImages.SWC_FILE);
			return sharedImages.getImage(ISharedImages.IMG_OBJ_FOLDER);
		} else if (element instanceof SwcEntry) {
			return editorRegistry.getImageDescriptor(element.toString())
					.createImage();
		}
		return super.getImage(element);
	}
}

class SwcContentProvider implements ITreeContentProvider {

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	public Object[] getChildren(Object element) {
		ArrayList<Object> list = new ArrayList<Object>();
		if (element instanceof SwcContainer) {
			SwcContainer o = (SwcContainer) element;
			list.addAll(o.getContainers());
			list.addAll(o.getEntries());
		}
		return list.toArray();
	}

	public Object getParent(Object element) {
		if (element instanceof SwcModelObject) {
			SwcModelObject o = (SwcModelObject) element;
			return o.getParent();
		}
		return null;
	}

	public boolean hasChildren(Object element) {
		if (element instanceof SwcContainer) {
			SwcContainer o = (SwcContainer) element;
			return o.hasContainers() || o.hasEntries();
		}
		return false;
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}
}