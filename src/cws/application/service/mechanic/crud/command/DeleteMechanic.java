package cws.application.service.mechanic.crud.command;

import java.util.Optional;

import cws.application.repository.MechanicRepository;
import cws.application.service.BusinessException;
import cws.application.util.BusinessCheck;
import cws.application.util.command.Command;
import cws.conf.Factory;
import cws.domain.Mechanic;

public class DeleteMechanic implements Command<Void> {

	private String mechanicId;
	private MechanicRepository mr = Factory.repository.forMechanic();

	public DeleteMechanic(String idMecanico) {
		this.mechanicId = idMecanico;
	}

	/**
	 * @param idMecanico
	 * 
	 * @throws BusinessException if <br>
	 *                           the mechanic does not exist
	 */
	public Void execute() throws BusinessException {

		Optional<Mechanic> om = mr.findById(mechanicId);

		BusinessCheck.isTrue(om.isPresent(), "This mechanic does not exist");

		Mechanic m = om.get();

		mr.remove(m);

		return null;
	}

}
