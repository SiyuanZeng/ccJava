package LeetCode.Traversal.ConstructBinaryTreefromInorderAndPostorderTraversal_Array.ConstructBinaryTreeFromPreorderAndInorderTraversal;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/17/2016.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart = 0;
        int preEnd = preorder.length-1;
        int inStart = 0;
        int inEnd = inorder.length-1;

        return construct(preorder, preStart, preEnd, inorder, inStart, inEnd);
    }

    // These index are used to track position, they don't work on their own.
    public TreeNode construct(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if(preStart>preEnd||inStart>inEnd){
            return null;
        }

        int val = preorder[preStart];
        TreeNode p = new TreeNode(val);

        //find parent element index from inorder
        int k=0;
        for(int i=0; i<inorder.length; i++){
            if(val == inorder[i]){
                k=i;
                break;
            }
        }

        p.left = construct(preorder, preStart+1,             preStart+(k-inStart), inorder, inStart, k-1);
        p.right= construct(preorder, preStart+(k-inStart)+1, preEnd,               inorder, k+1 ,    inEnd);

        return p;
    }
}
