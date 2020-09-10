package uo.ri.ui.menu;

import uo.ri.ui.alb.util.menu.BaseMenu;
import uo.ri.ui.menu.action.AddMechanicAction;
import uo.ri.ui.menu.action.DeleteMechanicAction;
import uo.ri.ui.menu.action.ListMechanicsAction;
import uo.ri.ui.menu.action.UpdateMechanicAction;

public class Menu extends BaseMenu {

	public Menu() {
		menuOptions = new Object[][] { 
			{"Manager > Mechanics management", null},
			
			{ "Add mechanic", 		AddMechanicAction.class }, 
			{ "Update mechanic", 	UpdateMechanicAction.class }, 
			{ "Disable mechanic", 	DeleteMechanicAction.class }, 
			{ "List mechanics", 	ListMechanicsAction.class },
		};
	}

}
