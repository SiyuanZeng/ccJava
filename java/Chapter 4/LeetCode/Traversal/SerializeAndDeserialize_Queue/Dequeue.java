package LeetCode.Traversal.SerializeAndDeserialize_Queue;

import CtCILibrary.TreeNode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by SiyuanZeng's on 5/13/2016.
 */
public class Dequeue {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return "";
            }

            StringBuffer sb = new StringBuffer();
            serializeHelper(root, sb);

            return sb.toString();
        }

        private void serializeHelper(TreeNode root, StringBuffer sb) {
            if (root == null) {
                sb.append("#");
                sb.append(",");
                return;
            }

            sb.append(root.data + ",");
            serializeHelper(root.left, sb);
            serializeHelper(root.right, sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null || data.length() == 0) {
                return null;
            }

            String[] strs = data.split(",");
            Deque<String> deque = new LinkedList<>(Arrays.asList(strs));

            return deserializeHelper(deque);
        }

        private TreeNode deserializeHelper(Deque<String> deque) {
            if (deque.isEmpty()) {
                return null;
            }

            String node = deque.removeFirst();
            if (node.equals("#")) {
                return null;
            }

            TreeNode root = new TreeNode(Integer.parseInt(node));
            root.left = deserializeHelper(deque);
            root.right = deserializeHelper(deque);

            return root;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
