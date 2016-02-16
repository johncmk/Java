package com.javalec.multithread;

/**
 * Thread using interface
 * @author chaos408
 *
 */
public class Thread_Use_Interface implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTest");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				System.out.println(i);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
	
	
	
}//End