package LeetCode.Value.ClosestBinarySearchTreeValue2;

import CtCILibrary.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by SiyuanZeng's on 5/14/2016.
 */
public class BruteForce {

        private PriorityQueue minPQ;
        private int count = 0;
        public List closestKValues(TreeNode root, double target, int k) {
            minPQ = new PriorityQueue<Integer>();
            List result = new ArrayList();

            inorderTraverse(root, target, k);

            Iterator<String> itr = minPQ.iterator();
            while(itr.hasNext()){
                result.add(itr.next());
            }

            return result;
        }

        private void inorderTraverse(TreeNode root, double target, int k) {
            if (root == null) {
                return;
            }

            inorderTraverse(root.left, target, k);

            if (count < k) {
                minPQ.offer(root.data);
            } else {
                if (Math.abs((double) root.data - target) > Math.abs((double) minPQ.peek() - target)) {
                    minPQ.poll();
                    minPQ.offer(root.data);
                }
            }
            count++;

            inorderTraverse(root.right, target, k);
        }
}
