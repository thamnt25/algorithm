
public class LowestCommonAncestor235 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(6,
				new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
				new TreeNode(8, new TreeNode(7), new TreeNode(9)));
		// System.out.print(lowestCommonAncestor(root, ));

	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		while ((root.val - p.val) * (root.val - q.val) > 0) {
			root = (root.val - p.val) > 0 ? root.left : root.right;
		}
		return root;

	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		TreeNode(int x, TreeNode left, TreeNode right) {
			val = x;
			this.left = left;
			this.right = right;
		}
	}

}
