package ri.cws.infrastructure.persistence.jpa.repository;

import ri.cws.application.repository.MechanicRepository;
import ri.cws.application.repository.RepositoryFactory;

public class JpaRepositoryFactory implements RepositoryFactory {

	@Override
	public MechanicRepository forMechanic() {
		return new MechanicJpaRepository();
	}

}
