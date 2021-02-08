package news;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.MouseEvent;

public class ramoun {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ramoun window = new ramoun();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		shell.setSize(450, 405);
		shell.setText("SWT Application");
		shell.setLayout(null);
		Label label_1 = new Label(shell, SWT.SHADOW_NONE | SWT.CENTER);
		Label label = new Label(shell, SWT.NONE);
		label_1.addMouseTrackListener(new MouseTrackAdapter() {
			@Override
			public void mouseHover(MouseEvent e) {
				label.setImage(SWTResourceManager.getImage("C:\\Users\\Ramoun\\Desktop\\btn_hover.png"));
			}
		});
		label_1.setBounds(122, 161, 193, 39);
		
		
		
		label.setImage(SWTResourceManager.getImage("C:\\Users\\Ramoun\\Desktop\\btn_normal.png"));
		label.setBounds(0, 0, 434, 366);

	}
}
