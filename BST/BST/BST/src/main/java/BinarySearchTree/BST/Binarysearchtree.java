package BinarySearchTree.BST;
import java.lang.String;


public class Binarysearchtree {
	// Binary Search Tree operations in Java

	
	  public class Node {
	    String key;
	    Node left, right;

	    public Node(String item) {
	      key = item;
	      left = right = null;
	      
	      
	    }
	    
	  }

	  Node root;

	  Binarysearchtree() {
	    root = null;
	  }

	  void insert(String key) {
	    root = insertKey(root, key);
	  }

	  // Insert key in the tree
	  Node insertKey(Node root, String key) {
	    // Return a new node if the tree is empty
	    if (root == null) {
	      root = new Node(key);
	      return root;
	    }

	    // Traverse to the right place and insert the node
	    if (key.length() < root.key.length())
	    //	int comp = key.compareTo(root.key);
	    	
	      root.left = insertKey(root.left, key);
	    else if (key.length() >= root.key.length())
	      root.right = insertKey(root.right, key);

	    return root;
	  }

	  void inorder() {
	    inorderRec(root);
	  }
	  

	  // Inorder Traversal
	  void inorderRec(Node root) {
	    if (root != null) {
	      inorderRec(root.left);
	      System.out.print(root.key + "\n");
	      inorderRec(root.right);
	    }
	  }

	  void deleteKey(String key) {
	    root = deleteRec(root, key);
	  }

	  Node deleteRec(Node root, String key) {
	    // Return if the tree is empty
	    if (root == null)
	      return root;
	    return root;
	  }

	  // Find the inorder successor
	  String minValue(Node root) {
	    String minv = root.key;
	    while (root.left != null) {
	      minv = root.left.key;
	      root = root.left;
	    }
	    return minv;
	  }

	  
}

