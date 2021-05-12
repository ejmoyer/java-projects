package binaryTree;

public class BinaryTreeDriver {
	// create a binary tree, add some nodes to it
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		
		bt.root = new Node(3);
		
		bt.root.left = new Node(2);
		bt.root.right = new Node(4);
		
		bt.root.left.left = new Node(1);
		bt.root.right.right = new Node(5);
		
		search(bt.root, 6);
		preorder(bt.root);
		inorder(bt.root);
		postorder(bt.root);
	}
	
	public static void search(Node bt, int searchVal) {
		if (bt == null) return;
		// if we find our value, print out that it is in the tree
		if (bt.value == searchVal) System.out.println("Search value in tree.");
		
		search(bt.left, searchVal);
		search(bt.right, searchVal);
	}
	
	public static void preorder(Node bt) {
		if (bt == null) return;
		
		System.out.println(bt.value);
		preorder(bt.left);
		preorder(bt.right);
	}
	
	public static void inorder(Node bt) {
		if (bt == null) return;
		
		inorder(bt.left);
		System.out.println(bt.value);
		inorder(bt.right);
	}
	
	public static void postorder(Node bt) {
		if (bt == null) return;
		
		postorder(bt.left);
		postorder(bt.right);
		System.out.println(bt.value);
	}
}
