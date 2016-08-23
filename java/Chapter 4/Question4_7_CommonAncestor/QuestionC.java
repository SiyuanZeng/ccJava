package Question4_7_CommonAncestor;

import CtCILibrary.TreeNode;

public class QuestionC {
	public static class Result {
		public TreeNode node;
		public boolean isAncestor;
		public Result(TreeNode n, boolean isAnc) {
			node = n;
			isAncestor = isAnc;
		}
	}
	
	public static Result commonAncestorHelper(TreeNode root, TreeNode node1, TreeNode node2) {
		if (root == null) {
			return new Result(null, false);
		}
		if (root == node1 && root == node2) {
			return new Result(root, true);
		}
		
		Result resultLeft = commonAncestorHelper(root.left, node1, node2);
		if (resultLeft.isAncestor) { // Found common ancestor
			return resultLeft;
		}
		
		Result resultRight = commonAncestorHelper(root.right, node1, node2);
		if (resultRight.isAncestor) { // Found common ancestor
			return resultRight;
		}
		
		if (resultLeft.node != null && resultRight.node != null) {// Match both
			return new Result(root, true); // This is the common ancestor
		} else if (root == node1 || root == node2) {// Find one here and another in the subtree in the following
			/* If we’re currently at node1 or node2, and we also found one of those
			 * nodes in a subtree, then this is truly an ancestor and the
			 * flag should be true. */
			boolean isAncestor = resultLeft.node != null || resultRight.node != null ? true : false;
			return new Result(root, isAncestor);
		} else { // At least one node, but still false. This is the bubble-up Result.
			return new Result(resultLeft.node != null ? resultLeft.node : resultRight.node, false);
		}
	}	
	
	public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		Result r = commonAncestorHelper(root, p, q);
		if (r.isAncestor) {
			return r.node;
		}
		return null;
	}	
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		TreeNode n3 = root.find(10);
		TreeNode n7 = root.find(6);
		TreeNode ancestor = commonAncestor(root, n3, n7);
		if (ancestor != null) {
			System.out.println(ancestor.data);
		} else {
			System.out.println("null");
		}
	}

}
