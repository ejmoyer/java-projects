package binaryTree;

//create a node class here
//nodes will have left and right values (that will be other nodes)
//left and right will start at NULL and then the tree will fill them with nodes
class Node {
	int value; // int value here (root)
	Node left; // left (node)
	Node right; // right(node)
	
	// constructor for a new node
	public Node(int nodeValue) {
		value = nodeValue;
		left = null; // these values will be null
		right = null; // nodes will be added manually
	}
}
// creating the actual empty tree
public class BinaryTree {
	Node root; // need root
	// constructor for an empty tree
	BinaryTree() {
		root = null;
	}
}



