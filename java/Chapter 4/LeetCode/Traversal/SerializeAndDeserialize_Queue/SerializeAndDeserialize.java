package LeetCode.Traversal.SerializeAndDeserialize_Queue;

import CtCILibrary.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by SiyuanZeng's on 5/13/2016.
 */
public class SerializeAndDeserialize {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        StringBuffer sb = new StringBuffer();

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr != null) {
                sb.append(curr.data + ",");
                queue.offer(curr.left);
                queue.offer(curr.right);
            } else {
                sb.append("#" + ",");
            }
        }

        // Remove the trailing #
        String result = sb.toString();
        int j = result.length() - 1;

        while (j > 0 && result.charAt(j) == ',' && result.charAt(j) == '#') {
            j -= 2;
        }

        result = result.substring(0, j);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        String[] nodes = data.split(",");

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode curr = queue.poll();
            if (nodes[i].equals("#")) {
                curr.left = null;
            } else {
                TreeNode leftNode = new TreeNode(Integer.parseInt(nodes[i]));
                curr.left = leftNode;
                queue.offer(leftNode);
            }

            i++;
            if (i >= nodes.length) {
                break;
            }

            // right node
            if (nodes[i].equals("#")) {
                curr.right = null;
            } else {
                TreeNode rightNode = new TreeNode(Integer.parseInt(nodes[i]));
                curr.right = rightNode;
                queue.offer(rightNode);
            }

            i++;
        }

        return root;
    }
}
