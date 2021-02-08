package shit;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.ProgressBar;

public class OkShit {
	private DataBindingContext m_bindingContext;

	protected Shell shell;
	private Text txtHaHaI;
	private CCombo combo;
	private ProgressBar progressBar;

	/**
	 * Launch the application.
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Realm.runWithDefault(SWTObservables.getRealm(display), new Runnable() {
			public void run() {
				try {
					OkShit window = new OkShit();
					window.open();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(383, 158);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(3, false));
		
		txtHaHaI = new Text(shell, SWT.BORDER);
		txtHaHaI.setText("ha ha i really like this textlayout");
		GridData gd_txtHaHaI = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_txtHaHaI.widthHint = 182;
		txtHaHaI.setLayoutData(gd_txtHaHaI);
		
		Button btnHereIsA = new Button(shell, SWT.NONE);
		btnHereIsA.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		btnHereIsA.setText("here is a button");
		
		Button btnCheckThisOne = new Button(shell, SWT.CHECK);
		btnCheckThisOne.setText("check this one");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		combo = new CCombo(shell, SWT.BORDER);
		combo.setText("this is coll\r\nthis is not\r\nbut i like the swt\r\n");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		progressBar = new ProgressBar(shell, SWT.NONE);
		progressBar.setSelection(70);
		GridData gd_progressBar = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_progressBar.widthHint = 255;
		progressBar.setLayoutData(gd_progressBar);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		m_bindingContext = initDataBindings();

	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		return bindingContext;
	}
}
