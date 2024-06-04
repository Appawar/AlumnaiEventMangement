package studentEventModel;

public class StudentAddModel {
 
	
	private int am_id;
	private String am_Name;
	private String am_Contact;
	private String am_Email;
	private int addmission_year;
	private int passing_year;
	public int getAddmission_year() {
		return addmission_year;
	}
	public void setAddmission_year(int addmission_year) {
		this.addmission_year = addmission_year;
	}
	public int getPassing_year() {
		return passing_year;
	}
	public void setPassing_year(int passing_year) {
		this.passing_year = passing_year;
	}
	public int getAm_id() {
		return am_id;
	}
	public void setAm_id(int am_id) {
		this.am_id = am_id;
	}
	public String getAm_Name() {
		return am_Name;
	}
	public void setAm_Name(String am_Name) {
		this.am_Name = am_Name;
	}
	public String getAm_Contact() {
		return am_Contact;
	}
	public void setAm_Contact(String am_Contact) {
		this.am_Contact = am_Contact;
	}
	public String getAm_Email() {
		return am_Email;
	}
	public void setAm_Email(String am_Email) {
		this.am_Email = am_Email;
	}
	public StudentAddModel(int am_id, String am_Name, String am_Contact, String am_Email,int addmission_year, int passing_year) {
		 
		this.am_id = am_id;
		this.am_Name = am_Name;
		this.am_Contact = am_Contact;
		this.am_Email = am_Email;
		this.addmission_year = addmission_year;
		this. passing_year = passing_year;
	}
	public StudentAddModel( ) {
		 
	}
	
	 
  
 
}
