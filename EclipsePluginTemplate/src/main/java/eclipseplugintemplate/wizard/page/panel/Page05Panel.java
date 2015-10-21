package eclipseplugintemplate.wizard.page.panel;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class Page05Panel extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Page05Panel(Composite parent, int style) {
		super(parent, style);
		
		Label lblW = new Label(this, SWT.NONE);
		lblW.setBounds(47, 42, 311, 17);
		lblW.setText("Wizard Page 5 Panel");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
