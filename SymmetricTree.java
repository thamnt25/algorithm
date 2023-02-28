
public class SymmetricTree {
	public static void main(String[] args) {

	}

	public boolean isSymmetric(TreeNode root) {
		return isSymmetricHelp(root.right, root.left);
	}

	public boolean isSymmetricHelp(TreeNode rightTree, TreeNode leftTree) {
		if (rightTree == null || leftTree == null) {
			return rightTree == leftTree;
		} else if (rightTree.val != leftTree.val) {
			return false;
		}
		return isSymmetricHelp(rightTree.left, leftTree.right) && isSymmetricHelp(rightTree.right, leftTree.left);
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
