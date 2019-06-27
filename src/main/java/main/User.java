package main;

public class User {
	
	private int id;
	
	private int age;
	
	private String gender;
	
	private int occupation_id;
	
	private String zip_code;

	public User(int id, int age, String gender, int occupation_id, String zip_code) {
		super();
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.occupation_id = occupation_id;
		this.zip_code = zip_code;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", gender=" + gender + ", occupation_id=" + occupation_id
				+ ", zip_code=" + zip_code + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getOccupation_id() {
		return occupation_id;
	}

	public void setOccupation_id(int occupation_id) {
		this.occupation_id = occupation_id;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	

}
