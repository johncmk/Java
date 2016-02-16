/**
 * Singly LinkedList 
 * provide print ,insert, delete, contains, sort, reverse
 * @author John
 */
public class LinkedList{

	public Node head;
	public int size;
	
	/*
	 * constructor
	 */
	public LinkedList(){
		this.head = null;
		this.size = 0;
	}
	
	/*
	 * return head of the LL
	 */
	public Node getHead() {
		return head;
	}
	
	/*
	 * set head of the LL
	 */
	public void setHead(Node head) {
		this.head = head;
	}
	
	/*
	 * set size of the LL
	 */
	public int getSize() {
		return size;
	}

	/*
	 * if the LL is empty return true else return false
	 */
	public boolean isEmpty(){
		return (getHead() == null);
	}
	
	/*
	 * Recursively print node
	 */
	public void print(){
		if (this.isEmpty())
			System.out.println("The list is empty");
		Node current = this.getHead();
		while(current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	/*
	 * Search helpful function; iterates
	 */
	private Node _search(int data, Node previous){
		Node current = previous.getNext();
		try{
			return (current.getData() == data)? previous: (current == null)? null: _search(data,current);
		}catch(NullPointerException e){
			System.out.println(data +" is not in the list");
		}
		return current;
	}
	
	/*
	 * Search the data from LL and return it
	 */
	public Node search(int data){		
		if(this.isEmpty())
			throw new NullPointerException("The list is empty");
		Node previous = this.head;
		Node current = previous.getNext();
		if(previous.getData() == data || current.getData() == data)
			return previous;
		return _search(data, current);
	}
	
	/*
	 * insert node; prepend
	 */
	public void insert(int data){
		Node newNode = new Node(data);
		if(this.getHead() != null){
			newNode.setNext(this.getHead());
			this.setHead(newNode);
		}else	
			this.setHead(newNode);
		size++;
	}
	
	/*
	 * delete case1; if the node is not found/ list is empty
	 */
	private boolean deleteCase1(Node found){
		return (found == null || this.isEmpty());
	}
	
	/*
	 * delete case2; if node is in head of the list
	 */
	private boolean deleteCase2(Node found){
		return this.getHead() == found;
	}
	
	/*
	 * delete case3; if node is in the middle/end of the list
	 */
	private void deleteCase3(Node previous, Node current){
		previous.setNext((current.getNext() != null)? current.getNext(): null);
	}
	
	/*
	 * delete node from LL
	 */
	public void delete(int data){
		Node found = search(data);
		if(deleteCase1(found))
			return;
		else if(deleteCase2(found))
			this.setHead(found.getNext());
		else
			deleteCase3(found,found.getNext());
		size--;
	}
	
	/*
	 * recursively search helpful function
	 */
	private boolean _contains(Node current, int find){
		if(current == null)
			return false;
		else if(current.getData() == find)
			return true;
		_contains(current.getNext(),find);
		return false;
	}
	
	/*
	 * recursively search
	 */
	public boolean contains(int find){
		if(this.isEmpty())
			return false;
		return _contains(getHead(),find);
	}
	
	/*
	 * Reverse the order of the linked list
	 * Iterative version
	 */
	public void reverse(LinkedList li){
		if(li.getSize() <= 1)
			return;
		Node p = null; 
		Node c = li.getHead();
		Node n = null;
		while( c != null){
			n = c.getNext();
			c.setNext(p);
			p = c;
			c = n;
		}
		li.setHead(p);
	}
	
	/*
	 * recursively reverse the list
	 */
	public void reverseRecusive(){
		if(this.getSize() <= 1)
			return;
		_reverseRecursive(this,this.getHead());
	}
	
	/*
	 * helper function for recursive reverse
	 */
	private void _reverseRecursive(LinkedList li, Node hNode){
		Node f = hNode;
		Node r = f.getNext();
		if(r == null){
			li.head = f;
			return;
		}
		_reverseRecursive(li,r);
		r.setNext(f);
		f.setNext(null);
	}
	
	/*
	 * merge sort;ascending order
	 */
	public void mergeSort(){
		this.setHead(_mergeSort(this.getHead()));
	}
	
	/*
	 * merge sort; helper function
	 */
	private Node _mergeSort(Node head){
		if(head == null || head.getNext() == null)
			return head;
		Node left = head;
		Node mid = getMid(head);
		Node right = mid.getNext();
		mid.setNext(null);
		Node l = _mergeSort(left);
		Node r = _mergeSort(right);
		return merge(l,r);
	}
	
	/**
	 * return the middle of the LL
	 */
	private Node getMid(Node head) {
		if(head == null)
			return null;
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.getNext() != null && (fast.getNext()).getNext() != null){
			fast = (fast.getNext()).getNext();
			slow = slow.getNext();
		}
		return slow;
	}
	
	/**
	 * merge the left and right linked list
	 */
	private Node merge(Node l, Node r) {
		Node result;
		if(l == null)
			return r;
		else if(r == null)
			return l;
		else if(r.getData() <= l.getData()){
			result = r;
			result.setNext(merge(l, r.getNext()));
		}else{
			result = l;
			result.setNext(merge(l.getNext(), r));
		}
		return result;
	}
	
}//End of class
