package uo.ri.ui.manager.training.course.actions;

import uo.alb.util.console.Console;
import uo.alb.util.menu.Action;
import uo.ri.cws.application.service.BusinessException;
import uo.ri.cws.application.service.training.CourseCrudService;
import uo.ri.cws.conf.Factory;

public class RemoveCourseAction implements Action {

	@Override
	public void execute() throws BusinessException {

		// Ask the user for data
		String cId = Console.readString("Course id");

		// Invoke the service
		CourseCrudService cs = Factory.service.forCourseCrudService();
		cs.deleteCourse( cId );

		// Show result
		Console.println("Course removed");
	}

}
