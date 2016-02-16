package com.javalec.builder_pattern_ex_three;

public class Monster {

	private int hp, at, df;
	private String name;

	public Monster() {
		
	}
	
	public Monster(int hp, int at, int df, String name) {
		super();
		this.hp = hp;
		this.at = at;
		this.df = df;
		this.name = name;
	}

	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getAt() {
		return at;
	}
	
	public void setAt(int at) {
		this.at = at;
	}
	
	public int getDf() {
		return df;
	}
	
	public void setDf(int df) {
		this.df = df;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Monster [hp=" + hp + ", at=" + at + ", df=" + df + ", name=" + name + "]";
	}
	
	
	
}
