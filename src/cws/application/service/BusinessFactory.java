package cws.application.service;

import cws.application.ServiceFactory;
import cws.application.service.mechanic.MechanicCrudService;
import cws.application.service.mechanic.crud.MechanicCrudServiceImpl;

public class BusinessFactory implements ServiceFactory {

	@Override
	public MechanicCrudService forMechanicCrudService() {
		return new MechanicCrudServiceImpl();
	}



}
