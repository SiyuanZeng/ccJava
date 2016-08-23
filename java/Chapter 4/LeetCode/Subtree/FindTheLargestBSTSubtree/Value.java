package LeetCode.Subtree.FindTheLargestBSTSubtree;// Java program to find largest BST subtree in given Binary Tree


public class Value {

    int maxSize = 0; // for size of largest BST
    boolean isBST = false;
    int min = Integer.MAX_VALUE;  // For minimum value in right subtree
    int max = Integer.MIN_VALUE;  // For maximum value in left subtree

}

// This code has been contributed by Mayank Jaiswal
