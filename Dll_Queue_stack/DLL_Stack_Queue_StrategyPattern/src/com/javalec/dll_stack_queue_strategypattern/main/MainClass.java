package com.javalec.dll_stack_queue_strategypattern.main;
import com.javalec.dll_stack_queue_strategypattern.dll.Dll;
import com.javalec.dll_stack_queue_strategypattern.dll.Node;
import com.javalec.dll_stack_queue_strategypattern.dll.Queue;
import com.javalec.dll_stack_queue_strategypattern.dll.Stack;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dll dll = Dll.getInstance();
		dll.setInsert(new Stack());
		dll.setOutput(new Stack());
		dll.insert(new Node(1));
		dll.setInsert(new Queue());
		dll.insert(new Node(2));
		dll.insert(new Node(3));
		dll.insert(new Node(4));
		dll.insert(new Node(5));
		
		System.out.println("size " + dll.getSize());

		dll.setOutput(new Queue());
		
		while(!dll.isEmpty()) {
			System.out.println(dll.output().getData());
		}
		
	}//End Main
}//End Class
