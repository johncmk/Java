/**
 * stack; implement array data structure
 * @author John
 *
 */
public class StackArray {

	private int data;
	private int size;
	private int arr[];
	private int ptr = -1;
	
	/*
	 * The size set to 100 as default
	 */
	public StackArray(){
		this.size = 100;
		this.arr = new int[size];
		this.ptr = -1;
	}
	
	/*
	 * Manually set the size of stack
	 */
	public StackArray(int size){
		this.size = size;
		this.arr = new int[size];
		this.ptr = -1;
	}
	
	/*
	 * set size of stack
	 */
	public void setSize(int size){
		this.size = size;
		this.arr = new int[size];
	}
	
	/*
	 * return the size of array used for stack
	 */
	public int getSize(){
		return this.size;
	}
	/*
	 * return true if stack is empty
	 */
	public boolean isEmpty(){
		return (this.ptr == -1);
	}
	
	/*
	 * return true if stack is full
	 */
	public boolean isFull(){
		return (this.size == this.ptr+1);
	}
	
	/*
	 * push value to stack
	 */
	public void push(int data){
		if(isFull())
			return;
		this.arr[++this.ptr] = data;
	}
	
	/*
	 * pop the top element of stack; -1 means stack is empty
	 */
	public int pop(){
		if(this.isEmpty())
			return -1;
		return this.arr[this.ptr--];
	}
	
	/*
	 * return size of inputs in stack
	 */
	public int getInputSize(){
		return this.ptr+1;
	}
	
	/*
	 * display the top item
	 * if it's empty then return -1
	 */
	public int top(){
		if(this.isEmpty())
			return -1;
		return this.arr[this.ptr];
	}
	
	/*
	 * sort the stack with using ONLY stack
	 * O(n^2)
	 */
	public StackArray sortIterative(){
		StackArray stk2 = new StackArray();
		while(!this.isEmpty()){
			int temp = this.pop();
			while(!stk2.isEmpty() && temp > stk2.top()){
				this.push(stk2.pop());
			}
			stk2.push(temp);
		}
		return stk2;
	}
	
	/*
	 * recursively sort stack
	 */
	public void sortRecursive(StackArray stk){
		if(!stk.isEmpty()){
			int temp = stk.pop();
			sortRecursive(stk);
			insert(stk,temp);
		}
	}
	
	/*
	 * push the top element in Stack to the right position
	 */
	public void insert(StackArray stk, int temp){
		if(stk.isEmpty())
			stk.push(temp);
		else if(temp > stk.top())
			stk.push(temp);
		else{
			int u = stk.pop();
			insert(stk, temp);
			stk.push(u);
		}
	}
}//end class
