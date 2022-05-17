package academic.DTO;

import java.sql.Date;
import java.util.Calendar;

public class SessioDTO {

	private int id;
	private CourseDTO course;
	private Date date; 
	
	
	public SessioDTO () {
		setId(0);
		setCourse(CourseDTO.create());
		setDate(date);
		
		
	}
	public static SessioDTO create() {
		return new SessioDTO();
	}
	
	public int getId() {
		return id;
	}
	public SessioDTO setId(int id) {
		this.id = (id<0)?0: id;
		return this;
	}
	public CourseDTO getCourse() {
		return course;
	}
	public SessioDTO setCourse(CourseDTO course) {
		this.course = course;
		return this;

	}
	public Date getDate() {
		return date;
	}
	public SessioDTO setDate(Date date) {
		this.date = date;
		return this;

	}
	
}
