package uo.ri.ui.manager.mechanic.action;

import uo.alb.util.console.Console;
import uo.alb.util.menu.Action;
import uo.ri.cws.application.service.BusinessException;
import uo.ri.cws.application.service.mechanic.MechanicCrudService;
import uo.ri.cws.conf.Factory;

public class DeleteMechanicAction implements Action {

	@Override
	public void execute() throws BusinessException {
		
		String idMecanico = Console.readString("Mechanic id"); 
		
		MechanicCrudService as = Factory.service.forMechanicCrudService();
		as.deleteMechanic(idMecanico);
		
		Console.println("The mechanic has been removed");
	}

}
