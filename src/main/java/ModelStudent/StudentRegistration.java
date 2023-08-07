package ModelStudent;

public class StudentRegistration {

	private int studentID;
	private String studentName;
	private int studentAge;
	private String studentCourse;
	private String studentAddress;
	private long studentPhoneNo;
	private String studentEmailID;
	
	public StudentRegistration() {}
	
	public StudentRegistration(int studentID, String studentName, int studentAge, String studentCourse, String studentAddress, long studentPhoneNo, String studentEmailID) {
		
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentCourse = studentCourse;
		this.studentAddress = studentAddress;
		this.studentPhoneNo = studentPhoneNo;
		this.studentEmailID = studentEmailID;
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public long getStudentPhoneNo() {
		return studentPhoneNo;
	}

	public void setStudentPhoneNo(long studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}

	public String getStudentEmailID() {
		return studentEmailID;
	}

	public void setStudentEmailID(String studentEmailID) {
		this.studentEmailID = studentEmailID;
	}
	
	public String toString() {
		
		return "\n\nStudent ID            : " + studentID + 
			   "\nStudent Name          : " + studentName + 
			   "\nStudent Age           : " + studentAge + 
			   "\nStudent Course        : " + studentCourse + 
			   "\nStudent Address       : " + studentAddress + 
			   "\nStudent Phone Number  : " + studentPhoneNo + 
			   "\nStudent Email ID      : " + studentEmailID;
		
	}
	
}
