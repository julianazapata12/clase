package academic.domain;

public class AttendanceDomain {
	private int id;
	private SessioDomain session;
	private StudentCourseDomain studentCourse;
	private boolean attended;
	public AttendanceDomain(int id, SessioDomain session, StudentCourseDomain studentCourse, boolean attended) {
		super();
		setAttended(attended);
		setSession(session);
		setStudentCourse(studentCourse);
		setAttended(attended);
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public SessioDomain getSession() {
		return session;
	}
	private void setSession(SessioDomain session) {
		this.session = session;
	}
	public StudentCourseDomain getStudentCourse() {
		return studentCourse;
	}
	private void setStudentCourse(StudentCourseDomain studentCourse) {
		this.studentCourse = studentCourse;
	}
	public boolean isAttended() {
		return attended;
	}
	private void setAttended(boolean attended) {
		this.attended = attended;
	}
	
	
	
	

}
