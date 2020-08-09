
public class save {
	private String name,username,gender,national_id,password;
	private String destination,origin;
	private int age,contract,date;
	private int id;
	
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
	
	public void setFName(String name) {this.name = name;}
	public String getFName() {return name;}

	public void setPassword(String password) {this.password = password;}
	public String getPassword() {return password;}

	public void setDatee(int date) {this.date = date;	}
	public int getDatee() {return date;}

	public void setOrigin(String origin) {this.origin =origin;}
	public String getOrigin() {return password;}

	public void setUser(String username) {this.username =username;}
	public String getUser() {return username;}

	public void setDestination(String destination) {this.destination = destination;}
	public String getDestination() {return password;}

	public void setContract(int contract) {this.contract = contract;}
	public int getContract() {return contract;}

	public void setNational_id(String national_id) {this.national_id = national_id;}
	public String getNational_id() {return national_id;}

	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}

	public void setGender(String gender) {this.gender = gender;}
	public String getGender() {return gender;}

}
