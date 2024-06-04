package studentEventService;

import studentEventModel.AdminAddModel;
import studentEventRepository.AdminRepository;

public class AdminService {
	
	AdminRepository addRepo = new AdminRepository();
	
	public boolean isAddAdmin(AdminAddModel model) {
		
		return addRepo.isAddAdmin(model);
	}
	public int getuserBypassword(String password) {
		
		return addRepo.getuserBypassword(password);
	}
	
	public int getuserByusername( String userName) {
		return addRepo.getuserByusername(userName);
		
	}

}
