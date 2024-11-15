package com.assign.q1;

class BST {

	static class Node {
		int data;
		Node left, right;

		public Node(int val) {
			data = val;
			left = right = null;
		}
	}

	private Node root;

	// Constructor to initialize an empty BST
	public BST() {
		root = null;
	}

	// Recursive method to insert a new data into the BST
	public Node insert(Node root, int data) {
		// Base case: if the tree/subtree is empty, create a new node
		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data) {
			root.left = insert(root.left, data); // Insert in left subtree
		} else if (data > root.data) {
			root.right = insert(root.right, data); // Insert in right subtree
		}

		return root;
	}

	public void add(int data) {
		root = insert(root, data);
	}

////////////////////////////////////////////////////////////////////////////////////

	private void inOrder(Node trav) {
		// 1. stop if left or right sub tree is absent
		if (trav == null)
			return;
		// 3. go in left current node
		inOrder(trav.left);
		// 2. print / visit current node
		System.out.print(" " + trav.data);
		// 4. go in right of current node
		inOrder(trav.right);
	}

	public void inOrder() {
		System.out.print("Inorder : ");
		inOrder(root);
		System.out.println();
	}

////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		BST bst = new BST();
		bst.add(50);
		bst.add(30);
		bst.add(20);
		bst.add(40);
		bst.add(70);
		bst.add(60);
		bst.add(80);

		System.out.print("Inorder traversal of the BST: ");
		bst.inOrder(); // Display inorder traversal
	}

}
