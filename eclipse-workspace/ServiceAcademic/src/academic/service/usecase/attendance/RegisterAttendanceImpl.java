package academic.service.usecase.attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.domain.AttendanceDomain;
import academic.entity.AttendanceEntity;
import academic.persistence.dao.attendance.AttendanceRepository;

@Service
public class RegisterAttendanceImpl implements RegistterAttendance {
	@Autowired
	private  AttendanceRepository attendaceRepository;
	

	@Override
	public void execute(AttendanceDomain domain) {

		// Business Logic
		//1. diagrama de actividades
		
		AttendanceEntity attendanceEntity= null;
		attendaceRepository.save(attendanceEntity);
		
	}

}
