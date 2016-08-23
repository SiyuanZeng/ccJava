package Question4_7_CommonAncestor.OverloadTreeNodeForQuestion;

import CtCILibrary.BTreePrinter;

/* One node of a binary tree. The data element stored is a single
 * character.
 */
public class TreeNode extends CtCILibrary.TreeNode {
	public int data;      
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
	private static int size = 0;



	public TreeNode(int d) {
		data = d;
		size = 1;
	}
	
	public void setLeftChild(TreeNode left) {
		this.left = left;
		if (left != null) {
			left.parent = this;
		}
	}
	
	public void setRightChild(TreeNode right) {
		this.right = right;
		if (right != null) {
			right.parent = this;
		}
	}
	
	public void insertInOrder(int d) {
		if (d <= data) {
			if (left == null) {
				setLeftChild(new TreeNode(d));
			} else {
				left.insertInOrder(d);
			}
		} else {
			if (right == null) {
				setRightChild(new TreeNode(d));
			} else {
				right.insertInOrder(d);
			}
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isBST() {
		if (left != null) {
			if (data < left.data || !left.isBST()) {
				return false;
			}
		}
		
		if (right != null) {
			if (data >= right.data || !right.isBST()) {
				return false;
			}
		}		
		
		return true;
	}
	
	public int height() {
		int leftHeight = left != null ? left.height() : 0;
		int rightHeight = right != null ? right.height() : 0;
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public TreeNode find(int d) {
		if (d == data) return this;
		else if (d <= data) return left != null ? left.find(d) : null;
		else if (d > data) return right != null ? right.find(d) : null;
		return null;
	}
	
	private static TreeNode createMinimalBST(int arr[], int start, int end){
		if (end < start) return null;
		// What does this mean?
		// What about 9;
		// 4.5
		// 5, 4
		// 3, 2
		// 2,1
		//
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		size++;
		n.setLeftChild(createMinimalBST(arr, start, mid - 1));
		n.setRightChild(createMinimalBST(arr, mid + 1, end));
		return n;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof TreeNode)) return false;

		TreeNode treeNode = (TreeNode) o;

		return  (data == treeNode.data) ;

	}

	@Override
	public int hashCode() {
		int result = data;
		return result;
	}

	public static TreeNode createMinimalBST(int array[]) {
		return createMinimalBST(array, 0, array.length - 1);
	}
	
	public void print() {
		BTreePrinter.printNode(this);
	}

	//todo how to print tree

	//todo how to print tree by layer
	public void printLayer(int i) {
	}

} 