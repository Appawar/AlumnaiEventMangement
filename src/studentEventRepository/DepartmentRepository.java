package studentEventRepository;


import java.util.ArrayList;


import java.util.List;

 

import studentEventConfig.DBHelper;
import studentEventModel.AddEventModel;
import studentEventModel.DepartmentModel;


public class DepartmentRepository extends DBHelper {

	DepartmentModel model = new DepartmentModel();
	ArrayList<DepartmentModel> list = new ArrayList<DepartmentModel>();

	public boolean isAddDepartment(DepartmentModel model) {

		try {
			stmt = conn.prepareStatement("insert into department values('0',?,?)");
			stmt.setString(1, model.getD_name());
			stmt.setString(2, model.getH_name());
			int value = stmt.executeUpdate();
			 
			return value>0?true:false;
		} catch (Exception e) {

			System.out.println("Exception in (isAddDepartment) in DepartmentRepository" + e);
			 
		}
		
		return true;

	}

	public List<DepartmentModel> getallDepart() {

		try {
			stmt = conn.prepareStatement("select * from department");
			rs = stmt.executeQuery();
			while (rs.next()) {

				DepartmentModel model = new DepartmentModel();
				model.setD_id(rs.getInt(1));
				model.setD_name(rs.getString(2));
				model.setH_name(rs.getString(3));

				list.add(model);

			}

			return list.size() > 0 ? list : null;

		} catch (Exception e) {

			System.out.println("Exception in (getallDepart) in DepartmentRepository" + e);
			return null;
		}

	}

	public int getDepById(String D_name) {

		try {
			stmt = conn.prepareStatement("Select D_id from  department where   D_name=?");
			stmt.setString(1, D_name);
			rs = stmt.executeQuery();
			if (rs.next()) {

				return rs.getInt(1);
			} else {
				return -1;
			}

		} catch (Exception e) {
			System.out.println("Exception in (getDepById) from DepartmentRepository  " + e);
			return -1;
		}

	}

}
