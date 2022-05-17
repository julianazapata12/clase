package academic.domain;

import java.sql.Date;

public class SessioDomain {

	private int id;
	private CourseDomain course;
	private Date date;
	public SessioDomain(int id, CourseDomain course, Date date) {
		super();
		setId(id);
		setCourse(course);
		setDate(date);
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public CourseDomain getCourse() {
		return course;
	}
	private void setCourse(CourseDomain course) {
		this.course = course;
	}
	public Date getDate() {
		return date;
	}
	private void setDate(Date date) {
		this.date = date;
	} 
	
	
}
