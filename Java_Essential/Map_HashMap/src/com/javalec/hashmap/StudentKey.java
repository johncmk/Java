package com.javalec.hashmap;

public class StudentKey {

	private int student_id;
	private String student_name;
	
	public StudentKey(int student_id, String student_name) {
		this.student_id = student_id;
		this.student_name = student_name;
	}

	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	@Override
	public String toString() {
		return "StudentKey [student_id=" + student_id + ", student_name=" + student_name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return toString().equals(obj.toString());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return toString().hashCode();
	}
	
}//End
