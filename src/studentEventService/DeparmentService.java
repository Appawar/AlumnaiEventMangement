package studentEventService;

import java.util.List;

import studentEventModel.DepartmentModel;
import studentEventRepository.DepartmentRepository;

public class DeparmentService {
	
	DepartmentRepository Drepo = new DepartmentRepository();
	
	public boolean isAddDepartment(DepartmentModel model) {
		
		return Drepo.isAddDepartment(model);
	}
	
	public List<DepartmentModel> getallDepart(){
		return Drepo.getallDepart();
	}

	 
}
