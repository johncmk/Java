package com.javalec.dll_stack_queue_strategypattern.dll;

/*
 * Add to head
 */
public class Queue extends Dll implements IInsert, IOutput {
	
	private Dll dll = Dll.getInstance();
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return dll.size == 0;
	}
	
	/**
	 * Prepend
	 */
	@Override
	public void insert(Node node) {
		// TODO Auto-generated method stub
		if(dll.isEmpty()) {
			dll.head = node;
			dll.tail = node;
		} else {
			node.setNext(dll.head);
			dll.head.setPrev(node);
			dll.head = node;
			dll.head.setPrev(null);
		}
		dll.size++;
	}

	/**
	 * Output from head
	 */
	@Override
	public Node output() {
		// TODO Auto-generated method stub
		if(dll.isEmpty()) {
			throw new Error("Queue is currently empty");
		} 
		Node pop = dll.head;
		dll.head = dll.head.getNext();
		dll.size--;
		if(dll.size == 0) {
			dll.head = null;
			dll.tail = null;
		}
		return pop;
	}


}
