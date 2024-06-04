package studentEventService;

import studentEventModel.AddEventModel;
import studentEventRepository.EventRepository;

public class EventService {
	
	EventRepository Evrepo = new EventRepository();
	
	public boolean isAddEvent(AddEventModel model) {
		
		return Evrepo.isAddEvent(model);
	}

}
