package academic.api.controller.attendance;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academic.DTO.AttendanceDTO;
import academic.service.facade.attendance.RegisterAttendanceFacade;

@RestController
@RequestMapping("api/attendance")
public class RegisterAttendanceController {
	private RegisterAttendanceFacade registerAttendanceFacade;
	public void register(@RequestBody AttendanceDTO attendanceDTO) {
		RegisterAttendanceFacade.execute(attendanceDTO);
	}
	

}
