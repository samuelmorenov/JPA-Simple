package ri.ui.menu;

import ri.ui.alb.util.menu.BaseMenu;
import ri.ui.menu.action.AddMechanicAction;
import ri.ui.menu.action.DeleteMechanicAction;
import ri.ui.menu.action.ListMechanicsAction;
import ri.ui.menu.action.UpdateMechanicAction;

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
