package uo.ri.ui;

import uo.alb.util.menu.BaseMenu;
import uo.ri.ui.manager.mechanic.MechanicsMenu;
import uo.ri.ui.manager.sparepart.SparepartsMenu;
import uo.ri.ui.manager.training.TrainingMenu;
import uo.ri.ui.manager.vehicletype.VehicleTypesMenu;

public class MainMenu extends BaseMenu {{
		menuOptions = new Object[][] { 
			{ "Manager", null },
			
			{ "Mechanics management", 		MechanicsMenu.class },
			{ "Spareparts management", 		SparepartsMenu.class },
			{ "Vehicle types management", 	VehicleTypesMenu.class }, 
			{ "Training management", 		TrainingMenu.class }, 
		};
}}