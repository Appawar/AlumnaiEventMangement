package studentEventModel;

public class AddEventModel extends DepartmentModel{
	
	private int  E_id;
	private String E_name;
	private String E_place;
	private String E_date;
	
	public int getE_id() {
	 return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public String getE_place() {
		return E_place;
	}
	public void setE_place(String e_place) {
		E_place = e_place;
	}
	public String getE_date() {
		return E_date;
	}
	public void setE_date(String e_date) {
		E_date = e_date;
	}
	public AddEventModel(int e_id, String e_name, String e_place, String e_date) {
		 
		E_id = e_id;
		E_name = e_name;
		E_place = e_place;
		E_date = e_date;
	}
	
	public AddEventModel( ) {
		 
		 
	}
	
	
	
	

}
