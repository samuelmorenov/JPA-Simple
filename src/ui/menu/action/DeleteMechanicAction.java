package ui.menu.action;

import cws.application.service.BusinessException;
import cws.application.service.mechanic.MechanicCrudService;
import cws.conf.Factory;
import ui.util.console.Console;
import ui.util.menu.Action;

public class DeleteMechanicAction implements Action {

	@Override
	public void execute() throws BusinessException {
		
		String idMecanico = Console.readString("Mechanic id"); 
		
		MechanicCrudService as = Factory.service.forMechanicCrudService();
		as.deleteMechanic(idMecanico);
		
		Console.println("The mechanic has been removed");
	}

}
