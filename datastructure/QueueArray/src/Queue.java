/*
 * Circular Queue
 */
public class Queue {

	private int arr[];
	private int front = -1;
	private int rear = -1;
	private int size = 0;
	
	/*
	 * default size set to 100
	 */
	public Queue(){
		this.arr = new int[100];	
	}
	
	/*
	 * manually set the size of the queue
	 */
	public Queue(int size){
		this.size = size;
		this.arr = new int[size];
	}
	
	/*
	 * return true if queue is empty
	 */
	public boolean isEmpty(){
		return (this.front == -1 && this.rear == -1);
	}
	
	/*
	 * return fixed size of the queue
	 */
	public int getSize(){
		return this.size;
	}
	
	/*
	 * return total number of input elements
	 */
	public int getInputSize(){
		return (this.isEmpty())? 0: (this.rear+1) - this.front;
	}
	
	/*
	 * return true if circular meets one cycle
	 */
	public boolean isFull(){
		return (((this.rear+1) % this.size) == this.front); 
	}
	
	/*
	 * return true if there is only one element in queue
	 */
	public boolean hasOnlyOneElement(){
		return (!this.isEmpty() && (this.front == this.rear));
	}
	
	/*
	 * push the element to queue; increment rear
	 * case1; if queue is full return
	 * case2; if queue is empty and has first input
	 * case3; push element into queue if case1 and case2 doesn't meet
	 */
	public void enqueue(int data){
		if(this.isFull())
			return;
		else if(this.isEmpty()){
			this.front = 0;
			this.rear = 0;
		}else
			this.rear = (this.rear+1) % this.size;
		this.arr[this.rear] = data;
	}
	
	/*
	 * pop the element to queue; increment front
	 * case1; if queue is empty return -1
	 * case2; if queue has only one element reset the front and rear 
	 * case3; pop the element in queue
	 */
	public int dequeue(){
		int pos = this.front;
		if(this.isEmpty())
			return -1;
		else if(this.hasOnlyOneElement()){
			this.front = -1;
			this.rear = -1;
		}else 
			this.front = (this.front+1)% this.size;
		return this.arr[pos];
	}
	
	/*
	 * display the top element of queue
	 */
	public int top(){
		if(this.isEmpty())
			return -1;
		return this.arr[this.front];
	}
}//End class
