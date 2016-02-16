package com.javalec.dll_stack_queue_strategypattern.dll;

/*
 * Add to tail
 */
public class Stack extends Dll implements IInsert, IOutput{

	private Dll dll = Dll.getInstance();
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return dll.size == 0;
	}
	
	/**
	 * Add to tail; append
	 */
	@Override
	public void insert(Node node) {
		// TODO Auto-generated method stub
		if(dll.isEmpty()) {
			dll.head = node;
			dll.tail = (node);
		} else {
			node.setPrev(dll.tail);
			dll.tail.setNext(node);
			dll.tail = node;
			dll.tail.setNext(null);
		}
		dll.size++;			
	}

	/**
	 * Output 
	 */
	@Override
	public Node output() {
		// TODO Auto-generated method stub
		if(this.isEmpty()) {
			throw new Error("Stack is empty");
		}
		Node pop = dll.tail;
		dll.tail = dll.tail.getPrev();
		dll.size--;
		if (dll.size == 0) {
			dll.head = null;
			dll.tail = null;
		}
		return pop;
	}


}
