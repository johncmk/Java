package com.javalec.shallowcopy_and_deepcopy;

import java.util.Date;

public class Robot implements Cloneable{

	private String name;
	private int ID;
	private Date published;
	
	public Robot(String name, int iD, Date published) {
		super();
		this.name = name;
		ID = iD;
		this.published = published;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public Date getPublished() {
		return published;
	}
	
	public void setPublished(Date published) {
		this.published = published;
	}

	@Override
	public String toString() {
		return "Robot [name=" + name + ", ID=" + ID + ", published=" + published + "]";
	}
	
	/**
	 * DeepCopy
	 * @return Deep copied robot
	 */
	public Robot copy() {
		
		Robot copy_robot = null;
		try {
			copy_robot = (Robot) clone();
			copy_robot.setName(copy_robot.getName() + " Copy Version");
			
			return copy_robot;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return copy_robot;
	}
	
}
