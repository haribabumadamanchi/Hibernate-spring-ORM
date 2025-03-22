package Com.Madamanchi.Module;

public class Studentdetails {

	private int id;
	private String name;
	private int age;
	private long phonenumber;
	private String email;
	private String branch;
	
	
	public Studentdetails() {
		// TODO Auto-generated constructor stub
	}


	public Studentdetails(int id, String name, int age, long phonenumber, String email, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.email = email;
		this.branch = branch;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
}
