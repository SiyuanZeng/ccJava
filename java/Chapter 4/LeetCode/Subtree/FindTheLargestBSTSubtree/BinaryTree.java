package LeetCode.Subtree.FindTheLargestBSTSubtree;

import CtCILibrary.TreeNode;

public class BinaryTree {

    static TreeNode root;
    Value val = new Value();

    /* Returns size of the largest BST subtree in a Binary Tree
     (efficient version). */
    int largestBST(TreeNode TreeNode) {
        largestBSTUtil(TreeNode, val, val, val, val);
        return val.maxSize;
    }

    /* largestBSTUtil() updates *maxSizeRef for the size of the largest BST
     subtree.   Also, if the tree rooted with LeetCode.Traversal.TreeNode is non-empty and a BST,
     then returns size of the tree. Otherwise returns 0.*/
    int largestBSTUtil(TreeNode TreeNode, Value minRef, Value maxRef, Value maxSizeRef, Value isBSTref) {

        /* Base Case */
        if (TreeNode == null) {
            isBSTref.isBST = true; // An empty tree is BST
            return 0;    // Size of the BST is 0
        }


        int min = Integer.MAX_VALUE;
        /* A flag variable for left subtree property
         i.e., max(root->left) < root->data */
        boolean leftFlag = false;

        /* A flag variable for right subtree property
         i.e., min(root->right) > root->data */
        boolean rightFlag = false;

        int ls, rs; // To store sizes of left and right subtrees

        /* Following tasks are done by recursive call for left subtree
         a) Get the maximum value in left subtree (Stored in *maxRef)
         b) Check whether Left Subtree is BST or not (Stored in *isBSTref)
         c) Get the size of maximum size BST in left subtree (updates *maxSize) */
        maxRef.max = Integer.MIN_VALUE;
        ls = largestBSTUtil(TreeNode.left, minRef, maxRef, maxSizeRef, isBSTref);
        if (isBSTref.isBST == true && TreeNode.data > maxRef.max) { // current node > left node
            leftFlag = true;
        }

        /* Before updating *minRef, store the min value in left subtree. So that we
         have the correct minimum value for this subtree */
        min = minRef.min;

        /* The following recursive call does similar (similar to left subtree)
         task for right subtree */
        minRef.min = Integer.MAX_VALUE;
        rs = largestBSTUtil(TreeNode.right, minRef, maxRef, maxSizeRef, isBSTref);
        if (isBSTref.isBST == true && TreeNode.data < minRef.min) { // current node < right node
            rightFlag = true;
        }

        // Update min and max values for the parent recursive calls
        if (min < minRef.min) {
            minRef.min = min;
        }
        if (TreeNode.data < minRef.min) // For leaf TreeNodes
        {
            minRef.min = TreeNode.data;
        }
        if (TreeNode.data > maxRef.max) {
            maxRef.max = TreeNode.data;
        }

        /* If both left and right subtrees are BST. And left and right
         subtree properties hold for this LeetCode.Traversal.TreeNode, then this tree is BST.
         So return the size of this tree */
        if (leftFlag && rightFlag) {
            if (ls + rs + 1 > maxSizeRef.maxSize) {
                maxSizeRef.maxSize = ls + rs + 1;
            }
            return ls + rs + 1;
        } else {
            //Since this subtree is not BST, set isBST flag for parent calls
            isBSTref.isBST = false;
            return 0;
        }
    }

    public static void main(String[] args) {
        /* Let us construct the following Tree
                50
             /      \
            10        60
           /  \       /  \
          5   20    55    70
         /     /  \
        45   65    80
         */

        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(50);
        tree.root.left = new TreeNode(10);
        tree.root.right = new TreeNode(60);
        tree.root.left.left = new TreeNode(5);
        tree.root.left.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(55);
        tree.root.right.left.left = new TreeNode(45);
        tree.root.right.right = new TreeNode(70);
        tree.root.right.right.left = new TreeNode(65);
        tree.root.right.right.right = new TreeNode(80);

        /* The complete tree is not BST as 45 is in right subtree of 50.
         The following subtree is the largest BST
             60
            /  \
          55    70
          /     /  \
        45     65   80
        */
        System.out.println("Size of largest BST is " + tree.largestBST(root));
    }
}
