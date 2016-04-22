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
	 * print preorder traverse; 
	 * 1) Each time node of traversal is point to null
	 * 		level will reset to 0
	 * 2) tab reset such as set to empty then add '\t' as much as the level counts							
	 * @param t
	 */
	public void print_t() {
		_print_t(this.root, new StringBuilder(),0);
	}
	
	private void _print_t(Node root, StringBuilder tab, int level) {
		if(root == null) {
			return;
		}
		
		Node l = root.getLeft();
		int rt = root.getData();
		Node r = root.getRight();
		
		System.out.println(tab.substring(0, level) + "" + rt);
		tab.append('\t');
		_print_t(l,tab,level+1);
		_print_t(r,tab,level+1);
	}
	
	/**
	 * return sorted order of BST
	 * @param root
	 * @return return sorted array list from BST
	 */
	public ArrayList<Integer> _sorted() {
		return _sorted(this.root, new ArrayList<Integer>());
	}
	
	private ArrayList<Integer> _sorted(Node root) {
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
	 * @return root or parent
	 */
	private Node _search(Node root,int x) {
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
	 * @return true or false
	 */
	public boolean search(int x) {
		Node sub_t = _search(this.root,x);
		if(sub_t.getData() != x) {
			return false;
		}
		return true;
	}	
	
	/**
	 * insert node into BST; 1) duplicate value is not allowed
	 * 						 2) if x is not found it will return parent node 
	 * 							of place where x should be inserted to
	 * @param root
	 * @param x
	 */
	public void insert(int x) {
		Node sub_t = _search(this.root,x);
		
		if(sub_t.getData() == x) {
			throw new Error("### "+x+" already exists ###");
		}
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
	 * @return parent,root
	 */
	/*
	 * Alternative ways of returning list; use 1) for readability else use 2) for saving space
	 * 1) set_nodes(li,null,root);
		  return li;
		  
	   2) return set_nodes(li,null,root);
	 */
	private Node[] _search_parent(Node root, int x, Node parent, Node[] li) {
		if(root == null) {
			set_nodes(li,null,root);
			return li;
		}
	
		Node l = root.getLeft();
		int rt = root.getData();
		Node r = root.getRight();
		
		if(rt == x && parent == null) {
			System.out.println(x + " is the root of the BST");
			set_nodes(li,parent,root);
			return li;
		}
		if(rt == x) {
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
	
	private Node[] set_nodes(Node[] li, Node parent, Node root) {
		li[0] = parent;
		li[1] = root;
		return li;
	}
	
	/**
	 * Delete Node in BST
	 * 4 cases; 1) Both left and right child exist
	 * 			2) ONLY right child exist
	 * 			3) ONLY left child exist
	 * 			4) Both left and right child not exist
	 * @param root
	 * @param x
	 */
	public void delete(int x) {
		delete(this.root,x);
	}
	
	public void delete(Node root, int x) {	
		Node[] li = _search_parent(root,x,null,new Node[2]);
		Node parent = li[0];
		Node t = li[1];
		
		if(t == null && parent == null) {
			throw new Error(x + " not exists in BST");
		}
		
		Node l = t.getLeft();
		int rt = t.getData();
		Node r = t.getRight();
		
		if(l != null && r != null) {
			int key = _sorted(r).get(0);
			delete(t,key);
			t.setData(key);
		} else if(r != null) {
			_delete(r,rt,parent);
		} else if(l != null){
			_delete(l,rt,parent);
		} else {
			_delete(null,rt,parent);
		}
	}
	
	//Root,x,parent
	private void _delete(Node sub_t, int rt, Node parent) {
		if(parent.getData() < rt) {
			parent.setRight(sub_t);
		} else {
			parent.setLeft(sub_t);
		}
	}
	
}//End Class
