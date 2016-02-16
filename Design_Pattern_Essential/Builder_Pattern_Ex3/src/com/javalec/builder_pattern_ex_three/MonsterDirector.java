package com.javalec.builder_pattern_ex_three;

public class MonsterDirector {

	private ABuilder builder;

	public void setBuilder(ABuilder builder) {
		this.builder = builder;
	}

	public Monster gen() {
		return builder.build();
	}
}
