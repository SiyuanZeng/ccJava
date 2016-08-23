package Question4_7_CommonAncestor;

import CtCILibrary.TreeNode;

public class QuestionB {	
	public static boolean covers(TreeNode root, TreeNode node) {
		if (root == null) {
			return false;
		}
		if (root == node) {
			return true;
		}
		return covers(root.left, node) || covers(root.right, node);
	}
		
	public static TreeNode commonAncestorHelper(TreeNode root, TreeNode node1, TreeNode node2) {
		if (root == null) {
			return null;
		}
		// Why left?
		boolean isNode1onLeft = covers(root.left, node1);
		boolean isNode2onLeft = covers(root.left, node2);
		if (isNode1onLeft != isNode2onLeft) { // Nodes are on different side? why? This make sure why it will goes to THE LINE AFTER.
			return root;
		}
		TreeNode child_side = isNode1onLeft ? root.left : root.right;// Why does it have to do this?
		return commonAncestorHelper(child_side, node1, node2);// Go to the right branch.
	}
	
	public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (!covers(root, p) || !covers(root, q)) { // Error check - one node is not in tree
			return null;
		}
		return commonAncestorHelper(root, p, q);
	}	
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		TreeNode n3 = root.find(1);
		TreeNode n7 = root.find(7);
		TreeNode ancestor = commonAncestor(root, n3, n7);
		System.out.println(ancestor.data);
	}
}
