package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Interface.Operations;
import ModelCourse.CourseRegistration;
import ModelStudent.StudentRegistration;

public class ServiceClass implements Operations{
	
	@Override
	public Connection connect() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CourseRegistration","root","UP72dl@01031999");			
		return con;
		
	}
	
	
	@Override
	public void getAllCourses(Connection cn) throws SQLException 
	{
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery("select * from Courses");
		
		CourseRegistration cr = new CourseRegistration();
		while(rs.next())
		{
			cr.setCourseID(rs.getInt("courseID"));
			cr.setCourseCode(rs.getInt("courseCode"));
			cr.setCourseName(rs.getString("courseName"));
			cr.setCourseInstructor(rs.getString("courseInstructor"));
			cr.setCourseLocation(rs.getString("courseLocation"));
			cr.setMaxStudents(rs.getInt("maxStudents"));
			cr.setCurrentStudents(rs.getInt("currentStudents"));
			cr.setDuration(rs.getString("duration"));
			cr.setPrice(rs.getInt("price"));
			System.out.println(cr);
		}
		
		st.close();
		rs.close();		
		
	}
	
	
	@Override
	public void getAllStudents(Connection cn) throws SQLException 
	{
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery("select * from Students");
		
		StudentRegistration sr = new StudentRegistration();
		while(rs.next())
		{
			sr.setStudentID(rs.getInt("studentID"));
			sr.setStudentName(rs.getString("studentName"));
			sr.setStudentAge(rs.getInt("studentAge"));
			sr.setStudentCourse(rs.getString("studentCourse"));
			sr.setStudentAddress(rs.getString("studentAddress"));
			sr.setStudentPhoneNo(rs.getLong("studentPhoneNo"));
			sr.setStudentEmailID(rs.getString("studentEmailID"));
			System.out.println(sr);
		}
		
		st.close();
		rs.close();		
		
	}
	
	
	@Override
	public CourseRegistration getById(Connection cn,int id) throws SQLException 
	{		
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery("select * from Courses where courseID = "+ id);
		
		CourseRegistration cr = new CourseRegistration();
		while(rs.next())
		{
			cr.setCourseID(rs.getInt("courseID"));
			cr.setCourseCode(rs.getInt("courseCode"));
			cr.setCourseName(rs.getString("courseName"));
			cr.setCourseInstructor(rs.getString("courseInstructor"));
			cr.setCourseLocation(rs.getString("courseLocation"));
			cr.setMaxStudents(rs.getInt("maxStudents"));
			cr.setCurrentStudents(rs.getInt("currentStudents"));
			cr.setDuration(rs.getString("duration"));
			cr.setPrice(rs.getInt("price"));
			System.out.println(cr);
		}
		
		st.close();
		rs.close();	
		
		return cr;
		
	}
	
	
	@Override
	public StudentRegistration getById1(Connection cn,int stid) throws SQLException 
	{		
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery("select * from Students where studentID = "+ stid);
		
		StudentRegistration sr = new StudentRegistration();
		while(rs.next())
		{
			sr.setStudentID(rs.getInt("studentID"));
			sr.setStudentName(rs.getString("studentName"));
			sr.setStudentAge(rs.getInt("studentAge"));
			sr.setStudentCourse(rs.getString("studentCourse"));
			sr.setStudentAddress(rs.getString("studentAddress"));
			sr.setStudentPhoneNo(rs.getLong("studentPhoneNo"));
			sr.setStudentEmailID(rs.getString("studentEmailID"));
			System.out.println(sr);
		}
		
		st.close();
		rs.close();	
		
		return sr;
		
	}
	
	
	public void updateCourse(Connection con, String instnm, String crloc, int mxstd, String dur, int pr,int id) throws SQLException
	{
		PreparedStatement ps = con.prepareStatement("update Courses set courseInstructor = ?, courseLocation = ?, maxStudents = ?, duration = ?, price = ? where courseID = ?");
				
				ps.setString(1,instnm);
				ps.setString(2,crloc);
				ps.setInt(3, mxstd);
				ps.setString(4,dur);
				ps.setInt(5, pr);
				ps.setInt(6, id);
				
				int i = ps.executeUpdate();
				System.out.println(i+" Course is updated !");

				ps.close();	
					
	}
	
	
	public void updateStudent(Connection con, int ag, String stdcr, int crcd, String stdadd, long stdph, String stdemlid, int id) throws SQLException
	{
		PreparedStatement ps = con.prepareStatement("update Students set studentAge = ?, studentCourse=?, courseCode = ?, studentAddress = ?, studentPhoneNo = ?, studentEmailID = ? where studentID=?");
       
				ps.setInt(1, ag);
				ps.setString(2, stdcr);
				ps.setInt(3, crcd);
				ps.setString(4, stdadd);
				ps.setLong(5, stdph);
				ps.setString(6, stdemlid);
				ps.setInt(7, id);
				
				int i = ps.executeUpdate();
				System.out.println(i+" Student Record is updated !");

				ps.close();	
				
	}
	
	
	@Override
	public void addCourse(Connection con, int id, int code, String nm, String instNm, String crLoc, int maxStd, int currStd, String dur, int pr) throws SQLException 
	{
		PreparedStatement ps = con.prepareStatement("insert into Courses values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
		                                                                // ?  - place holders
		                                                                     // 1 2 3 4 -place values
		ps.setInt(1, id);
		ps.setInt(2, code);
		ps.setString(3, nm);
		ps.setString(4, instNm);
		ps.setString(5, crLoc);
		ps.setInt(6, maxStd);
		ps.setInt(7, currStd);
		ps.setString(8, dur);
		ps.setInt(9, pr);
		
		int i = ps.executeUpdate();
		System.out.println(i+" New Course is added !");
		
		ps.close();
			
	}
	
	
	@Override
	public void addStudent(Connection con, int id, String nm, int ag, String crnm, int crcd, String stadd, long stphno, String stemlid) throws SQLException 
	{
		PreparedStatement ps = con.prepareStatement("insert into Students values(?, ?, ?, ?, ?, ?, ?, ?)");
		                                                                // ?  - place holders
		                                                                     // 1 2 3 4 -place values
		ps.setInt(1, id);
		ps.setString(2, nm);
		ps.setInt(3, ag);
		ps.setString(4, crnm);
		ps.setInt(5, crcd);
		ps.setString(6, stadd);
		ps.setLong(7, stphno);
		ps.setString(8, stemlid);
		
		int i = ps.executeUpdate();
		System.out.println(i+" New Student is Registered !");
		
		ps.close();
			
	}
	
	
	public void deleteCourse(Connection con,int id) throws SQLException 
	{
		PreparedStatement ps = con.prepareStatement("Delete from Courses where courseID = ?");
        
		ps.setInt(1, id);

		int i = ps.executeUpdate();
		System.out.println(i+" Course is Deleted !");

		ps.close();		
	}
	

	public void deleteStudent(Connection con,int id) throws SQLException 
	{
		PreparedStatement ps = con.prepareStatement("Delete from Students where studentID = ?");
        
		ps.setInt(1, id);

		int i = ps.executeUpdate();
		System.out.println(i+" Student Record is Deleted !");

		ps.close();		
	}
	

}
