package com.javalec.multithread;

public class MainClass {

	public static void main(String...strings) {
		
		//Interface Thread
//		Thread_Use_Interface th = new Thread_Use_Interface();
//		Thread th_use = new Thread(th,"A");
//		
//		th_use.start();
//		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("MainClass");
		//End
		
		//Class Thread
//		Thread_Use_Class th2 = new Thread_Use_Class();
//		th2.setName("A");
//		th2.start();
//		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("MainClass");
		//End
		
		//One object shares multithread
//		One_Obj_MultiThread one_obj = new One_Obj_MultiThread();
//		
//		Thread th1 = new Thread(one_obj, "A");
//		Thread th2 = new Thread(one_obj, "B");
//		
//		th1.start();
//		th2.start();
//		
//		System.out.println(Thread.currentThread().getName());
		//End
		
		//One Obj to one Thread
//		One_Obj_One_Thread obj1 = new One_Obj_One_Thread();
//		One_Obj_One_Thread obj2 = new One_Obj_One_Thread();
//		
//		Thread th1 = new Thread(obj1,"A");
//		Thread th2 = new Thread(obj2,"B");
//		
//		th1.start();
//		th2.start();
//		
//		System.out.println(Thread.currentThread().getName());
		//End

		//MultiThread; election
//		Vote v1 = new Vote();
//		Vote v2 = new Vote();
//		Vote v3 = new Vote();
//		
//		Thread t1 = new Thread(v1,"NY");
//		Thread t2 = new Thread(v2,"CA");
//		Thread t3 = new Thread(v3,"MA");
//		
//		t1.start();
//		t2.start();
//		t3.start();
		//End
		
		//Thread Synchronized 
		Synchronized_Class obj = new Synchronized_Class();
		
		Thread t1 = new Thread(obj, "A");
		Thread t2 = new Thread(obj, "B");
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
		
		//End
	}//End main
}//End Class
