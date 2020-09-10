package ui.menu;

import ui.menu.action.AddMechanicAction;
import ui.menu.action.DeleteMechanicAction;
import ui.menu.action.ListMechanicsAction;
import ui.menu.action.UpdateMechanicAction;
import ui.util.menu.BaseMenu;

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
