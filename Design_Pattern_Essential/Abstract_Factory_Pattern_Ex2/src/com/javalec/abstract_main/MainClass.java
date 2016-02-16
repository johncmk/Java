package com.javalec.abstract_main;

import com.javalec.abst.IButton;
import com.javalec.abst.IGuiFac;
import com.javalec.abst.ITextArea;
import com.javalec.abstract_concrete.FactoryInstance;

public class MainClass {

	public static void main(String...strings) {
		
//		IGuiFac fac = new LinuxGuiFac();
//		IGuiFac fac = new MacGuiFac();
		
		IGuiFac fac = FactoryInstance.getGuiFac();
		IButton btn = fac.createButton();
		ITextArea area = fac.createTextArea();
		
		btn.click();
		System.out.println(area.getText());
	}
}
