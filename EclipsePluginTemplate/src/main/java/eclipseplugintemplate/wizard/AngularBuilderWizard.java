package eclipseplugintemplate.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import eclipseplugintemplate.wizard.page.WizardPage02;
import eclipseplugintemplate.wizard.page.WizardPage03;

public class AngularBuilderWizard extends Wizard implements INewWizard {
	
	WizardNewProjectCreationPage page01 = new WizardNewProjectCreationPage("");
	WizardPage02 page02 = new WizardPage02("");
	WizardPage03 page03 = new WizardPage03("");

	public AngularBuilderWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		addPage(page01);
		addPage(page02);
		addPage(page03);
	}

	
	@Override
	public boolean canFinish() {
	return 	this.getContainer().getCurrentPage().getClass().getSimpleName().equals("WizardPage03");

	}
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
