package com.hexaware.model;

public class Enrollment {
	private int enrollmentId ; 
	private int studentId  ;
	private int courseId ;
	private String enrollmentDate;
	
	
	public Enrollment() {
		
	}
	
	public Enrollment(int enrollmentId, int studentId, int courseId, String enrollmentDate )
	{
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
    }
	
	
	
	public int getEnrollmentId() {
		return enrollmentId;
	}
	public int getStudentId() {
		return studentId;
	}
	public int getCourseId() {
		return courseId;
	}
	public String getEnrollmentDate() {
		return enrollmentDate;
	}
	
	
	

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	
	
	@Override
	public String toString() {
		return "Enrollment [enrollmentId=" + enrollmentId + ", studentId=" + studentId + ", courseId=" + courseId
				+ ", enrollmentDate=" + enrollmentDate + "]";
	}	
	
}
