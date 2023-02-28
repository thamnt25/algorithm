
package binarytree_breadthfirstsearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

	public static void main(String[] agrs) {
		System.out.println("SameTree");

	}

	public Node cloneGraph(Node node) {
		Map<Integer, Node> store = new HashMap<Integer, Node>();
		if (node == null)
			return null;
		return helper(node, store);
	}

	public Node helper(Node node, Map<Integer, Node> store) {

		if (store.containsKey(node.val))
			return store.get(node.val);
		store.put(node.val, new Node(node.val));

		if (node.neighbors == null)
			return store.get(node.val);
		for (Node neighbor : node.neighbors) {
			store.get(node.val).neighbors.add(helper(neighbor, store));
		}
		return store.get(node.val);
	}

	class Node {
		public int val;
		public List<Node> neighbors;

		public Node() {
			val = 0;
			neighbors = new ArrayList<Node>();
		}

		public Node(int _val) {
			val = _val;
			neighbors = new ArrayList<Node>();
		}

		public Node(int _val, ArrayList<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}
	}
}
