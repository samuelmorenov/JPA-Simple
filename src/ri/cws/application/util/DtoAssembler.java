package ri.cws.application.util;

import java.util.ArrayList;
import java.util.List;
import ri.cws.application.service.mechanic.MechanicDto;
import ri.cws.domain.Mechanic;

public class DtoAssembler {

	public static MechanicDto toDto(Mechanic m) {
		MechanicDto dto = new MechanicDto();
		dto.id = m.getId();
		dto.version = m.getVersion();

		dto.dni = m.getDni();
		dto.name = m.getName();
		dto.surname = m.getSurname();
		return dto;
	}

	public static List<MechanicDto> toMechanicDtoList(List<Mechanic> list) {
		List<MechanicDto> res = new ArrayList<>();
		for (Mechanic m : list) {
			res.add(toDto(m));
		}
		return res;
	}

}
