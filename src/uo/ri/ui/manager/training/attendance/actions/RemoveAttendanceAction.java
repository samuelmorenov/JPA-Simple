package uo.ri.ui.manager.training.attendance.actions;

import uo.alb.util.console.Console;
import uo.alb.util.menu.Action;
import uo.ri.cws.application.service.training.CourseAttendanceService;
import uo.ri.cws.conf.Factory;

public class RemoveAttendanceAction implements Action {

	@Override
	public void execute() throws Exception {
		// Ask the user for data
		String attId = Console.readString("Attendance id");

		// Invoke the service
		CourseAttendanceService cs = Factory.service.forCourseAttendanceService();
		cs.deleteAttendace( attId );

		// Show result
		Console.println("Course attendance removed");
	}

}
