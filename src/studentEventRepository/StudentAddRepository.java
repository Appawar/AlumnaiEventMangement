package studentEventRepository;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import studentEventConfig.DBHelper;
import studentEventConfig.PathHelper;
import studentEventModel.StudentAddModel;

public class StudentAddRepository extends DBHelper {

         private List<StudentAddModel> list = new ArrayList<StudentAddModel>();
	public boolean isAddNewStudent(StudentAddModel samodel) {
		try {
		   stmt=conn.prepareStatement("insert into alumnai values('0',?,?,?,?,?)" );
  		   stmt.setString(1,samodel.getAm_Name());
  		   stmt.setString(2,samodel.getAm_Contact());
  		   stmt.setString(3,samodel.getAm_Email());
  		   stmt.setInt(4,samodel.getAddmission_year());
  		   stmt.setInt(5,samodel.getPassing_year());
  		   int value=stmt.executeUpdate();
  		   return value>0?true:false;
			
		}
		catch(Exception e) {
			System.out.println("Exception in (isAddNewStudent) from StudentAddRepository"+e);
		}
		return false;

	}
	
	public boolean isAddBulkStudent() {
		
		try {
			FileReader f = new FileReader(PathHelper.path+"student.csv");
			BufferedReader fr =new BufferedReader(f);
			
		String line=null;
   		 int value = 0;
   		 
   		 while((line=fr.readLine())!=null) {
   			 
   			 String data[]=line.split(",");
   			 if(data.length>1) {
   			 stmt=conn.prepareStatement("insert into alumnai values('0',?,?,?,?,?)");
   			 stmt.setString(1,data[1]);
   			 stmt.setString(2,data[2]);
   			 stmt.setString(3,data[3]);
   			 stmt.setString(4,data[4]);
   			 stmt.setString(4,data[5]);
   			 
   		     value=stmt.executeUpdate();
   			 }
   			 
   		 }
   		  return value>0?true:false;
   		  
			
		}
		catch(Exception e) {
			System.out.println("Exception in (isAddBulkstudent) from StudentAddRepository"+e);
		}
		return false;
		
	}
	
	public List<StudentAddModel> getallstudent(){
		
		try {
			
			stmt=conn.prepareStatement("select * from alumnai");
			rs=stmt.executeQuery();
			while(rs.next()) {
				
				StudentAddModel model= new StudentAddModel();
				model.setAm_id(rs.getInt(1));
				model.setAm_Name(rs.getString(2));;
				model.setAm_Contact(rs.getString(3));
				model.setAm_Email( rs.getString(4));
				model.setAddmission_year(rs.getInt(5));
				model.setPassing_year(rs.getInt(6));
				list.add(model);
				 
				
				
			}
			return list.size()>0?list:null;
			 
		}
		catch(Exception e) {
			System.out.println("Exception in (getallstudent) from StudentAddRepository"+e);
		}
		return null;
		
	}
	
	public  boolean isupdatealumnai(int id, String contact ) {
		
		try {
			
			stmt = conn.prepareStatement("update alumnai set am_contact=? where  amid=?");
			stmt.setInt(2, id);
			stmt.setString( 1, contact);
			
			
			int value = stmt.executeUpdate();
			
			return value>0?true:false;
			
			
		}
		catch(Exception e) {
			System.out.println("Exception in (isupdatealumnai) from StudentAddRepository"+e);
		}
		return false;
		
	}
public  boolean isupdatealumnai1(int id, String email ) {
		
		try {
			
			stmt = conn.prepareStatement("update alumnai set am_contact=? where  amid=?");
			stmt.setInt(2, id);
			stmt.setString( 1, email);
			
			
			int value = stmt.executeUpdate();
			
			return value>0?true:false;
			
			
		}
		catch(Exception e) {
			System.out.println("Exception in (isupdatealumnai) from StudentAddRepository"+e);
		}
		return false;
		
	}

public boolean isdeletealumnai(int id) {
	
	try {
		
		stmt = conn.prepareStatement("delete from alumnai where amid=?");
		stmt.setInt(1, id);
		
		int value = stmt.executeUpdate();
		
		return value>0?true:false;
		
		
		
	}
	catch(Exception e) {
		System.out.println("Exception in (isdeletealumnai) from StudentAddRepository"+e);
	}
	return false;
	
}
	
	
	
 
	
	
}
