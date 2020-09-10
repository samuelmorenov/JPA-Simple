package ri.cws.application.service.mechanic.crud;

import java.util.List;
import java.util.Optional;

import ri.cws.application.service.BusinessException;
import ri.cws.application.service.mechanic.MechanicCrudService;
import ri.cws.application.service.mechanic.MechanicDto;
import ri.cws.application.service.mechanic.crud.command.AddMechanic;
import ri.cws.application.service.mechanic.crud.command.DeleteMechanic;
import ri.cws.application.service.mechanic.crud.command.FindAllMechanics;
import ri.cws.application.service.mechanic.crud.command.FindMechanicById;
import ri.cws.application.service.mechanic.crud.command.UpdateMechanic;
import ri.cws.application.util.command.CommandExecutor;
import ri.cws.conf.Factory;

public class MechanicCrudServiceImpl implements MechanicCrudService {

	private CommandExecutor executor = Factory.executor.forExecutor();

	@Override
	public MechanicDto addMechanic(MechanicDto mecanico) throws BusinessException {
		return executor.execute(new AddMechanic(mecanico));
	}

	@Override
	public void updateMechanic(MechanicDto mecanico) throws BusinessException {
		executor.execute(new UpdateMechanic(mecanico));
	}

	@Override
	public void deleteMechanic(String idMecanico) throws BusinessException {
		executor.execute(new DeleteMechanic(idMecanico));
	}

	@Override
	public List<MechanicDto> findAllMechanics() throws BusinessException {
		return executor.execute(new FindAllMechanics());
	}

	@Override
	public Optional<MechanicDto> findMechanicById(String id) throws BusinessException {
		return executor.execute(new FindMechanicById(id));
	}

}