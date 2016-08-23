package LeetCode.Traversal.BinaryTreeLevelOrderTraversal_ArrayAndLinkedList;

import CtCILibrary.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by SiyuanZeng's on 5/17/2016.
 */
public class BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> nodeValues = new ArrayList<Integer>();
        if(root == null)
            return results;

        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> nextLayer = new LinkedList<TreeNode>();
        current.add(root);

        while(!current.isEmpty()){
            TreeNode node = current.remove();
            // What is the relationship between all the ifs?
            nodeValues.add(node.data);// It makes more sense, because it is more important to me.
            if(node.left != null)
                nextLayer.add(node.left);
            if(node.right != null)
                nextLayer.add(node.right);
            // after all the values has been added to the nodeValues
            if(current.isEmpty()){
                current = nextLayer;
                nextLayer = new LinkedList<TreeNode>();//Reset to null
                results.add(nodeValues);
                nodeValues = new ArrayList();
            }
        }
        return results;
    }
}
