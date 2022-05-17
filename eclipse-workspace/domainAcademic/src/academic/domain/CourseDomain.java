package academic.domain;

import javax.security.auth.Subject;

public class CourseDomain {
	private int id;
	private Subject subject;
	private ProfessorDomain profesor;
	
	public CourseDomain(int id, Subject subject, ProfessorDomain profesor) {
		super();
		setId(id);
		setSubject(subject);
		setProfesor(profesor);
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public Subject getSubject() {
		return subject;
	}
	private void setSubject(Subject subject) {
		this.subject = subject;
	}
	public ProfessorDomain getProfesor() {
		return profesor;
	}
	private void setProfesor(ProfessorDomain profesor) {
		this.profesor = profesor;
	}
	
	

}
