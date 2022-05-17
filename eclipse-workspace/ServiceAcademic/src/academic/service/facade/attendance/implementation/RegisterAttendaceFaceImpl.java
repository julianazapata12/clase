package academic.service.facade.attendance.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import academic.DTO.AttendanceDTO;
import academic.service.facade.attendance.RegisterAttendanceFacade;
import academic.service.usecase.attendance.RegisterAttendanceImpl;

@Service
@Transactional
public class RegisterAttendaceFaceImpl  implements RegisterAttendanceFacade{
	@Autowired
	private RegisterAttendance registerAttendance;

	@Override
	public void execute(Attendance dto) {
		registerAttendanceDomain = null;
		registerAttendance.execute(domain); 
		
	}

	

}
