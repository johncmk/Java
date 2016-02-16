package com.javalec.builder_pattern_ex_three;

public class ATypeMonsterBuilder extends ABuilder {

	public ATypeMonsterBuilder() {
		// TODO Auto-generated constructor stub
		monster = new Monster();
	}
	
	@Override
	public void setHp() {
		// TODO Auto-generated method stub
		monster.setHp(500);
	}

	@Override
	public void setAt() {
		// TODO Auto-generated method stub
		monster.setAt(100);
	}

	@Override
	public void setDf() {
		// TODO Auto-generated method stub
		monster.setDf(100);
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		monster.setName("Skeleton Warrior");
	}

}
