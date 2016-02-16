package com.javalec.multithread;

/**
 * This is sample of
 * one object shares multithread
 * @author chaos408
 *
 */
public class One_Obj_MultiThread implements Runnable{

	int num = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10 ; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("===============================");
				num++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + ", num :" + num);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
	}//End

	
	
}//End
