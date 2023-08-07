package Interface;

import java.sql.Connection;
import java.sql.SQLException;

import ModelCourse.CourseRegistration;
import ModelStudent.StudentRegistration;

public interface Operations {
	
	public abstract Connection connect() throws ClassNotFoundException,SQLException ;
	public abstract void getAllCourses(Connection cn)throws SQLException ;
	public abstract void getAllStudents(Connection cn)throws SQLException ;
//	public abstract void getStudentCourses(Connection cn)throws SQLException ;
	public abstract CourseRegistration getById(Connection cn,int id) throws SQLException ;
	public abstract StudentRegistration getById1(Connection cn, int stid) throws SQLException ;
	public abstract void updateCourse(Connection con,String instnm, String crloc, int mxstd, String dur,int pr,int id)throws SQLException;
	public abstract void updateStudent(Connection con, int ag, String stdcr, int crcd, String stdadd, long stdph, String stdemlid, int id) throws SQLException;
	public abstract void addCourse(Connection con,int id, int code, String nm, String instNm, String crLoc, int maxStd, int currStd, String dur, int pr)throws SQLException;
	public abstract void addStudent(Connection con, int id, String nm, int ag, String crnm, int crcd, String stadd, long stphno, String stemlid) throws SQLException;
	public abstract void deleteCourse(Connection con,int id) throws SQLException ;
	public abstract void deleteStudent(Connection con, int id) throws SQLException ;
	
}
