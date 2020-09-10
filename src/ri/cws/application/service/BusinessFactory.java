package ri.cws.application.service;

import ri.cws.application.ServiceFactory;
import ri.cws.application.service.mechanic.MechanicCrudService;
import ri.cws.application.service.mechanic.crud.MechanicCrudServiceImpl;

public class BusinessFactory implements ServiceFactory {

	@Override
	public MechanicCrudService forMechanicCrudService() {
		return new MechanicCrudServiceImpl();
	}



}
