package com.javalec.bst;

import java.util.ArrayList;

public class BST {

	private Node root;

	public BST() {
		
	}
	
	public BST(Node root) {
		super();
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	/**
	 * print preorder traverse
	 * @param t
	 */
	public void print_t(Node root) {
		_print_t(root, new StringBuilder(),0);
	}
	
	private void _print_t(Node root, StringBuilder tab, int level) {
		if(root == null) {
			level = 0; //reset the level
			return;
		}
		
		Node l = root.getLeft();
		int rt = root.getData();
		Node r = root.getRight();
		
		//increase the number of tab depends on level
		tab.delete(0, tab.length());
		for(int i = 0 ; i < level; i++) {
			tab.append('\t');
		}
		
		System.out.println(tab + "" + rt);
		_print_t(l,tab,level+1);
		_print_t(r,tab,level+1);
	}
	
	/**
	 * return sorted order of BST
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> _sorted(Node root) {
		return _sorted(root, new ArrayList<Integer>());
	}
	
	private ArrayList<Integer> _sorted(Node root, ArrayList<Integer> li) {
		if(root == null) {
			return li;
		}
		Node l = root.getLeft();
		int rt = root.getData();
		Node r = root.getRight();
		_sorted(l,li);
		li.add(rt);
		_sorted(r,li);
		return li;
		
	}

	/**
	 * return found node else return its parent
	 * @param root
	 * @param x
	 * @return
	 */
	public Node _search(Node root,int x) {
		return _search(root,x, null);
	}
	
	private Node _search(Node root,int x, Node parent) {
		if(root == null) {
			return parent;
		}
		Node l = root.getLeft();
		int rt = root.getData();
		Node r = root.getRight();
		
		if(rt == x) {
			return root;
		} 
		parent = root;
		if(rt < x) {
			return _search(r,x,parent);
		}
		return _search(l,x,parent);
	}
	
	/**
	 * return true if node is found else false
	 * @param root
	 * @param x
	 * @return
	 */
	public boolean search(Node root,int x) {
		Node sub_t = _search(root,x);
		if(sub_t.getData() != x) {
			return false;
		}
		return true;
	}
	
	/**
	 * insert node into BST; duplicate value is not allowed
	 * @param root
	 * @param x
	 */
	public void insert(Node root, int x) {
		Node sub_t = _search(root,x);
		
		if(sub_t.getData() == x) {
			throw new Error("### "+x+" already exists ###");
		}
		//if sub_t is not x then it's parent of the inserted spot
		if(sub_t.getData() < x) {
			sub_t.setRight(new Node(x));
		} else {
			sub_t.setLeft(new Node(x));
		}
		
	}
	
	/**
	 * return subtree of the root and its parent
	 * @param root
	 * @param x
	 * @return
	 */
	private Node[] _search_parent(Node root, int x) {
		Node li[] = new Node[2];
		return _search_parent(root,x,null,li);
	}
	
	
	private Node[] _search_parent(Node root, int x, Node parent, Node[] li) {
		if(root == null) {
			set_nodes(li,null,root);
			return li;
		}
	
		Node l = root.getLeft();
		int rt = root.getData();
		Node r = root.getRight();
		
		if(rt == x && parent != null) {
			set_nodes(li,parent,root);
			return li;
		}
		
		if(rt == x && parent == null) {
			System.out.println(x + " is the root of the BST");
			set_nodes(li,parent,root);
			return li;
		}
		parent = root;
		if(rt < x) {
			set_nodes(li,parent,r);
			return _search_parent(r,x,parent,li);
		}
		set_nodes(li,parent,l);
		return _search_parent(l,x,parent,li);
	}
	
	private void set_nodes(Node[] li, Node parent, Node root) {
		li[0] = parent;
		li[1] = root;
	}
	
	/**
	 * Delete Node in BST
	 * @param root
	 * @param x
	 */
	public void delete(Node root, int x) {
		
		Node[] li = _search_parent(root,x);
		Node parent = li[0];
		Node t = li[1];
		
		if(t == null && parent == null) {
			System.out.println(x + " not exists in BST");
			return;
		}
		
		Node l = t.getLeft();
		int rt = t.getData();
		Node r = t.getRight();
		
		if(l == null && r == null) {
			_delete(parent,null,rt);
		}
		else if(l != null && r == null) {
			_delete(parent,l,rt);
		}
		else if(l == null && r != null) {
			_delete(parent,r,rt);
		}
		else {
			int key = _sorted(r).get(0);
			delete(root,key);
			t.setData(key);
		}
	}
	
	private void _delete(Node parent, Node sub_t, int rt) {
		if(parent.getData() < rt) {
			parent.setRight(sub_t);
		} else {
			parent.setLeft(sub_t);
		}
	}
	
}//End Class
