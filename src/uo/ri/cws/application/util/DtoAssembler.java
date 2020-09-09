package uo.ri.cws.application.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import uo.ri.cws.application.service.mechanic.MechanicDto;
import uo.ri.cws.application.service.training.CertificateDto;
import uo.ri.cws.application.service.vehicletype.VehicleTypeDto;
import uo.ri.cws.domain.Certificate;
import uo.ri.cws.domain.Mechanic;
import uo.ri.cws.domain.VehicleType;

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

	public static List<CertificateDto> toCertificateDtoList(List<Certificate> list) {
		return list.stream().map(a -> toDto(a)).collect(Collectors.toList());
	}

	public static CertificateDto toDto(Certificate c) {
		CertificateDto dto = new CertificateDto();
		dto.id = c.getId();
		dto.version = c.getVersion();

		dto.mechanic = toDto(c.getMechanic());
		dto.vehicleType = toDto(c.getVehicleType());
		dto.obtainedAt = c.getDate();

		return dto;
	}

	public static VehicleTypeDto toDto(VehicleType vt) {
		VehicleTypeDto dto = new VehicleTypeDto();

		dto.id = vt.getId();
		dto.version = vt.getVersion();

		dto.name = vt.getName();
		dto.pricePerHour = vt.getPricePerHour();
		dto.minTrainigHours = vt.getMinTrainingHours();

		return dto;
	}

	public static List<VehicleTypeDto> toVehicleTypeDtoList(List<VehicleType> list) {
		return list.stream().map(a -> toDto(a)).collect(Collectors.toList());
	}

}
