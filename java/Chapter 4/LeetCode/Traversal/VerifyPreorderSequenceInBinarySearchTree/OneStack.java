package LeetCode.Traversal.VerifyPreorderSequenceInBinarySearchTree;

import java.util.Stack;

/**
 * Created by SiyuanZeng's on 5/15/2016.
 */
public class OneStack {
    public boolean verifyPreorder(int[] preorder) {
        if (preorder == null || preorder.length <= 1) {
            return true;
        }

        Stack<Integer> stack = new Stack<Integer>();
        int max = Integer.MIN_VALUE;

        for (int num : preorder) {
            if (num < max) {
                return false;
            }

            while (!stack.isEmpty() && num > stack.peek()) {
                max = stack.pop();
            }

            stack.push(num);
        }

        return true;
    }
}
