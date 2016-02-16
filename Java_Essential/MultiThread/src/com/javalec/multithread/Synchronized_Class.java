package com.javalec.multithread;

public class Synchronized_Class implements Runnable{

	private int num = 0;
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for( int i = 0; i < 10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("==============================");
				num++;
			}
			System.out.println("Name : " + Thread.currentThread().getName() + ", num : " + num);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}

	
	
}
