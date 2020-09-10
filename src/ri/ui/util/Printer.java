package ri.ui.util;

import ri.cws.application.service.mechanic.MechanicDto;
import ri.ui.alb.util.console.Console;

public class Printer {

	public static void printMechanic(MechanicDto m) {

		Console.printf("\t%s %-10.10s %-15.15s %-25.25s\n"
				, m.id
				, m.dni
				, m.name
				, m.surname
			);
	}

}
