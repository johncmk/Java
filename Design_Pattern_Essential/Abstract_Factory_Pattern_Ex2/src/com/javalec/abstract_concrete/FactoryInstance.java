package com.javalec.abstract_concrete;

import com.javalec.abst.IButton;
import com.javalec.abst.IGuiFac;
import com.javalec.abst.ITextArea;

public class FactoryInstance {

	public static IGuiFac getGuiFac() {
		
		switch(getOsCode()) {
			case 0:
				return new MacGuiFac();
			case 1:
				return new LinuxGuiFac();
			case 2:
				return new WinGuiFac();
			default:
				return null;
		}
	}
	
	private static int getOsCode() {
		String os_name = System.getProperty("os.name");
		
		System.out.println("OS Name : " + os_name );
		
		if(os_name.equals("Mac OS X")) {
			return 0;
		}
		return 2;
		
	}
	
}//End FactoryInstance

//Linux

class LinuxGuiFac implements IGuiFac{

	@Override
	public IButton createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public ITextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}
}

class LinuxButton implements IButton {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Linux Button Click");
	}

}

class LinuxTextArea implements ITextArea{

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "Linux TextArea";
	}

}

//Mac

class MacGuiFac implements IGuiFac{

	@Override
	public IButton createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public ITextArea createTextArea() {
		// TODO Auto-generated method stub
		return new MacTextArea();
	}

}

class MacButton implements IButton{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Mac Button Click");
	}

}

class MacTextArea implements ITextArea{

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "Mac TextArea";
	}

}

//Window
class WinGuiFac implements IGuiFac{

	@Override
	public IButton createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public ITextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WinTextArea();
	}

}

class WinButton implements IButton {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Window Button Clicked");
	}

}

class WinTextArea implements ITextArea{

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "Window TextArea";
	}

}


	