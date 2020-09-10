package ri.cws.application.service.mechanic.crud.command;

import java.util.Optional;

import ri.cws.application.repository.MechanicRepository;
import ri.cws.application.service.BusinessException;
import ri.cws.application.service.mechanic.MechanicDto;
import ri.cws.application.util.DtoAssembler;
import ri.cws.application.util.command.Command;
import ri.cws.conf.Factory;
import ri.cws.domain.Mechanic;

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
