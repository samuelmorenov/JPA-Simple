package ui.menu.action;

import java.util.Optional;

import cws.application.service.BusinessException;
import cws.application.service.mechanic.MechanicCrudService;
import cws.application.service.mechanic.MechanicDto;
import cws.conf.Factory;
import ui.util.Printer;
import ui.util.console.Console;
import ui.util.menu.Action;

public class UpdateMechanicAction implements Action {

	@Override
	public void execute() throws BusinessException {
		
		// Ask the user for the mechanic id
		String id = Console.readString("Mechanic id"); 
		
		// Invoke the service and show the data
		MechanicCrudService as = Factory.service.forMechanicCrudService();

		Optional<MechanicDto> res = as.findMechanicById(id);
		if ( ! res.isPresent() /* res.isEmpty() */) {
			throw new BusinessException("There is no mechanic with that id");
		}
		MechanicDto m = res.get();
		Printer.printMechanic(m);
		
		// Ask for new data
		m.name = Console.readString("Name"); 
		m.surname = Console.readString("Surname"); // Doi is the identity, cannot be changed
		
		// Update
		as.updateMechanic( m );
		
		// Show the result
		Console.println("The mechanic has been updated");
	}

}
