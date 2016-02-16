
public class LinkedListSinglyMain {

	private static LinkedList li = new LinkedList();
	
	
	public static void main(String[] args) {

	for(int i = 0;i < 10; i++){
		li.insert(i+1);
	}
	
	li.print();
	li.delete(1);
	li.delete(5);
	li.delete(11);
	System.out.println("After delete 1, 5, 10");
	li.print();
	
	System.out.println("After Reverse");
	li.mergeSort();
	li.print();
	
	}//End of main

}//End of class
