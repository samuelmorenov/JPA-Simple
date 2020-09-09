package uo.ri.cws.application;

import uo.ri.cws.application.service.mechanic.MechanicCrudService;
import uo.ri.cws.application.service.training.CertificateService;
import uo.ri.cws.application.service.vehicletype.VehicleTypeCrudService;

public interface ServiceFactory {

    // Manager use cases
    VehicleTypeCrudService forVehicleTypeCrudService();

    MechanicCrudService forMechanicCrudService();

    CertificateService forCertificateService();

}
