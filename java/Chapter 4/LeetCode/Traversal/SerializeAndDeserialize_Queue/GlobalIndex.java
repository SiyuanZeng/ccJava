package LeetCode.Traversal.SerializeAndDeserialize_Queue;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/13/2016.
 */
public class GlobalIndex {
        public String serialdfs(TreeNode root) {
            if (root == null) {
                return "";
            }

            StringBuilder sb = new StringBuilder();

            serialdfsHelper(root, sb);

            return sb.toString();
        }

        private void serialdfsHelper(TreeNode root, StringBuilder sb) {
            if (root == null) {
                sb.append("#");
                return;
            }

            sb.append(root.data);

            serialdfsHelper(root.left, sb);
            serialdfsHelper(root.right, sb);
        }

        public int i = 0;
        public TreeNode deserialdfs(String s) {
            if (s == null || s.length() == 0) {
                return null;
            }

            return deserialdfsHelper(s);
        }

        private TreeNode deserialdfsHelper(String s) {
            if (i >= s.length() || s.charAt(i) == '#') {
                return null;
            }

            TreeNode root = new TreeNode(s.charAt(i) - '0'); // Convert the char to number
            i++;
            root.left = deserialdfsHelper(s);
            i++;
            root.right = deserialdfsHelper(s);

            return root;
        }

        public static void main(String[] args) {
            System.out.println(('A'- '1'));

            GlobalIndex sol = new GlobalIndex();

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);


            String result = sol.serialdfs(root);

            TreeNode root2 = sol.deserialdfs(result);

            String result2 = sol.serialdfs(root2);

            System.out.println(result2);
        }
    }
