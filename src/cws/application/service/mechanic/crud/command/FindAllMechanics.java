package cws.application.service.mechanic.crud.command;

import java.util.List;

import cws.application.repository.MechanicRepository;
import cws.application.service.mechanic.MechanicDto;
import cws.application.util.DtoAssembler;
import cws.application.util.command.Command;
import cws.conf.Factory;
import cws.domain.Mechanic;

public class FindAllMechanics implements Command<List<MechanicDto>> {

	private MechanicRepository mr = Factory.repository.forMechanic();

	public List<MechanicDto> execute() {
		List<Mechanic> ms = mr.findAll();
		return DtoAssembler.toMechanicDtoList(ms);
	}

}
