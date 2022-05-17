package academic.DTO;



public class AttendanceDTO {
	private int id;
	private SessioDTO session;
	private StudentCourseDTO studentCourse;
	private boolean attended;

	
		
	public AttendanceDTO() {
		setId(0);
		setSession(SessioDTO.create());
		setStudentCourse(StudentCourseDTO.create());
		setAttended(false);
		
	}
	public static AttendanceDTO ateAttendanceDTO() {
		return new AttendanceDTO();
	}



	public int getId() {
		return id;
	}



	public AttendanceDTO setId(int id) {
		this.id = (id<0)?0: id;
		return this;
	}



	public SessioDTO getSession() {
		return session;
	}



	public AttendanceDTO setSession(SessioDTO session) {
		this.session = session;
		return this;
	}



	public StudentCourseDTO getStudentCourse() {
		return studentCourse;
	}



	public AttendanceDTO setStudentCourse(StudentCourseDTO studentCourse) {
		this.studentCourse = studentCourse;
		return this;
	}



	public boolean isAttended() {
		return attended;
	}



	public AttendanceDTO setAttended(boolean attended) {
		this.attended = attended;
		return this;
	}




		
	

}
