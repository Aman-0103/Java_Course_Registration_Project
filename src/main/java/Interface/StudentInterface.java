package Interface;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;

import ModelCourse.CourseRegistration;
import ModelStudent.StudentRegistration;

public interface StudentInterface {
	
	public abstract Connection connect() throws ClassNotFoundException,SQLException;
	public abstract void getAllCourses(Connection cn)throws SQLException ;
	public abstract CourseRegistration getById(Connection cn,int id) throws SQLException ;
	public abstract StudentRegistration getById1(Connection cn, int stid) throws SQLException ;
	public abstract void updateStudent(Connection con, int ag, String stdcr, int crcd, String stdadd, long stdph, String stdemlid, int id) throws SQLException;
	public abstract void addStudent(Connection con, int id, String nm, int ag, String crnm, int cd, String stadd, long stphno, String stemlid) throws SQLException, InputMismatchException ;
	public abstract void deleteStudent(Connection con, int id) throws SQLException ;

}
