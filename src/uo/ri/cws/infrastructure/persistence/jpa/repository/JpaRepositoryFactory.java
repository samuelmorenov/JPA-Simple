package uo.ri.cws.infrastructure.persistence.jpa.repository;

import uo.ri.cws.application.repository.CertificateRepository;
import uo.ri.cws.application.repository.MechanicRepository;
import uo.ri.cws.application.repository.RepositoryFactory;
import uo.ri.cws.application.repository.VehicleTypeRepository;

public class JpaRepositoryFactory implements RepositoryFactory {

	@Override
	public MechanicRepository forMechanic() {
		return new MechanicJpaRepository();
	}

	@Override
	public VehicleTypeRepository forVehicleType() {
		return new VehicleTypeJpaRepository();
	}

	@Override
	public CertificateRepository forCertificate() {
		return new CertificateJpaRepository();
	}

}
