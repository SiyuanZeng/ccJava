package LeetCode.NestedListWeightSum;

import java.util.List;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class NestedListWeightSum {

    private NestedListWeightSum() {

    }

    public static int findNestedListSum(List nestedList) {
        if (nestedList == null || nestedList.size() == 0) {
            System.out.println("Input cannot be empty or null");
            return 0;
        }
        return findNestedListSum(nestedList, 1);
    }

    private static int findNestedListSum(List inputList, int depth) {
        int sum = 0;
        for (Object anInputList : inputList) {
            if (anInputList instanceof List) {
                sum = sum + findNestedListSum((List) anInputList, depth + 1);
            } else {
                sum = sum + depth * (Integer) anInputList;
                System.out.println("integer => " + anInputList + " Depth => " + depth);
            }
        }
        return sum;
    }
}
