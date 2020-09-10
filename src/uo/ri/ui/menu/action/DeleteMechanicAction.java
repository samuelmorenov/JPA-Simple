package uo.ri.ui.menu.action;

import uo.ri.cws.application.service.BusinessException;
import uo.ri.cws.application.service.mechanic.MechanicCrudService;
import uo.ri.cws.conf.Factory;
import uo.ri.ui.alb.util.console.Console;
import uo.ri.ui.alb.util.menu.Action;

public class DeleteMechanicAction implements Action {

	@Override
	public void execute() throws BusinessException {
		
		String idMecanico = Console.readString("Mechanic id"); 
		
		MechanicCrudService as = Factory.service.forMechanicCrudService();
		as.deleteMechanic(idMecanico);
		
		Console.println("The mechanic has been removed");
	}

}
