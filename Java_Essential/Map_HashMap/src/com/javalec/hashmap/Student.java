package com.javalec.hashmap;

public class Student {

	public static final int STUDENT_SIZE = 	10;
	
	private StringBuilder Name;
	private int student_id;
	
	public Student(int student_id , StringBuilder name) {
		this.student_id = student_id;
		this.Name = name;
	}

	public StringBuilder getName() {
		return Name;
	}
	public void setName(StringBuilder name) {
		Name = name;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", student_id=" + student_id + "]";
	}
	
}//End
