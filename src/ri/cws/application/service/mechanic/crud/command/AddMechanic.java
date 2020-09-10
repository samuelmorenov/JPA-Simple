package ri.cws.application.service.mechanic.crud.command;

import ri.cws.application.repository.MechanicRepository;
import ri.cws.application.service.BusinessException;
import ri.cws.application.service.mechanic.MechanicDto;
import ri.cws.application.util.BusinessCheck;
import ri.cws.application.util.command.Command;
import ri.cws.conf.Factory;
import ri.cws.domain.Mechanic;

public class AddMechanic implements Command<MechanicDto> {

	private MechanicDto dto;
	private MechanicRepository mr = Factory.repository.forMechanic();

	public AddMechanic(MechanicDto mecanico) {
		this.dto = mecanico;
	}

	/**
	 * Add a new mechanic to the system with the data specified in the dto. The id
	 * value will be ignored
	 * 
	 * @param mecanico dto
	 * @return the dto with the id filed updated to the UUID generated
	 * 
	 * @throws BusinessException if <br>
	 *                           there already exist another mechanic with the same
	 *                           dni
	 */
	public MechanicDto execute() throws BusinessException {

		BusinessCheck.isNotNull(dto.dni);
		BusinessCheck.isNotNull(dto.name);
		BusinessCheck.isNotNull(dto.surname);

		Mechanic m = new Mechanic(dto.dni, dto.name, dto.surname);

		BusinessCheck.isFalse(mr.findByDni(dto.dni).isPresent(),
				"There already exist another mechanic with the same dni");

		mr.add(m);

		dto.id = m.getId();

		return dto;
	}

}
