package com.modul2.question5;

public class TestOverloading {
	public void testStart(){
		StudentData studentDataNew = new StudentData();
		//new
		System.out.println("Student name : "+studentDataNew.getStuName());
		System.out.println("Student Age : "+studentDataNew.getStuAge());
		System.out.println("Student ID : "+studentDataNew.getStuID());
		StudentData studentDataNew1 = new StudentData(555, "Alex", 25);
		System.out.println("Student name : "+studentDataNew1.getStuName());
		System.out.println("Student Age : "+studentDataNew1.getStuAge());
		System.out.println("Student ID : "+studentDataNew1.getStuID());
	}
}
