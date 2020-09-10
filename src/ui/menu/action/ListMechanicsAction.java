package ui.menu.action;

import java.util.List;

import cws.application.service.BusinessException;
import cws.application.service.mechanic.MechanicCrudService;
import cws.application.service.mechanic.MechanicDto;
import cws.conf.Factory;
import ui.util.Printer;
import ui.util.console.Console;
import ui.util.menu.Action;

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
