package LeetCode.Traversal.BinaryTreeLevelOrderTraversal_ArrayAndLinkedList.BinaryTreeRightSideView;

import CtCILibrary.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by SiyuanZeng's on 5/17/2016.
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(root == null) return result;

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(queue.size() > 0){//2
            int size = queue.size();

            for(int i=0; i<size; i++){// Get the first one
                TreeNode top = queue.remove();

                if(i==0){
                    result.add(top.data);
                }
                if(top.right != null){ // Right right, Then another round of right node
                    queue.add(top.right);
                }
                if(top.left != null){
                    queue.add(top.left);
                }
            }
        }

        return result;
    }
}
