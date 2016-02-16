package com.javalec.multithread;


/**
 * One object shares to one thread
 * @author chaos408
 *
 */
public class One_Obj_One_Thread implements Runnable {

	private int num = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10 ; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("==============================");
				num++;
			} else {
				num+=4;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + ", num: " + num);
			try {
				Thread.sleep(500);
			} catch (Exception e ) {
				e.getMessage();
			}
		}
		
	}

}
