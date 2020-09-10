package cws.application.service.mechanic.crud;

import java.util.List;
import java.util.Optional;

import cws.application.service.BusinessException;
import cws.application.service.mechanic.MechanicCrudService;
import cws.application.service.mechanic.MechanicDto;
import cws.application.service.mechanic.crud.command.AddMechanic;
import cws.application.service.mechanic.crud.command.DeleteMechanic;
import cws.application.service.mechanic.crud.command.FindAllMechanics;
import cws.application.service.mechanic.crud.command.FindMechanicById;
import cws.application.service.mechanic.crud.command.UpdateMechanic;
import cws.application.util.command.CommandExecutor;
import cws.conf.Factory;

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