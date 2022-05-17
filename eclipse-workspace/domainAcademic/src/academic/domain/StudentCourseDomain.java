package academic.domain;

public class StudentCourseDomain {
	
	private int id;
	private StudentDomain student;
	private CourseDomain course;
	public StudentCourseDomain(int id, StudentDomain student, CourseDomain course) {
		super();
		setId(id);
		setStudent(student);
		setCourse(course);
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public StudentDomain getStudent() {
		return student;
	}
	private void setStudent(StudentDomain student) {
		this.student = student;
	}
	public CourseDomain getCourse() {
		return course;
	}
	private void setCourse(CourseDomain course) {
		this.course = course;
	}
	
	
}
