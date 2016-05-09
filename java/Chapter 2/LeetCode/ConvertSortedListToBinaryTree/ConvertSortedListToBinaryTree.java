package LeetCode.ConvertSortedListToBinaryTree;

import CtCILibrary.LinkedListNode;
import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class ConvertSortedListToBinaryTree {

        static LinkedListNode h;

        public TreeNode sortedListToBST(LinkedListNode head) {
            if (head == null)
                return null;

            h = head;
            int len = getLength(head);
            return sortedListToBST(0, len - 1);
        }

        // get list length
        public int getLength(LinkedListNode head) {
            int len = 0;
            LinkedListNode p = head;

            while (p != null) {
                len++;
                p = p.next;
            }
            return len;
        }

        // build tree bottom-up
        public TreeNode sortedListToBST(int start, int end) {
            if (start > end)
                return null;

            // mid
            int mid = (start + end) / 2;

            TreeNode left = sortedListToBST(start, mid - 1);
            TreeNode root = new TreeNode(h.data);
            h = h.next;
            TreeNode right = sortedListToBST(mid + 1, end);

            root.left = left;
            root.right = right;

            return root;
    }
}
