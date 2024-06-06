package studentEventRepository;

import studentEventConfig.DBHelper;
import studentEventModel.AddEventModel;

public class EventRepository extends DBHelper{
	
	AddEventModel model = new AddEventModel();
	
	public boolean isAddEvent(AddEventModel model) {
		
		try {
			
			stmt=conn.prepareStatement("insert into event values('0',?,?,?)");
			stmt.setString(1,model.getE_name());
			stmt.setString(3,model.getE_place());
			stmt.setString(2, model.getE_date());
			
			int values=stmt.executeUpdate();
			return values>0?true:false;
			
		}
		catch(Exception ex) {
			
			System.out.println("Exception is in(isAddEvent) in EventRepo"+ex);
			return false;
		}
		
	
		
		
	}
	
	public int getEventId(String EventName) {
		try {
			stmt=conn.prepareStatement("Select E_id from event where E_name=?");
			stmt.setString(1, EventName);
			rs=stmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
			else
			{
				return 0;
			}
		}
		catch(Exception ex) {
			
			System.out.println("Error is"+ex);
		}
		return 0;
	}


}
