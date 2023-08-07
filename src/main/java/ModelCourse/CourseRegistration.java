package ModelCourse;


public class CourseRegistration {
	
	private int courseID;
	private int courseCode;
	private String courseName;
	private String courseInstructor;
	private String courseLocation;
	private int maxStudents;
	private int currentStudents;
	private String duration;
	private int price;
	
	public CourseRegistration() {}
	
	public CourseRegistration(int courseID, int courseCode, String courseName, String courseInstructor, String courseLocation, int maxStudents, int currentStudents, String duration, int price) {
		
		this.courseID = courseID;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.courseLocation = courseLocation;
		this.maxStudents = maxStudents;
		this.currentStudents = currentStudents;
		this.duration = duration;
		this.price = price;
		
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	
	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	
	public String getCourseLocation() {
		return courseLocation;
	}

	public void setCourseLocation(String courseLocation) {
		this.courseLocation = courseLocation;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCurrentStudents() {
		return currentStudents;
	}

	public void setCurrentStudents(int currentStudents) {
		this.currentStudents = currentStudents;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String i) {
		this.duration = i;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		
		return "\n\nCourse ID                                 : " + courseID + 
			   "\nCourse Code                               : " + courseCode +
			   "\nCourse Name                               : " + courseName + 
			   "\nCourse Instructor Name                    : " + courseInstructor + 
			   "\nCourse Location                           : " + courseLocation + 
			   "\nMaximum Number of Students in the Course  : " + maxStudents + 
			   "\nDuration of the Course                    : " + duration + 
			   "\nPrice of the Course                       : " + price;
	}
    
}
