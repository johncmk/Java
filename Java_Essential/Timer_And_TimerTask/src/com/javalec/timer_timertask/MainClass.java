package com.javalec.timer_timertask;

import java.util.Timer;
import java.util.TimerTask;

public class MainClass {

	public static void main(String...strings) throws InterruptedException {
		
		Timer timer = new Timer(true);
		TimerTask t1 = new TimerChild1();
		TimerTask t2 = new TimerChild2();
		
		timer.schedule(t1,2000);
		timer.schedule(t2,10000);
		
		Thread.sleep(12000);
		System.out.println("Time is done");
	}
	
}//End
