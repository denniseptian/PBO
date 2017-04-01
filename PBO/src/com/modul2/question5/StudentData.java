package com.modul2.question5;

public class StudentData {
	private int stuID;
	private String stuName;
	private int stuAge;
	
	public StudentData() {
		// TODO Auto-generated constructor stub
		stuID = 100;
		stuName = "New Student";
		stuAge = 18;
	}
	public StudentData(int studentID, String studentName, int studentAge){
		stuID = studentID;
		stuName = studentName;
		stuAge = studentAge;
	}
	
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
}
