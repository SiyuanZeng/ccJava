package Question4_7_CommonAncestor.OverloadTreeNodeForQuestion;


public class Question {
	static int TWO_NODES_FOUND = 2;
	static int ONE_NODE_FOUND = 1;
	static int NO_NODES_FOUND = 0;

	// Why hard?
	// 1. Long process -> break it down
	// 2. Corresponding, check left side only, then check whether the root match another one.
		
	// Checks how many �special� nodes are located under this root
	public static int covers(TreeNode root, TreeNode node1, TreeNode node2) {
		int count = NO_NODES_FOUND;
		if (root == null) return count;


		boolean isAnyNodeMatch = root.equals(node1) || root.equals(node2);
		if (isAnyNodeMatch) count += 1; // root match 1 node

		// It can't match 2 at the same time.
		count += covers(root.left, node1, node2);
		if(count == TWO_NODES_FOUND) /* Found node1 and node2, then just stop*/{
			return count;
		}
		return count + covers(root.right, node1, node2);
	}
		// How does it control how many nodes found?
		// This is not an elegant solution, because it doesn't incorporate the null cases.
	public static TreeNode commonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
		// same nodes
		if (node2.equals(node1) && (root.left.equals(node2) || root.right.equals(node2))) return root;



		// Why are there so many checkes?
		int nodesFromLeft = covers(root.left, node1, node2); // Check left side only
		if (nodesFromLeft == TWO_NODES_FOUND) {// How to pass the node1 up? How to decide to stop? Why TWO_NODES_FOUND? Why? This is a precondition.

			boolean isAtLeastLeftNodeMatched = root.left.equals(node1) || root.left.equals(node2);// This is next level

			if(isAtLeastLeftNodeMatched) {//One node is on the left, then return the left node.
				return root.left;//Why do I need to check this!
			} else {// If there is no matching, dig more. Then it will return up to here.
				return commonAncestor(root.left, node1, node2);//final point, when digging in, it can also be different.
				//This is going to next level.
			}
		} else if (nodesFromLeft == ONE_NODE_FOUND) {// Return, so that it can keep searching the other one. Why return one even there is only one match?
			// Found one and then another one in the root
			if (root.equals(node1)) {
				// What if there are 2 matches, the root and the left nodes?
				// This won't happen, because 2 nodes are not equals, different objects.
				return node1;
			} else if (root.equals(node2)) {
				return node2;
			}
		}
		// 1. return root.left
		// 2. return another recursive call
		// 3. return 1st node
		// 4. return 2nd node

		
		
		int nodesFromRight = covers(root.right, node1, node2); // Check right side only
		if(nodesFromRight == TWO_NODES_FOUND) {
			boolean isAtLeastRightNodeMatched = root.right.equals(node1) || root.right.equals(node2);
			if(isAtLeastRightNodeMatched) {
				return root.right;
			} else {
				return commonAncestor(root.right, node1, node2);
			}
		} else if (nodesFromRight == ONE_NODE_FOUND) {
			if (root.equals(node1)) {
				return node1;
			} else if (root.equals(node2)) {
				return node2;
			}
		}
		// 1. return root.left
		// 2. return another recursive call
		// 3. return 1st node
		// 4. return 2nd node

		
		
		// Common ancester
		boolean isBothNodesMatched = nodesFromLeft == ONE_NODE_FOUND && nodesFromRight == ONE_NODE_FOUND;// What if it returns previously. It is assume that the node is in the tree.
		if (isBothNodesMatched) {
			return root;
		} else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		root.print();
		TreeNode n3 = root.find(1);
		TreeNode n7 = root.find(7);
		//LeetCode.Traversal.TreeNode ancestor = commonAncestor(root, n3, n7);
		n3 = root.find(2);
		//n7 = new LeetCode.Traversal.TreeNode(11);
		//LeetCode.Traversal.TreeNode n7Copy = new LeetCode.Traversal.TreeNode(11);
		//System.out.println(n7.equals(n7Copy));

		// What if I reload the node?
		TreeNode ancestor = commonAncestor(root, n3, null);
		System.out.println(ancestor.data);
	}
}
