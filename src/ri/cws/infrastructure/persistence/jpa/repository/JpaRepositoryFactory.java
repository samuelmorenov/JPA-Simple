package ri.cws.infrastructure.persistence.jpa.repository;

import ri.cws.application.repository.CertificateRepository;
import ri.cws.application.repository.MechanicRepository;
import ri.cws.application.repository.RepositoryFactory;
import ri.cws.application.repository.VehicleTypeRepository;

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
