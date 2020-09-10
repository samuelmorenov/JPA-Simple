package cws.application;

import cws.application.service.mechanic.MechanicCrudService;

public interface ServiceFactory {

	MechanicCrudService forMechanicCrudService();

}
