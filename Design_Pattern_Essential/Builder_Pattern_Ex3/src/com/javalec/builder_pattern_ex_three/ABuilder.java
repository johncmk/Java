package com.javalec.builder_pattern_ex_three;

public abstract class ABuilder {

	protected Monster monster;
	
	abstract public void setHp();
	abstract public void setAt();
	abstract public void setDf();
	abstract public void setName();
	
	public Monster build() {
		setAt();
		setDf();
		setHp();
		setName();
		return monster;
	};
}
