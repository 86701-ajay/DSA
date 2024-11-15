package com.assign.q2;

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

	public BST() {
		root = null;
	}

	public Node insert(Node root, int data) {
		
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
	
	// Recursive method to search for a value in the BST
    public boolean search(Node root, int key) 
    {
        // Base case: root is null or key is present at root
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        // Key is greater than root's value, search in right subtree
        if (key > root.data) {
            return search(root.right, key);
        } 
        // Key is smaller than root's value, search in left subtree
        else {
            return search(root.left, key);
        }
    }

    // Method to call search function from the root
    public boolean contains(int key) {
        return search(root, key);
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

		int keyToSearch = 160;
        if (bst.contains(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " is found in the BST.");
        } else {
            System.out.println("Key " + keyToSearch + " is not found in the BST.");
        }
	}

}
