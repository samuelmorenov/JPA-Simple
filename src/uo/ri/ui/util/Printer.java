package uo.ri.ui.util;

import uo.ri.cws.application.service.mechanic.MechanicDto;
import uo.ri.cws.application.service.training.CertificateDto;
import uo.ri.cws.application.service.training.TrainingForMechanicRow;
import uo.ri.cws.application.service.training.TrainingHoursRow;
import uo.ri.cws.application.service.vehicletype.VehicleTypeDto;
import uo.ri.ui.alb.util.console.Console;

public class Printer {

	public static void printMechanic(MechanicDto m) {

		Console.printf("\t%s %-10.10s %-15.15s %-25.25s\n"
				, m.id
				, m.dni
				, m.name
				, m.surname
			);
	}

	public static void printVehicleType(VehicleTypeDto vt) {

		Console.printf("\t%s %-10.10s %5.2f %d\n"
				, vt.id
				, vt.name
				, vt.pricePerHour
				, vt.minTrainigHours
			);
	}

	public static void printTrainingForMechanic(TrainingForMechanicRow row) {

		Console.printf("\t%-20.20s\t%d\t%d\n"
					, row.vehicleTypeName
					, row.enrolledHours
					, row.attendedHours
		);

	}

	public static void printTrainingHoursRow(TrainingHoursRow r) {

		Console.printf("%-20.20s\t%-30.30s\t%d hours\n"
				, r.vehicleTypeName
				, r.mechanicFullName
				, r.enrolledHours);
	}

	public static void printCertificateRow(CertificateDto r) {

		Console.printf("%-20.20s\t%-30.30s\t from %td/%<tm/%<tY\n"
				, r.vehicleType.name
				, r.mechanic.surname + ", " + r.mechanic.name
				, r.obtainedAt);
	}

}
