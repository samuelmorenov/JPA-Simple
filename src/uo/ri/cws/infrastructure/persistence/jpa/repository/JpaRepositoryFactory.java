package uo.ri.cws.infrastructure.persistence.jpa.repository;

import uo.ri.cws.application.repository.CertificateRepository;
import uo.ri.cws.application.repository.ClientRepository;
import uo.ri.cws.application.repository.CourseRepository;
import uo.ri.cws.application.repository.DedicationRepository;
import uo.ri.cws.application.repository.InterventionRepository;
import uo.ri.cws.application.repository.InvoiceRepository;
import uo.ri.cws.application.repository.MechanicRepository;
import uo.ri.cws.application.repository.PaymentMeanRepository;
import uo.ri.cws.application.repository.RepositoryFactory;
import uo.ri.cws.application.repository.SparePartRepository;
import uo.ri.cws.application.repository.VehicleRepository;
import uo.ri.cws.application.repository.VehicleTypeRepository;
import uo.ri.cws.application.repository.WorkOrderRepository;

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
