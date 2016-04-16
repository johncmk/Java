package com.javalec.bst;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST t = new BST(new Node(4,
								new Node(2,
										new Node(1),
										new Node(3)),
								new Node(6,
										new Node(5),
										new Node(7,
												null,
												new Node(9)
															))));
		
		t.print_t();
		System.out.println(t._sorted().toString());
		System.out.println(t.search(4));
		t.insert(10);
		t.insert(0);
		t.insert(8);
		t.insert(15);
		t.print_t();
		System.out.println(t._sorted());
		t.delete(0);
		t.delete(6);
		t.delete(15);
		t.print_t();
		
	}

}
