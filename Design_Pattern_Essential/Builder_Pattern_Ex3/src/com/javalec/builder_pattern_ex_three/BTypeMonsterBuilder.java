package com.javalec.builder_pattern_ex_three;

public class BTypeMonsterBuilder extends ABuilder {

	public BTypeMonsterBuilder() {
		// TODO Auto-generated constructor stub
		monster = new Monster();
	}
	
	@Override
	public void setHp() {
		// TODO Auto-generated method stub
		monster.setHp(200);
	}

	@Override
	public void setAt() {
		// TODO Auto-generated method stub
		monster.setAt(200);
	}

	@Override
	public void setDf() {
		// TODO Auto-generated method stub
		monster.setDf(200);
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		monster.setName("Dragon");
	}
	
}
