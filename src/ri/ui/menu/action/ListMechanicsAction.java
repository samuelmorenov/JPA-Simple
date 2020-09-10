package ri.ui.menu.action;

import java.util.List;

import ri.cws.application.service.BusinessException;
import ri.cws.application.service.mechanic.MechanicCrudService;
import ri.cws.application.service.mechanic.MechanicDto;
import ri.cws.conf.Factory;
import ri.ui.alb.util.console.Console;
import ri.ui.alb.util.menu.Action;
import ri.ui.util.Printer;

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
