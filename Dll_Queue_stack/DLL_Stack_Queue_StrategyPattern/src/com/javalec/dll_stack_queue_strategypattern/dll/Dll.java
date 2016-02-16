package com.javalec.dll_stack_queue_strategypattern.dll;

public class Dll{

	protected int size = 0;
	protected Node head = null;
	protected Node tail = null;
	
	private IInsert insert;
	private IOutput output;
	
	private static Dll dll = null;
	
	protected Dll() {
	}
	
	public static Dll getInstance() {
		if(dll == null) {
			dll = new Dll();
		}
		return dll;
	}
	
	public int getSize() {
		return size;
	}
	
	public Node getHead() {
		return head;
	}
	
	public boolean isEmpty() {
		return this.head == null && this.tail == null;
	}
	
	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public void setInsert(IInsert insert) {
		this.insert = insert;
	}
	
	public void insert(Node node) {
		insert.insert(node);
	}
	
	public void setOutput(IOutput output) {
		this.output = output;
	}
	
	public Node output(){
		return output.output();
	}

}
