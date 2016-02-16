package com.javalec.adapter_pattern;

public class AdapterImpl implements IAdapter {

	@Override
	public Double twiceOf(Float num) {
		// TODO Auto-generated method stub
		return Math.doubled(num.doubleValue());
	}

	@Override
	public Double halfOf(Float num) {
		// TODO Auto-generated method stub
		return Math.half(num);
	}

}
