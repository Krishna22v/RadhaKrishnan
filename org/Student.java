package org.student;

public class Student extends Department {
public void studentName() {
	System.out.println("subaru");
}
	public void StudentDept() {
		System.out.println("Mech");
		
	}
	public void studentId() {
		System.out.println("123");
	}
	public static void main(String[] args) {
		Student type=new Student();
		type.collegeCode();
		type.collegeName();
		type.collegeCode();
		type.collegeRank();
		type.departName();
		type.studentName();
		type.StudentDept();
		type.studentId();
	}

}
