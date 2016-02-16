package com.javalec.builder_pattern_ex_three;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MonsterDirector director = new MonsterDirector();
	
		ABuilder builder = new ATypeMonsterBuilder();
		
		director.setBuilder(builder);
		
		System.out.println(director.gen().toString());
		
		builder = new BTypeMonsterBuilder();
		director.setBuilder(builder);
		Monster monster = director.gen();
		
		System.out.println(monster.toString());
		
	}

}
