package LeetCode.Traversal.BinaryTreeZigzagLevelOrderTraversal_ArrayList;

import CtCILibrary.TreeNode;

import java.util.ArrayList;

/**
 * Created by SiyuanZeng's on 5/17/2016.
 */
public class ZigZag {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root==null) return res;
        boolean order = true;
        ArrayList<TreeNode> toVisit = new ArrayList<TreeNode>();
        toVisit.add(root);
        while(!toVisit.isEmpty()){
            ArrayList<TreeNode> next = new ArrayList<TreeNode>();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(TreeNode node:toVisit){
                temp.add(node.data);
            }
            res.add(temp);

            // List can't use while loop.
            for(int i=toVisit.size()-1;i>=0;i--){//This part is similiar to right view, add the lower level
                TreeNode node = toVisit.get(i);
                if(order){
                    if(node.right!=null) next.add(node.right);
                    if(node.left!=null) next.add(node.left);
                }else{
                    if(node.left!=null) next.add(node.left);
                    if(node.right!=null) next.add(node.right);
                }
            }
            order = order?false:true;
            toVisit = new ArrayList<TreeNode>(next);
        }
        return res;
    }
}
