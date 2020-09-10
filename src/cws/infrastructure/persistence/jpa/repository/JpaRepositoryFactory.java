package cws.infrastructure.persistence.jpa.repository;

import cws.application.repository.MechanicRepository;
import cws.application.repository.RepositoryFactory;

public class JpaRepositoryFactory implements RepositoryFactory {

	@Override
	public MechanicRepository forMechanic() {
		return new MechanicJpaRepository();
	}

}
