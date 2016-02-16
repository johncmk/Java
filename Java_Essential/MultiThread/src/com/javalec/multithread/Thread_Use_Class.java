package com.javalec.multithread;

/**
 * Thread extends class
 * @author chaos408
 *
 */
public class Thread_Use_Class extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTest in Class");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				System.out.println(i);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}

}
