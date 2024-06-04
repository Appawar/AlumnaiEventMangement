package studentEventModel;

public class AdminAddModel {
	
	int user_id;
	String user_name;
	String  password ;
	public AdminAddModel(int user_id, String user_name, String password) {
		 
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
	}
	public AdminAddModel( ) {
		 
		 
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
