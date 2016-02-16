
public class QueueMain {

	public static void main(String[] args) {

		Queue q = new Queue(10);
		
		for(int i = 0; i < 10; i++)
			q.enqueue(i+1);
		
		while(!q.isEmpty())
			System.out.println(q.dequeue());
	}//End main

}//End class
