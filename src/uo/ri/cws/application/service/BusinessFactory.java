package uo.ri.cws.application.service;

import uo.ri.cws.application.ServiceFactory;
import uo.ri.cws.application.service.mechanic.MechanicCrudService;
import uo.ri.cws.application.service.mechanic.crud.MechanicCrudServiceImpl;
import uo.ri.cws.application.service.training.CertificateService;
import uo.ri.cws.application.service.training.certificate.CertificateServiceImpl;
import uo.ri.cws.application.service.vehicletype.VehicleTypeCrudService;

public class BusinessFactory implements ServiceFactory {

	@Override
	public MechanicCrudService forMechanicCrudService() {
		return new MechanicCrudServiceImpl();
	}

	@Override
	public CertificateService forCertificateService() {
		return new CertificateServiceImpl();
	}

	@Override
	public VehicleTypeCrudService forVehicleTypeCrudService() {
		throw new RuntimeException("Not yet implemented");
	}

}
