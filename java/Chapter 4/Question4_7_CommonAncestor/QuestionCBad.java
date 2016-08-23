package Question4_7_CommonAncestor;

import CtCILibrary.TreeNode;



public class QuestionCBad {
/*In subtree, Return from subtrees
* In current tree, return from current tress
* In current tree, process subtree return
*
*
*
*
*
*
* */
	public static TreeNode commonAncestorBad(TreeNode root, TreeNode node1, TreeNode node2) {
		if (root == null) {
			return null;
		}
		if (root == node1 && root == node2) {
			return root;
		}
		
		TreeNode leftCommonAncestor = commonAncestorBad(root.left, node1, node2);
		if (leftCommonAncestor != null && leftCommonAncestor != node1 && leftCommonAncestor != node2) { // Found common ancestor
			return leftCommonAncestor;
		}
		
		TreeNode rightCommonAncestor = commonAncestorBad(root.right, node1, node2);
		if (rightCommonAncestor != null && rightCommonAncestor != node1 && rightCommonAncestor != node2) { // Found common ancestor
			return rightCommonAncestor;
		}
		
		if (leftCommonAncestor != null && rightCommonAncestor != null) { // Both in the 2 branch? What if this is found in the subtress?
			return root; // This is the common ancestor
		} else if (root == node1 || root == node2) { //What is this? It just match one, but not both.
			return root;
		} else {
			return leftCommonAncestor == null ? rightCommonAncestor : leftCommonAncestor; // Return the one from subtrees.???????????????????????????
		}
	}	
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		TreeNode n3 = root.find(9);
		TreeNode n7 = new TreeNode(6);//root.find(10);
		TreeNode ancestor = commonAncestorBad(root, n3, n7);
		if (ancestor != null) {
			System.out.println(ancestor.data);
		} else {
			System.out.println("null");
		}
	}

}
