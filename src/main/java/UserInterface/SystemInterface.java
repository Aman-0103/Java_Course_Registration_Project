package UserInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Services.ServiceClass;

public class SystemInterface {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, InputMismatchException
	{
		ServiceClass srv= new ServiceClass();
		String ch="Y";
		Connection con = srv.connect();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("X--X--X--X--X--X WELCOME TO THE COURSE REGISTRATION SYSTEM X--X--X--X--X--X");
			System.out.println("\nHow Would You Like To Get Started?");
			System.out.println("Enter '1' to Start as an Admin");
			System.out.println("Enter '2' to Start as a Student");
			System.out.println("Enter '3' to Exit");
			String option = in.readLine();
			
			while (!option.contentEquals("1") && !option.contentEquals("2") && !option.contentEquals("3")) {
				System.out.println("Sorry, your input is not valid! Try again.\n");
				System.out.println("Enter '1' to Start as an Admin");
				System.out.println("Enter '2' to Start as a Student");
				System.out.println("Enter '3' to Exit");
				option = in.readLine();
			}
			
			if (option.contentEquals("1")) {

				System.out.println("Enter the Admin Username:");
				String userInput = in.readLine();
				System.out.println("Enter the Admin Password:");
				String passInput = in.readLine();
				
				// error message
				while (!userInput.contentEquals("Admin") || !passInput.contentEquals("Admin0103")) {
					if (!userInput.contentEquals("Admin")) {
						System.out.println("Sorry the Admin Username is not correct! Try again.\n");
						System.out.println("Enter the Admin Username:");
						userInput = in.readLine();
						System.out.println("Enter the Admin Password:");
						passInput = in.readLine();
					} else if (!passInput.contentEquals("admin001")) {
						System.out.println("Sorry the Admin Password is not correct! Try again.\n");
						System.out.println("Enter the Admin Username:");
						userInput = in.readLine();
						System.out.println("Enter the Admin Password:");
						passInput = in.readLine();
					}
				}
				
				System.out.println("\nCongrats! You have been successfully logged in as an Admin!\n");
				
				boolean logout = false;
				
				while (!logout) {
					System.out.println("What would you like to do today?");
					System.out.println("1: Get All Courses Information");
					System.out.println("2: Get All Students Information");
					System.out.println("3: Get Details of Course By Using Course ID");
					System.out.println("4: Get Details of Student By Using Student ID");
					System.out.println("5: Add a New Course");
					System.out.println("6: Register a New Student");
					System.out.println("7: Update Course Details By Using Course ID");
					System.out.println("8: Update Student Details By Using Student ID");
					System.out.println("9: Delete a Course By Using Course ID");
					System.out.println("10: Delete a Registered Student By Using Student ID");
					System.out.println("\n Enter your choice: ");
					int choice = sc.nextInt();
					
					switch(choice)
					{
					case 1: 
						srv.getAllCourses(con);
						break;
						
					case 2: 
						srv.getAllStudents(con);
						break;
					
					case 3:
						try {
							System.out.println("\nEnter Course ID to search : ");
							int id = sc.nextInt();
							srv.getById(con,id);
							break;	
						} 
						
						catch(InputMismatchException e) {
							
							System.out.println(e);
								
						}
						
					case 4:
						try {
							System.out.println("\nEnter Student ID to search : ");
							int stid = sc.nextInt();
							srv.getById1(con,stid);
							break;
						}
						
						catch(InputMismatchException e) {
							
							System.out.println(e);
								
						}
						
					case 5:
						System.out.println("\nEnter new Course ID  : ");
						int d = sc.nextInt();
						
						System.out.println("\nEnter new Course Name  : ");
						sc.nextLine();
						String stnm = sc.nextLine();
						
						System.out.println("\nEnter new Course Code  : ");
						int cd = sc.nextInt();
						
						System.out.println("\nEnter new Course Instructor Name  : ");
						sc.nextLine();
						String instnm = sc.nextLine();
						
						System.out.println("\nEnter new Max Students limit  : ");
						int maxStd = sc.nextInt();
						
						System.out.println("\nEnter new Course Location  : ");
						sc.nextLine();
						String crloc = sc.nextLine();
						
						System.out.println("\nEnter new Current Students  : ");
						int curStd = sc.nextInt();
						
						System.out.println("\nEnter new Course Duration Limit  : ");
						sc.nextLine();
						String dur = sc.nextLine();
						
						System.out.println("\nEnter new Course price  : ");
						int pr = sc.nextInt();
						
						srv.addCourse(con,d,cd,stnm,instnm,crloc, maxStd,curStd,dur,pr);
						break;
						
						
					case 6:
						System.out.println("\nEnter new Student ID  : ");
						int sid = sc.nextInt();
						
						System.out.println("\nEnter new Student Name  : ");
						sc.nextLine();
						String stnm1 = sc.nextLine();
						
						System.out.println("\nEnter new Student Age  : ");
						int ag = sc.nextInt();
						
						System.out.println("\nEnter new Student Address  : ");
						sc.nextLine();
						String stadd = sc.nextLine();
						
						System.out.println("\nEnter new Student Phone Number  : ");
						long stphno = sc.nextLong();
						
						System.out.println("\nEnter new Student Course  : ");
						sc.nextLine();
						String stcr = sc.nextLine();
						
						System.out.println("\nEnter new Course Code  : ");
						int cd2 = sc.nextInt();
						
						System.out.println("\nEnter new Student Email ID  : ");
						sc.nextLine();
						String stemlid = sc.nextLine();
						
						srv.addStudent(con, sid, stnm1, ag, stcr, cd2, stadd, stphno, stemlid);
						break;
						
					case 7:
						 
						System.out.println("\nEnter new Course id  : ");
						int ipd = sc.nextInt();
						
						System.out.println("\nEnter new Instructor Name  : ");
						sc.nextLine();
						String instname = sc.nextLine();
						
						System.out.println("\nEnter new Course Maximum Student Limit  : ");
						int mxstud = sc.nextInt();
						
						System.out.println("\nEnter new Course Location  : ");
						sc.nextLine();
						String courloc = sc.nextLine();
						
						System.out.println("\nEnter new Course price  : ");
						int prc = sc.nextInt();
						
						System.out.println("\nEnter new Course Duration  : ");
						sc.nextLine();
						String duratn = sc.nextLine();
						
						srv.updateCourse(con, instname, courloc, mxstud, duratn, prc, ipd);
						break;
						
					case 8:
						System.out.println("\nEnter Student id  : ");
						int ipd1 = sc.nextInt();
						
						System.out.println("\nEnter Student's Updated Age  : ");
						int age1 = sc.nextInt();
						
						System.out.println("\nEnter Student's new Course Name  : ");
						sc.nextLine();
						String stdcr1 = sc.nextLine();
						
						System.out.println("\nEnter Student's New Course Code  : ");
						int crcd = sc.nextInt();
						
						System.out.println("\nEnter Student's New Address  : ");
						sc.nextLine();
						String stdadd = sc.nextLine();
						
						System.out.println("\nEnter Student's New Phone Number  : ");
						long stdph = sc.nextLong();
						
						System.out.println("\nEnter Student's New Email Id  : ");
						sc.nextLine();
						String stdemlid = sc.nextLine();
						
						srv.updateStudent(con, age1, stdcr1, crcd, stdadd, stdph, stdemlid, ipd1);
						break;
						
					case 9:
						System.out.println("\nEnter new Course id  : ");
						int ip = sc.nextInt();
						
						srv.deleteCourse(con, ip);
						break;
						
					case 10:
						System.out.println("\nEnter new Student id  : ");
						int stdid = sc.nextInt();
						
						srv.deleteStudent(con, stdid);
						break;
					
					}
					
					
					System.out.println("\nDo you want to continue: ");
					ch = sc.next();
					if(ch.equals("N") || (ch.equals("n")))
						break;
				
				}	
			} 
			
			else if (option.contentEquals("2")) {
				
				System.out.println("\nWelcome! You have started as a Student!\n");
				
				boolean valid = false;
				
				while (!valid) {
					System.out.println("What would you like to do today?");
					System.out.println("1: Get All Courses Information");
					System.out.println("2: Get Details of Courses By Using Course ID");
					System.out.println("3: Get Details of Your Registration By Using Your Student ID");
					System.out.println("4: Register a New Student");
					System.out.println("5: Update Your Registration Details By Using Student ID");
					System.out.println("6: Delete Your Registration By Using Student ID");
					System.out.println("\n Enter your choice: ");
					int choice1 = sc.nextInt();
					
					switch(choice1)
					{
					case 1: 
						srv.getAllCourses(con);
						break;
					
					case 2:
						System.out.println("\nEnter Course ID to search : ");
						int id = sc.nextInt();
						srv.getById(con,id);
						break;	
						
					case 3:
						System.out.println("\nEnter Student ID to search : ");
						int stid = sc.nextInt();
						srv.getById1(con,stid);
						break;
						
					case 4:
						System.out.println("\nEnter new Student ID  : ");
						int sid = sc.nextInt();
						
						System.out.println("\nEnter new Student Name  : ");
						sc.nextLine();
						String stnm = sc.nextLine();
						
						System.out.println("\nEnter new Student Age  : ");
						int ag = sc.nextInt();
						
						System.out.println("\nEnter new Student Address  : ");
						sc.nextLine();
						String stadd = sc.nextLine();
						
						System.out.println("\nEnter new Student Phone Number  : ");
						long stphno = sc.nextLong();
						
						System.out.println("\nEnter new Student Course  : ");
						sc.nextLine();
						String stcr = sc.nextLine();
						
						System.out.println("\nEnter new Course Code  : ");
						int cd1 = sc.nextInt();
						
						System.out.println("\nEnter new Student Email ID  : ");
						sc.nextLine();
						String stemlid = sc.nextLine();

						
						srv.addStudent(con, sid, stnm, ag, stcr, cd1, stadd, stphno, stemlid);
						break;
						
					case 5:
						 
						System.out.println("\nEnter Student id  : ");
						int ipd = sc.nextInt();
						
						System.out.println("\nEnter Student's Updated Age  : ");
						int age2 = sc.nextInt();
						
						System.out.println("\nEnter Student's new Course Name  : ");
						sc.nextLine();
						String stdcr = sc.nextLine();
						
						System.out.println("\nEnter Student's New Course Code  : ");
						int crcd1 = sc.nextInt();
						
						System.out.println("\nEnter Student's New Address  : ");
						sc.nextLine();
						String stdadd1 = sc.nextLine();
						
						System.out.println("\nEnter Student's New Phone Number  : ");
						long stdph1 = sc.nextLong();
						
						System.out.println("\nEnter Student's New Email Id  : ");
						sc.nextLine();
						String stdemlid1 = sc.nextLine();
						
						srv.updateStudent(con, age2, stdcr, crcd1, stdadd1, stdph1, stdemlid1, ipd);
						break;
						
					case 6:
						System.out.println("\nEnter new Course ID  : ");
						int stdid = sc.nextInt();
						
						srv.deleteStudent(con, stdid);
						break;
				
					}
					
					System.out.println("\nDo you want to continue: ");
					ch = sc.next();
					if(ch.equals("N") || (ch.equals("n")))
						break;
					
				}
					
			}
			
			else {
				System.out.println("\n\n\nThank You For Visiting Course Registration System & Please Visit Again! \n\n\n");
				break;
			}
			
		}
	}
}
