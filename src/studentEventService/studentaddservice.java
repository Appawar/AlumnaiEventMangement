package studentEventService;

import java.util.List;

import studentEventModel.StudentAddModel;
import studentEventRepository.StudentAddRepository;


public class studentaddservice {

	StudentAddRepository stuRepo = new StudentAddRepository();

	public boolean isAddNewStudent(StudentAddModel samodel) {

		return stuRepo.isAddNewStudent(samodel);

	}
	
	public boolean isAddBulkStudent() {
		return stuRepo.isAddBulkStudent();
	 
	}
	public List<StudentAddModel> getallstudent(){
		return  stuRepo.getallstudent();
	
	}
	public  boolean isupdatealumnai(int id, String contact ) {
		
		return stuRepo.isupdatealumnai(id, contact);
	}
	
	public  boolean isupdatealumnai1(int id, String email ) {
		return stuRepo.isupdatealumnai1(id, email);
	
	}
	public boolean isdeletealumnai(int id) {
		return stuRepo.isdeletealumnai(id);
		
	}

}
