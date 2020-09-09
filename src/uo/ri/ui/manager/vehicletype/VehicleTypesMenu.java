package uo.ri.ui.manager.vehicletype;

import uo.alb.util.menu.BaseMenu;
import uo.alb.util.menu.NotYetImplementedAction;

public class VehicleTypesMenu extends BaseMenu {

	public VehicleTypesMenu() {
		menuOptions = new Object[][] { 
			{"Manager > Vehicle types management", null},
			
			{ "Add vehicle type", 	NotYetImplementedAction.class }, 
			{ "Update", 			NotYetImplementedAction.class }, 
			{ "Delete", 			NotYetImplementedAction.class }, 
			{ "List all",			NotYetImplementedAction.class },
		};
	}

}
