package kodlamaio.src.entities;

public class Instructor {

	private int id;
	private String instructorName;
	private int age;
	private String certificate;

	public Instructor() {
	}

	public Instructor(int id, String instructorName, int age, String certificate) {

		this.id = id;
		this.instructorName = instructorName;
		this.age = age;
		this.certificate = certificate;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	

}
