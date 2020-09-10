package ri.cws.application.repository;

import java.util.List;

import ri.cws.domain.VehicleType;

public interface VehicleTypeRepository extends Repository<VehicleType> {

	List<VehicleType> findAll();

}
