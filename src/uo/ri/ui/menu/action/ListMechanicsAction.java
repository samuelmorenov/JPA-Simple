package uo.ri.ui.menu.action;

import java.util.List;

import uo.ri.cws.application.service.BusinessException;
import uo.ri.cws.application.service.mechanic.MechanicCrudService;
import uo.ri.cws.application.service.mechanic.MechanicDto;
import uo.ri.cws.conf.Factory;
import uo.ri.ui.alb.util.console.Console;
import uo.ri.ui.alb.util.menu.Action;
import uo.ri.ui.util.Printer;

public class ListMechanicsAction implements Action {

	@Override
	public void execute() throws BusinessException {

		MechanicCrudService as = Factory.service.forMechanicCrudService();
		List<MechanicDto> mechanics = as.findAllMechanics();

		Console.println("\nList of mechanics\n");
		mechanics.forEach( m ->
			Printer.printMechanic( m )
		);

	}
}
