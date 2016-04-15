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
		
		t.print_t(t.getRoot());
		System.out.println(t._sorted(t.getRoot()).toString());
		System.out.println(t.search(t.getRoot(), 4));
		t.insert(t.getRoot(), 10);
		t.insert(t.getRoot(), 0);
		t.insert(t.getRoot(), 8);
		t.print_t(t.getRoot());
		System.out.println(t._sorted(t.getRoot()));
	
		
		t.delete(t.getRoot(), 0);
		t.delete(t.getRoot(), 6);
		t.print_t(t.getRoot());
	}

}
