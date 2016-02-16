package com.javalec.awt_btn;

import java.awt.Dimension;

public class MainClass {

	public static void main(String...strings) {
		
		MakeBtn btn = new MakeBtn();
		
		btn.setSize(new Dimension(200,200));
		btn.setVisible(true);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getMessage();
		}
		
		btn.setVisible(false);
		btn.dispose();
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.getMessage();
		}
		
		System.exit(0);
		
	}//End main
}//End Class
