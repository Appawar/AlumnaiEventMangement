package studentEventRepository;

import studentEventConfig.DBHelper;
import studentEventModel.AdminAddModel;

public class AdminRepository extends DBHelper {
	
	
	public boolean isAddAdmin(AdminAddModel model) {
		
		try {
			
			stmt=conn.prepareStatement("insert into Admin values('0',?,?)");
			stmt.setString(1,model.getUser_name());
			stmt.setString(2,model.getPassword());
			
			int value = stmt.executeUpdate();
			
			return value>0?true:false;
			
		}
		catch(Exception e){
			System.out.println("Exception in (isAddAdmin) from AdminRepository"+e);
		}
		return false;
		
	}
	
	public int getuserBypassword( String password) {
		
		try {
			stmt=conn.prepareStatement("Select user_id from Admin where   password=?");
			stmt.setString(1, password);
			rs=stmt.executeQuery( );
			 if(rs.next()) {
    			 
    			 return  rs.getInt(1);
    		 }
    		 else {
    			 return -1;  
    		 }
    		 
			
			
			
			
		}catch(Exception e){
			System.out.println("Exception in (isAddAdmin) from AdminRepository"+e);
			return -1;
		}
		
		 
		
		 
		
	}
	
public int getuserByusername( String userName) {
		
		try {
			stmt=conn.prepareStatement("Select user_id from Admin where   user_name =?");
			stmt.setString(1,userName);
			rs=stmt.executeQuery( );
			 if(rs.next()) {
    			 
    			 return  rs.getInt(1);
    		 }
    		 else {
    			    return -1;
    		 }
    		 
			
			
			
			
		}catch(Exception e){
			System.out.println("Exception in (isAddAdmin) from AdminRepository"+e);
			return -1;
		}
		
		 
		
		 
		
	}

}
