package academic.DTO;

import javax.security.auth.Subject;

public class CourseDTO {
	private int id;
	private Subject subject;
	private ProfessorDTO profesor;
	
	public CourseDTO () {
		setId(0);
		setSubject(subject);
		setProfesor(ProfessorDTO.create());
		
	}
	
	public static CourseDTO create() {
		return new CourseDTO();
	}
	public int getId() {
		return id;
	}
	public CourseDTO setId(int id) {
		this.id = (id<0)?0: id;
		return this;
	}
	public Subject getSubject() {
		return subject;
	}
	public CourseDTO setSubject(Subject subject) {
		this.subject = subject;
		return this;
	}
	public ProfessorDTO getProfesor() {
		return profesor;
	}
	public CourseDTO setProfesor(ProfessorDTO profesor) {
		this.profesor = profesor;
		return this;
	}
	

}
