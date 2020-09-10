package ri.cws.application.service.mechanic.crud.command;

import java.util.List;

import ri.cws.application.repository.MechanicRepository;
import ri.cws.application.service.mechanic.MechanicDto;
import ri.cws.application.util.DtoAssembler;
import ri.cws.application.util.command.Command;
import ri.cws.conf.Factory;
import ri.cws.domain.Mechanic;

public class FindAllMechanics implements Command<List<MechanicDto>> {

	private MechanicRepository mr = Factory.repository.forMechanic();

	public List<MechanicDto> execute() {
		List<Mechanic> ms = mr.findAll();
		return DtoAssembler.toMechanicDtoList(ms);
	}

}
