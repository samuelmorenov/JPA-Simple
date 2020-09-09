package uo.ri.ui.manager.training.attendance.actions;

import java.util.List;

import uo.alb.util.menu.Action;
import uo.ri.cws.application.service.training.CourseAttendanceService;
import uo.ri.cws.application.service.training.EnrollmentDto;
import uo.ri.cws.conf.Factory;
import uo.ri.ui.util.Printer;

public class ListAttendanceToCourseAction implements Action {

	private AttendanceUserInteractor user = new AttendanceUserInteractor();
	
	@Override
	public void execute() throws Exception {
		String cId = user.askForCourseId();

		CourseAttendanceService s = Factory.service.forCourseAttendanceService();
		List<EnrollmentDto> attendance = s.findAttendanceByCourseId( cId );

		attendance.forEach( att -> Printer.printAttendingMechanic(att) );
	}

}
