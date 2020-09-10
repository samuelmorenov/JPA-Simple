package ri.ui.menu.action;

import ri.cws.application.service.BusinessException;
import ri.cws.application.service.mechanic.MechanicCrudService;
import ri.cws.application.service.mechanic.MechanicDto;
import ri.cws.conf.Factory;
import ri.ui.alb.util.console.Console;
import ri.ui.alb.util.menu.Action;

public class AddMechanicAction implements Action {

	@Override
	public void execute() throws BusinessException {

		// Ask the user for data
		MechanicDto m = new MechanicDto();
		m.dni = Console.readString("Doi");
		m.name = Console.readString("Name");
		m.surname = Console.readString("Surname");

		// Invoke the service
		MechanicCrudService as = Factory.service.forMechanicCrudService();
		m = as.addMechanic( m );

		// Show result
		Console.println("New mechanic added: " + m.id);
	}

}
