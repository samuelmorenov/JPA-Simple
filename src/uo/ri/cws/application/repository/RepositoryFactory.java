package uo.ri.cws.application.repository;

public interface RepositoryFactory {

	MechanicRepository forMechanic();

	CertificateRepository forCertificate(); // Added in the extension

	VehicleTypeRepository forVehicleType();

}
