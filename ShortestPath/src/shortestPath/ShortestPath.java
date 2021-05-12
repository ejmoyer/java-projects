package shortestPath;

import java.util.HashMap;

class Node {
	HashMap<Node, Integer> hash_map = new HashMap<Node, Integer>();
	int myShortestDistance = Integer.MAX_VALUE;
}

public class ShortestPath {
	
	public static void main(String[] args) {
		Node s = new Node();
		Node t = new Node();
		Node y = new Node();
		Node x = new Node();
		Node z = new Node();
		
		Node[] nodeArr = {s, y, t, z, x};
		s.hash_map.put(t, 10);
		s.hash_map.put(y, 5);
		
		t.hash_map.put(x, 1);
		t.hash_map.put(y, 2);
		
		y.hash_map.put(t, 3);
		y.hash_map.put(z, 2);
		y.hash_map.put(x, 9);
		
		z.hash_map.put(x, 6);
		z.hash_map.put(s, 7);
		
		x.hash_map.put(z, 4);
		traverse(s, 0);
		System.out.println(x.myShortestDistance);
	}
	
	public static void traverse(Node node, int distance) {
		if (distance > node.myShortestDistance) {
			return;
		} else {
			node.myShortestDistance = distance;
			node.hash_map.forEach((k,v)->{
				traverse(k, v + distance);
			});
		}
	}
	
	public static void hashMapPuts(Node[] nodes, int[][] arr) {
		for (int x = 0; x < nodes.length; x++) {
			
		}
	}
}

