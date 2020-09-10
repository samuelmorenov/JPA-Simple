package cws.application.service.mechanic.crud.command;

import java.util.Optional;

import cws.application.repository.MechanicRepository;
import cws.application.service.BusinessException;
import cws.application.service.mechanic.MechanicDto;
import cws.application.util.DtoAssembler;
import cws.application.util.command.Command;
import cws.conf.Factory;
import cws.domain.Mechanic;

public class FindMechanicById implements Command<Optional<MechanicDto>> {

	private String id;
	private MechanicRepository mr = Factory.repository.forMechanic();

	public FindMechanicById(String id) {
		this.id = id;
	}

	public Optional<MechanicDto> execute() throws BusinessException {

		Optional<Mechanic> om = mr.findById(id);
		return om.isPresent() ? Optional.of(DtoAssembler.toDto(om.get())) : Optional.empty();
	}

}
