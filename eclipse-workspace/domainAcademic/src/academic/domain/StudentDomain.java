package academic.domain;

public class StudentDomain {
	private int id;
	private IdTypeDomain idType;
	private String name;
	public StudentDomain(int id, IdTypeDomain idType, String name) {
		super();
		setId(id);
		setIdType(idType);
		setName(name);
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public IdTypeDomain getIdType() {
		return idType;
	}
	private void setIdType(IdTypeDomain idType) {
		this.idType = idType;
	}
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	
	

}
