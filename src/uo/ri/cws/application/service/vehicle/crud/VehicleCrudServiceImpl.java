package uo.ri.cws.application.service.vehicle.crud;

import java.util.Optional;

import uo.ri.cws.application.service.BusinessException;
import uo.ri.cws.application.service.vehicle.VehicleCrudService;
import uo.ri.cws.application.service.vehicle.VehicleDto;
import uo.ri.cws.application.service.vehicle.crud.commands.FindVehicleByPlate;
import uo.ri.cws.application.util.command.CommandExecutor;
import uo.ri.cws.conf.Factory;

public class VehicleCrudServiceImpl implements VehicleCrudService {

    private CommandExecutor executor = Factory.executor.forExecutor();

    @Override
    public Optional<VehicleDto> findVehicleByPlate(String plate)
	    throws BusinessException {
	return executor.execute(new FindVehicleByPlate(plate));
    }

}
