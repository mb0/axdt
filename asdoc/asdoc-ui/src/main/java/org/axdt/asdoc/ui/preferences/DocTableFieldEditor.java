package org.axdt.asdoc.ui.preferences;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.axdt.asdoc.ui.AsdocUiActivator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.StatusDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnLayoutData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;

public class DocTableFieldEditor extends FieldEditor {

	private Composite baseComp;
	private TableViewer tableViewer;

	public DocTableFieldEditor(String name, String labelText, Composite comp) {
		super(name, labelText, comp);
	}

	@Override
	protected void adjustForNumColumns(int numColumns) {
		GridData layoutData = (GridData) baseComp.getLayoutData();
		layoutData.horizontalSpan = numColumns;
	}
	
	protected Composite createBaseComposite(Composite parent, int numColumns) {
		Composite result = new Composite(parent,SWT.NONE);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = numColumns;
		result.setLayoutData(gd);
		result.setLayout(new GridLayout(1,false));
		return result;
	}
	protected Label createLabel(Composite parent) {
		Label labelControl = getLabelControl(parent);
		labelControl.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		return labelControl;
	}
	
	protected SashForm createSashForm(Composite parent) {
		final SashForm splitComp = new SashForm(parent,SWT.NONE);
		splitComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		splitComp.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				int width = splitComp.getBounds().width;
				double percent = (width -100.0) / width;
				int weight = (int)Math.round(percent*100);
				splitComp.setWeights(new int[] {weight, 100 - weight});				
			}
		});
		return splitComp;
	}
	
	protected TableViewer createTableViewer(Composite parent) {
		Composite tableComp = new Composite(parent,SWT.NONE);
		tableComp.setLayout(new TableColumnLayout());
		
		TableViewer tableViewer = new TableViewer(tableComp, SWT.MULTI|SWT.BORDER|SWT.FULL_SELECTION);
		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.getTable().setLinesVisible(true);
		
		createTableViwerColumn(tableViewer,"Name",new ColumnLabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof DocItem) {
					DocItem item = (DocItem) element;
					return item.name;
				}
				return super.getText(element);
			}
		}, new ColumnWeightData(1,50,true));
		
		createTableViwerColumn(tableViewer,"Url",new ColumnLabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof DocItem) {
					DocItem item = (DocItem) element;
					return item.url;
				}
				return super.getText(element);
			}
		}, new ColumnWeightData(5,250,true));
		return tableViewer;
	}
	
	private void createTableViwerColumn(TableViewer tableViewer2, String string, CellLabelProvider labelProvider, ColumnLayoutData layoutData) {
		TableViewerColumn viewerNameColumn = new TableViewerColumn(tableViewer2, SWT.NONE);
		viewerNameColumn.getColumn().setText(string);
		viewerNameColumn.setLabelProvider(labelProvider);
		Layout layout = tableViewer2.getControl().getParent().getLayout();
		if (layout instanceof TableColumnLayout) {
			((TableColumnLayout) layout).setColumnData(viewerNameColumn.getColumn(), layoutData);
		}
	}

	protected Button createButton(Composite parent, String label, SelectionListener listener) {
		Button button = new Button(parent, SWT.PUSH);
		button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		button.setText(label);
		button.addSelectionListener(listener);
		return button;
	}
	protected Composite createButtons(Composite parent) {
		Composite buttonsComp = new Composite(parent,SWT.NONE);
		buttonsComp.setLayout(new GridLayout(1,true));
		
		createButton(buttonsComp, "Add", new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				DocItem item = new DocItem("New","");
				boolean doAdd = doEdit(item);
				if (doAdd) {
					Object[] input = (Object[]) tableViewer.getInput();
					List<Object> list = new ArrayList<Object>();
					list.addAll(Arrays.asList(input));
					list.add(item);
					tableViewer.setInput(list.toArray());
				}
			}
		});
		createButton(buttonsComp,"Remove",new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
				Object firstElement = selection.getFirstElement();
				Object[] input = (Object[]) tableViewer.getInput();
				List<Object> list = new ArrayList<Object>();
				list.addAll(Arrays.asList(input));
				list.remove(firstElement);
				tableViewer.setInput(list.toArray());
			}
		});
		createButton(buttonsComp,"Edit",new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
				Object firstElement = selection.getFirstElement();
				if (firstElement instanceof DocItem) {
					doEdit((DocItem)firstElement);
					tableViewer.refresh();
				}
			}
		});
		return buttonsComp;
	}
	protected boolean doEdit(DocItem item) {
		EditDialog dialog = new EditDialog(tableViewer.getControl().getShell(),item.name,item.url);
		if (dialog.open() == Window.OK) {
			IStatus status = dialog.getStatus();
			if (status.getCode() == IStatus.OK) {
				item.name = dialog.getNameText();
				item.url = dialog.getUrlText();
				return true;
			}
		}
		return false;
	}

	@Override
	protected void doFillIntoGrid(Composite parent, int numColumns) {
		baseComp = createBaseComposite(parent, numColumns);
		createLabel(baseComp);
		SashForm sashForm = createSashForm(baseComp);
		tableViewer = createTableViewer(sashForm);
		createButtons(sashForm);
	}

	@Override
	protected void doLoad() {
		if (tableViewer != null) {
			String value = getPreferenceStore().getString(getPreferenceName());
			Object[] objects = deserializeValue(value);
			tableViewer.setInput(objects);
		}
	}

	@Override
	protected void doLoadDefault() {
		if (tableViewer != null) {
			String value = getPreferenceStore().getDefaultString(getPreferenceName());
			Object[] objects = deserializeValue(value);
			tableViewer.setInput(objects);
		}
	}

	protected static Object[] deserializeValue(String value) {
		if (value == null) return new Object[0];
		List<Object> list = new ArrayList<Object>();
		value = value.trim();
		if (value.length() == 0) return new Object[0];
		if (Pattern.matches("('[^']*')([,;]('[^']*'))*", value)) {
			// rows
			for (String part:value.split(";")) {
				// items
				String[] items = part.split(",");
				if (items.length == 0) continue;
				String item = items[0].substring(1, items[0].length()-1);
				if (items.length == 1) {
					list.add(new DocItem("New",item));
				} else if (items.length == 2) {
					String url = items[1].substring(1, items[1].length()-1);
					list.add(new DocItem(item,url));
				}
			}
		} else {
			// try to reconstruct from old schema
			for (String part:value.split(" ;,")) {
				list.add(new DocItem("New",part));
			}
		}
		return list.toArray();
	}
	
	protected static String serializeValue(Object[] items) {
		StringBuilder value = new StringBuilder();
		for (Object item:items){
			if (value.length()!=0)
				value.append(";");
			value.append(item.toString());
		}
		return value.toString();
	}

	@Override
	protected void doStore() {
		Object[] items = (Object[])tableViewer.getInput();
		getPreferenceStore().setValue(getPreferenceName(), serializeValue(items));
	}

	@Override
	public int getNumberOfControls() {
		return 1;
	}
	public static class DocItem {
		public String url;
		public String name;
		public IStatus status = null;

		public DocItem(String name, String url) {
			this.name = name;
			this.url = url;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append('\'').append(name).append('\'');
			builder.append(',');
			builder.append('\'').append(url).append('\'');
			return builder.toString();
		}
	}
	public static class EditDialog extends StatusDialog {

		private Text nameText;
		private Text urlText;
		private String name;
		private String url;

		public EditDialog(Shell parent, String initialName, String initialUrl) {
			super(parent);
			this.name = initialName;
			this.url = initialUrl;
		}
		public String getUrlText() {
			return url;
		}
		public String getNameText() {
			return name;
		}
		@Override
		protected Control createDialogArea(Composite ancestor) {
			Composite parent= new Composite(ancestor, SWT.NONE);
			parent.setLayout(new GridLayout(2,false));
			
			ModifyListener listener= new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					doTextChanged(e.widget);
				}
			};
			
			Label description = createLabel(parent, "Please add a name and a valid url to an asdoc folder.");
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = 2;
			description.setLayoutData(gd);
			
			createLabel(parent, "Name");
			nameText = createText(parent, name);
			nameText.addModifyListener(listener);
			
			createLabel(parent, "Url");
			urlText = createText(parent, url);
			urlText.addModifyListener(listener);
			
			return parent;
		}
		@Override
		public void create() {
			super.create();
			updateStatus(checkValid());
		}
		protected void doTextChanged(Widget widget) {
			updateStatus(checkValid());
		}
		public IStatus checkValid() {
			if (nameText == null || urlText == null)
				return EditDialogStatus.INVALID_STATUS;
			name = nameText.getText().trim();
			url = urlText.getText().trim();
			if (name == null || url == null)
				return EditDialogStatus.INVALID_STATUS;
			if (name.length() == 0)
				return EditDialogStatus.getInvalidStatus("name must be set");
			if (url.length() == 0)
				return EditDialogStatus.getInvalidStatus("url must be set");
			try {
				URI uri = URI.create(url);
				if (!uri.isAbsolute())
					return EditDialogStatus.getInvalidStatus("url must be absolute");
			} catch (Exception e) {
				return EditDialogStatus.getInvalidStatus("url must be valid");
			}
			return EditDialogStatus.OK_STATUS;
		}
		private Label createLabel(Composite parent, String string) {
			Label label = new Label(parent, SWT.NONE);
			label.setText(string);
			label.setLayoutData(new GridData());
			return label;
		}
		private Text createText(Composite parent, String string) {
			Text text= new Text(parent, SWT.BORDER);
			text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			text.setText(string);
			return text;
		}
	}
	public static class EditDialogStatus extends Status {
		public static final IStatus INVALID_STATUS = getInvalidStatus("Error");
		public EditDialogStatus(int severity, String pluginId,
				int code, String message, Throwable exception) {
			super(severity, pluginId, code, message, exception);
		}
		public static IStatus getInvalidStatus(String message) {
			return getInvalidStatus(message, null);
		}
		public static IStatus getInvalidStatus(String message, Throwable exception) {
			return new EditDialogStatus(ERROR, AsdocUiActivator.PLUGIN_ID, ERROR, message, exception);
		}
	}
}
