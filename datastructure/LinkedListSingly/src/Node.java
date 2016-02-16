
public class Node {

	private int data;
	private Node next;
	
	/*
	 * default constructor
	 */
	public Node(){
		this.data = 0;
		this.next = null;
	}

	/*
	 * parameter constructor
	 */
	public Node(int num){
		this.setData(num);
		this.next = null;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node node) {
		this.next = node;
	}
	
}//End of class
