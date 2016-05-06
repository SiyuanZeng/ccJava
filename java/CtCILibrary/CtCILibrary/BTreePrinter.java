package CtCILibrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTreePrinter {

    public static <T extends Comparable<?>> void printNode(TreeNode root) {
        int maxLevel = BTreePrinter.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <T extends Comparable<?>> void printNodeInternal(List<TreeNode> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;// What is floor?
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0))); // Doesn't do anything.


        /*
        * 8, 4, 2, 1, so that it can match and work well, think about it.
        * At first 1, then add one slash, it is two.
        * Then 2, then 2 slashes, then it is 4.
        * Then 4, add 4 slashes, then it is 8.
        * Among them I need a placeholder for the character.
        *
        * MaxLevel 4, level 1, floor 3, endline 4 {(3-1)^2}, first spaces7(2^3-1), betweenSpaces 15 (2^4-1)
        * MaxLevel 4, level 2, floor 2, endline 2 {(2-1)^2}, first spaces3(2^2-1), betweenSpaces 7  (2^3-1)
        * MaxLevel 4, level 3, floor 1, endline 1 {(1-1)^2}, first spaces1(2^1-1), betweenSpaces 3  (2^2-1)
        * MaxLevel 4, level 4, floor 0, endline 1 {(0-1)^2}, first spaces0(2^0-1), betweenSpaces 1  (2^1-1)
        *
        * firstSpaces - i
        * endgeLines * 2 + i + 1
        * between space i*2 - 1
        * end space - endgeLines*2 - i
        *
        *
        *
        *
        *
        *
        * */


        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BTreePrinter.printWhitespaces(firstSpaces);

        List<TreeNode> newNodes = new ArrayList<TreeNode>();
        for (TreeNode node : nodes) {// how many nodes in current level
            if (node != null) {
                System.out.print(node.data);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            BTreePrinter.printWhitespaces(betweenSpaces);//between node space, left and right nodes
        }
        System.out.println("");//When does this happen?

        for (int i = 1; i <= endgeLines; i++) {//how many lines to print.
            for (int j = 0; j < nodes.size(); j++) {
                //BTreePrinter.printWhitespaces(endgeLines*2 - i);
                //int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
                BTreePrinter.printWhitespaces(firstSpaces - i);//starting place, what does i mean? Why minus 1?
                // firstSpaces - i +(endgeLines * 2 + i + 1) = firstSpaces +(endgeLines * 2  + 1)
                // endline 4 {(floor-1)^2}, first spaces7(2^floor-1)
                if (nodes.get(j) == null) {//?previous nodes
                    BTreePrinter.printWhitespaces(endgeLines * 2 + i + 1); // Why plus i and 1?
                    //BTreePrinter.printWhitespaces(endgeLines + endgeLines - i); End space
                    // 2 placeholder
                    // inbetween: i*2 - 1
                    // after: endgeLines*2 - i
                    continue;// I miss this one.
                }

                if (nodes.get(j).left != null)
                    System.out.print("/");
                else
                    BTreePrinter.printWhitespaces(1);

                // between, i*2 -1  for each iteration
                BTreePrinter.printWhitespaces(i*2 - 1);//between left and right nodes1:3:5:7


                if (nodes.get(j).right != null)
                    System.out.print("\\");
                else
                    BTreePrinter.printWhitespaces(1);//placeholder

                //BTreePrinter.printWhitespaces(firstSpaces - i);//starting place
                // This is the same as the starting space
                BTreePrinter.printWhitespaces(endgeLines*2 - i);//Nothing.end spaces.//how to determine? What does endgeLines mean?
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print("_");
    }

    private static <T extends Comparable<?>> int maxLevel(TreeNode node) {
        if (node == null)
            return 0;

        return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}
