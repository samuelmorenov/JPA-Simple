package ri.cws.application.repository;

import java.util.List;
import java.util.Optional;

import ri.cws.domain.Certificate;

//Added in the extension
public interface CertificateRepository extends Repository<Certificate> {

	List<Certificate> findCertificatesByVehicleTypeId(String id);

	Optional<Certificate> findByMechanicAndVehicleType(String mechanicId, String vehicleTypeId);

}
