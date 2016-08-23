package LeetCode.Traversal.VerifyPreorderSequenceInBinarySearchTree;

/**
 * Created by SiyuanZeng's on 5/15/2016.
 */
public class CodeJava {

    //todo convert Tree to array

    public boolean verifyPreorder(int[] preorder) {
        if (preorder == null || preorder.length <= 1) {
            return true;
        }

        return verifyPreorderHelper(preorder, 0, preorder.length - 1);
    }

    private boolean verifyPreorderHelper(int[] preorder, int lo, int hi) {
        if (lo >= hi) {
            return true;
        }

        int root = preorder[lo];
        int i = lo + 1;
        while (i <= hi && preorder[i] < root) {
            i++;
        }

        int j = i;
        while (j <= hi && preorder[j] > root) {
            j++;
        }

        if (j <= hi) {
            return false;
        }

        return verifyPreorderHelper(preorder, lo + 1, i - 1) &&
                verifyPreorderHelper(preorder, i, hi);
    }
}
