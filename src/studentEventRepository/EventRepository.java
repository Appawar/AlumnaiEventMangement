package studentEventRepository;

import studentEventConfig.DBHelper;
import studentEventModel.AddEventModel;

public class EventRepository extends DBHelper{
	
	AddEventModel model = new AddEventModel();
	
	public boolean isAddEvent(AddEventModel model) {
		
		try {
			
			stmt=conn.prepareStatement("insert into event values");
			
		}
		catch(Exception ex) {
			
			System.out.println("Exception is in(isAddEvent) in EventRepo"+ex);
			
		}
		return false;
	
		
		
	}

}
