package academic.DTO;

public class StudentDTO {
	private int id;
	private IdTypeDTO idType;
	private String name;
	
	public StudentDTO () {
		setId(0);
		setName("");
		setIdType(IdTypeDTO.create());
		
	}
	public static StudentDTO create() {
		return new StudentDTO();
	}
	public int getId() {
		return id;
	}
	public StudentDTO setId(int id) {
		this.id = (id<0)?0: id;
		return this;
	}
	public IdTypeDTO getIdType() {
		return idType;
	}
	public StudentDTO setIdType(IdTypeDTO idType) {
		this.idType = idType;
		return this;
	}
	public String getName() {
		return name;
	}
	public StudentDTO setName(String name) {
		this.name = (name == null)? "": name.trim();
		return this;
	}
	
	

}
