package stack_array;
import java.util.ArrayList;

/*
 * push,pop
 * size
 * top
 */
public class Stack {

	private int ptr = -1;
	private int size = 0;
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	private static Stack stk = null;
	
	private Stack() {}
	
	/*
	 * Singleton
	 */
	public static Stack getInstance() {
		if(stk == null) {
			stk = new Stack();
		}
		return stk;
	}
	
	/*
	 * Check if the stack is emtpy
	 */
	public boolean isEmpty() {
		return (ptr == -1 && size == 0);
	}
	
	/*
	 * Return size
	 */
	public int size() {
		return size;
	}
	
	/*
	 * push data into a stack
	 */
	public void push(int data) {
		this.arr.add(data);
		ptr++;
		size++;
	}
	
	/*
	 * pop data from a stack
	 */
	public int pop() {
		if(this.isEmpty()) {
			return -1;
		} else {
			size--;
			return arr.get(ptr--);
		}
	}
	
	/*
	 * Return the top element from a stack
	 */
	public int top() {
		if(this.isEmpty()) {
			return -1;
		} else {
			return arr.get(ptr);
		}
	}
	
}//End class
