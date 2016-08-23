package LeetCode.Traversal.VerifyPreorderSequenceInBinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by SiyuanZeng's on 5/15/2016.
 */
public class TwoStacks {
    public boolean verifyPreorder(int[] preorder) {
        if (preorder == null || preorder.length <= 1) {
            return true;
        }

        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> list = new ArrayList<>();

        for (int num : preorder) {
            if (!list.isEmpty() && num < list.get(list.size() - 1)) {
                return false;
            }

            while (!stack.isEmpty() && num > stack.peek()) {
                list.add(stack.pop());
            }

            stack.push(num);
        }

        return true;
    }
}
