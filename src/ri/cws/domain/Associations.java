package ri.cws.domain;

public class Associations {

	public static class Certify {

		public static void link(Mechanic mechanic, Certificate certificate, VehicleType vehicleType) {
			certificate._setMechanic(mechanic);
			certificate._setVehicleType(vehicleType);

			vehicleType._getCertificates().add(certificate);
			mechanic._getCertificates().add(certificate);
		}

		public static void unlink(Certificate certificate) {

			Mechanic mechanic = certificate.getMechanic();
			VehicleType vehicleType = certificate.getVehicleType();

			vehicleType._getCertificates().remove(certificate);
			mechanic._getCertificates().remove(certificate);

			certificate._setMechanic(null);
			certificate._setVehicleType(null);

		}

	}

}
