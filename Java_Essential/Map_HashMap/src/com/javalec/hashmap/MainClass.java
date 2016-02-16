package com.javalec.hashmap;

import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<StudentKey, Student> student_map = new HashMap<>();

		for (int student_id = 0; student_id < Student.STUDENT_SIZE; student_id++) {
			student_map.put(new StudentKey(student_id, "john " + String.valueOf(student_id)),
					new Student(student_id, new StringBuilder("John " + String.valueOf(student_id))));
		}

		print(student_map);

		System.out.println("============================== DELETE ==============================");
		
		try {
			student_map.remove(new StudentKey(1, "john 1"));
			student_map.remove(new StudentKey(9, "john 9"));
			print(student_map);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hash map's hashcode and equals override are not working.");
		}

	}// End Main

	private static void print(HashMap<StudentKey, Student> student_map) {
		for (StudentKey key : student_map.keySet()) {
			System.out.println("student KEY : " + key.toString());
			System.out.println("Student Full Name & ID: " + student_map.get(key).toString());
		}

	}

}// End Class
