package com.javalec.hashset;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student> students = new HashSet<Student>();
		
		students.add(new Student(1, new StringBuilder("John")));
		students.add(new Student(2, new StringBuilder("Tom")));
		students.add(new Student(3, new StringBuilder("Tony")));
	
		print(students);
		
		System.out.println("====================");
		
		try {
			students.remove(new Student(2, new StringBuilder("Tom")));
			print(students);
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
	}//End Main
	
	private static void print( Set<Student> students) {
		if(students.isEmpty()) {
			return;
		}else {
			for(Student key : students) {
				System.out.println(key);
			}
		}
	}
	
}//End Class
