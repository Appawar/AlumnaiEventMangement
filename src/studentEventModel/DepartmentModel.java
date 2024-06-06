package studentEventModel;

import java.util.List;

 

public class DepartmentModel {
       
	 private int D_id ;
	 private String D_name;
	 private String H_name;
	 private List<AddEventModel> list;
	public List<AddEventModel> getList() {
		return list;
	}
	public void setList(List<AddEventModel> list) {
		this.list = list;
	}
	public int getD_id() {
		return D_id;
	}
	public void setD_id(int d_id) {
		D_id = d_id;
	}
	public String getD_name() {
		return D_name;
	}
	public String setD_name(String d_name) {
		return D_name = d_name;
	}
	public String getH_name() {
		return H_name;
	}
	public String setH_name(String h_name) {
		return H_name = h_name;
	}
	public DepartmentModel(int d_id, String d_name, String h_name,List list) {
		 
		D_id = d_id;
		D_name = d_name;
		H_name = h_name;
		list = list;
	}
	
	public DepartmentModel() {
		 
		 
	}
}
