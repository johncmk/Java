package com.javalec.composite_pattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteFolder
		root = new ConcreteFolder("root"),
		home= new ConcreteFolder("home"),
		garam= new ConcreteFolder("garam"),
		music= new ConcreteFolder("music"),
		picture= new ConcreteFolder("picture"),
		doc= new ConcreteFolder("doc"),
		usr= new ConcreteFolder("usr");
		
		ConcreteFile 
		track1 = new ConcreteFile("track1"),
		track2 = new ConcreteFile("track2"),
		pic1 = new ConcreteFile("pic1"),
		doc1 = new ConcreteFile("doc1"),
		java = new ConcreteFile("java");
		
		root.addComponent(home);
			home.addComponent(garam);
				garam.addComponent(music);
					music.addComponent(track1);
					music.addComponent(track2);
				garam.addComponent(picture);
					picture.addComponent(pic1);
				garam.addComponent(doc);
					doc.addComponent(doc1);
					
		root.addComponent(usr);
			usr.addComponent(java);
		
			show(root);
	}//End

	private static void show(Component components) {
		
		System.out.println(components.getClass().getName() + "|" + components.getName());
		if(components instanceof ConcreteFolder) {
			for(Component comp : ((ConcreteFolder) components).getChildern()) {
				show(comp);
			}
		}
		
	}
}//End Class
