import org.w3c.dom.Node;

import java.util.Stack;

public class DiameterOfBinaryTree543 {
    static int max = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        System.out.print(diameterOfBinaryTree(root));
    }

    /*    Input: root = [1,2,3,4,5]
        Output: 3
        Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].*/
    public static int diameterOfBinaryTree(TreeNode root) {
       Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int lenght = 1;
        int maxLength = Integer.MIN_VALUE;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null || node.right != null) {
                lenght++;
                stack.push(node.left);
                stack.push(node.right);
            }
        }
        return lenght;
/*        max = maxDepth(root);
        return max;*/
    }

   public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
   }

    public static class TreeNode {
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