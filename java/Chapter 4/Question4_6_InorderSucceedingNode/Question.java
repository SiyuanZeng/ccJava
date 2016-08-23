package Question4_6_InorderSucceedingNode;

import CtCILibrary.TreeNode;

public class Question {

	public static TreeNode inorderSucc(TreeNode node) { 
		if (node == null) return null;
		
		// Found right children -> return left most node of right subtree
		if (node.parent == null || node.right != null) { 
			return leftMostChild(node.right); 
		} else {// parent != null && node.right = null.  
			TreeNode dupNode = node;
			TreeNode parent = dupNode.parent;
			// Go up until we’re on left instead of right
			while (parent != null && parent.left != dupNode) { // node is not on the left, stop search when the node is on the left. If RIGHT, KEEP Searching.
				// How to read the while loop, when to stop and exit the loop.
				dupNode = parent;
				parent = parent.parent;
			}
			return parent;
		}  
	} 
		
	public static TreeNode leftMostChild(TreeNode n) {
		if (n == null) {
			return null;
		}
		while (n.left != null) {
			n = n.left; 
		}
		return n; 
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		for (int i = 0; i < array.length; i++) {
			TreeNode node = root.find(array[i]);
			TreeNode next = inorderSucc(node);
			if (next != null) {
				System.out.println(node.data + "->" + next.data);
			} else {
				System.out.println(node.data + "->" + null);
			}
		}
	}

}
