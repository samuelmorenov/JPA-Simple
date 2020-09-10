package ri.cws.application;

import ri.cws.application.service.mechanic.MechanicCrudService;

public interface ServiceFactory {

	MechanicCrudService forMechanicCrudService();

}
