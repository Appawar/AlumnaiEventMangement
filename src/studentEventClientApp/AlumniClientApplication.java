package studentEventClientApp;

import static java.lang.System.out;

import java.util.*;

import studentEventModel.AdminAddModel;
import studentEventModel.DepartmentModel;
import studentEventModel.StudentAddModel;
import studentEventRepository.StudentAddRepository;
import studentEventService.AdminService;
import studentEventService.DeparmentService;
import studentEventService.studentaddservice;

public class AlumniClientApplication {

	public static void main(String[] args) {

		studentaddservice studSer = new studentaddservice();
		AdminService AddSer = new AdminService();
		DeparmentService Dser = new DeparmentService();

		do {
			Scanner sc = new Scanner(System.in);
			int choice;
			System.out.println("press 1:Add new Admin");
			System.out.println("press 2:login exsting Admin");
			choice = sc.nextInt();
			switch (choice) {

			case 1:

				out.println("Enter username");
				sc.nextLine();
				String userName = sc.nextLine();
				System.out.println("Enter Password");
				String password = sc.nextLine();

				AdminAddModel model1 = new AdminAddModel();
				model1.setUser_name(userName);
				model1.setPassword(password);

				boolean b = AddSer.isAddAdmin(model1);

				if (b) {

					System.out.println("Admin Added succesfully");
				} else {
					System.out.println("some problem is there ");

				}
				break;
			case 2:

				System.out.println("Enter username ");
				sc.nextLine();
				userName = sc.nextLine();
				System.out.println("Enter Password");
				password = sc.nextLine();
				int id1 = AddSer.getuserBypassword(password);
				int id = AddSer.getuserByusername(userName);

				if (id == -1 || id1 == -1) {
					System.out.println("please wright password or username");
				}

				else if (id != -1 && id1 != -1) {

					System.out.println("Press 1: Add New Student ");
					System.out.println("Press 2: Add department ");
					System.out.println("Press 3: Add New Student event ");
					System.out.println("Press 4: Send sms to Student for event ");
					System.out.println("Press 5: take  attandace ");
					System.out.println("Press 6: take  review ");

					choice = sc.nextInt();
					switch (choice) {
					case 1:

						System.out.println("Press 1: Add New Student manualy ");
						System.out.println("Press 2: Add Bulk Student");
						System.out.println("Press 3: View Student");
						System.out.println("Press 4: Update Student");
						System.out.println("Press 5: Delete Student");
						choice = sc.nextInt();
						switch (choice) {

						case 1:
							out.println("Enter student name");
							sc.nextLine();
							String studName = sc.nextLine();
							out.println("Enter student contact");
							String studcont = sc.nextLine();
							out.println("Enter student email");
							String studemail = sc.nextLine();
							out.println("Enter student addmission_year");
							int add_year = sc.nextInt();
							out.println("Enter student passing_year");
							int pass_year = sc.nextInt();

							StudentAddModel model2 = new StudentAddModel();
							model2.setAm_Name(studName);
							model2.setAm_Contact(studcont);
							model2.setAm_Email(studemail);
							model2.setAddmission_year(add_year);
							model2.setPassing_year(pass_year);

							boolean b1 = studSer.isAddNewStudent(model2);
							if (b1) {

								out.println("New alumnai Added In database table");
							} else {

								out.println("alumnai not Added");
							}
							break;

						case 2:
							boolean b2 = studSer.isAddBulkStudent();
							if (b2) {

								out.println("New alumnai Added In database table");
							} else {

								out.println("alumnai not Added");
							}
							break;

						case 3:

							List<StudentAddModel> list = studSer.getallstudent();
							if (list != null) {

								list.forEach((m) -> out.println(m.getAm_id() + "\t" + m.getAm_Name() + "\t"
										+ m.getAm_Contact() + "\t" + m.getAm_Email() + "\t" + m.getAddmission_year()
										+ "\t" + m.getPassing_year()));

							} else {

								System.out.println("There is no alumnai present");

							}
							break;

						case 4:
							System.out.println("Enter id to update");
							id = sc.nextInt();

							System.out.println("   Press 1: update for contact");
							System.out.println("   Press 2: Update for email");
							choice = sc.nextInt();
							switch (choice) {

							case 1:
								System.out.println("Enter new contact");
								sc.nextLine();
								String contact = sc.nextLine();

								StudentAddModel model111 = new StudentAddModel();
								model111.setAm_Contact(contact);

								b1 = studSer.isupdatealumnai(id, contact);

								if (b1) {

									System.out.println("contact updated");
								} else {
									System.out.println("not updated");
								}
								break;

							case 2:
								System.out.println("Enter new contact");
								sc.nextLine();
								String email = sc.nextLine();

								StudentAddModel model21 = new StudentAddModel();
								model21.setAm_Contact(email);

								b1 = studSer.isupdatealumnai(id, email);

								if (b1) {

									System.out.println("contact updated");
								} else {
									System.out.println("not updated");
								}
								break;

							}
							break;

						case 5:

							System.out.println("Enter id for delete ");
							id = sc.nextInt();
							StudentAddModel model21 = new StudentAddModel();
							model21.setAm_id(id);
							b1 = studSer.isdeletealumnai(id);

							if (b1) {

								System.out.println("delete suceesfully");
							} else {
								System.out.println("not delete suceesfully");
							}
							break;

						}

						break;

					case 2:

						System.out.println("1.Add Deparmrnt");
						System.out.println("2.view Deparmrnt");
						choice = sc.nextInt();
						
						switch(choice) {
						
						case 1:
							
							System.out.println("Enter Department name");
							sc.nextLine();
							String DepartmentName = sc.nextLine();
							System.out.println("Enter HOD name");
							String Hod_name = sc.nextLine();

							DepartmentModel model = new DepartmentModel();
							model.setD_name(DepartmentName);
							model.setH_name(Hod_name);

							b = Dser.isAddDepartment(model);

							if (b) {
								System.out.println("Department added succesfully");
							} else {
								System.out.println("Somthing wrong");

							}
							break;
							
						case 2:
							List<DepartmentModel> list = Dser.getallDepart();
							if (list != null) {

								list.forEach((m) -> out.println(m.getD_id() + "\t" + m.getD_name() + "\t"+ m.getH_name()));

							} else {

								System.out.println("There is no deparment");

							}
							break;
						
						
						
						
						}

						break;

					default:
						System.out.println("Wrong choice");
					}
				}
			}

		} while (true);

	}

}
