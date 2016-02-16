package com.javalec.multithread;

import java.util.Random;

/**
 * MultiThreade Sample
 * @author chaos408
 *
 */
public class Vote implements Runnable {

	private int targetNum = 100;
	private int sum = 0;
	private Random rand = new Random();
	
	private void draw_graph(StringBuffer sb) {
		for( int i = 0; i < sum; i++) {
			sb.append("*");
		}
		System.out.println(Thread.currentThread().getName() + " Counting : " + sum + "\t" + sb); 
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			sum += rand.nextInt(10);
			sb.delete(0, sb.toString().length());
			
			if(sum >= targetNum) {
				sum = 100;
				draw_graph(sb);
				break;
			} else {
				draw_graph(sb);
			}
		}
		try {
			Thread.sleep(200);
		} catch (Exception e ) {
			e.getMessage();
		}
	}//End run
}//End
