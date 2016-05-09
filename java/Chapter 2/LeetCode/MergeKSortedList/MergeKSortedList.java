package LeetCode.MergeKSortedList;

import CtCILibrary.LinkedListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {
    public static LinkedListNode mergeKLists(ArrayList<LinkedListNode> lists) {
        if (lists.size() == 0)
            return null;

        //PriorityQueue is a sorted queue
        PriorityQueue<LinkedListNode> q = new PriorityQueue<LinkedListNode>(lists.size(),
                new Comparator<LinkedListNode>() {
                    @Override
                    public int compare(LinkedListNode a, LinkedListNode b) {
                        if (a.data > b.data)
                            return 1;
                        else if(a.data == b.data)
                            return 0;
                        else
                            return -1;
                    }
                });

        //add first LinkedListNode of each list to the queue
        for (LinkedListNode list : lists) {
            if (list != null)
                q.add(list);
        }

        LinkedListNode fakeHead = new LinkedListNode(0, null, null );
        LinkedListNode p = fakeHead; // serve as a pointer/cursor

        while (q.size() > 0) {
            LinkedListNode temp = q.poll();
            //poll() retrieves and removes the fakeHead of the queue - q.
            p.next = temp;

            //keep adding next element of each list, list inside the list
            if (temp.next != null)
                q.add(temp.next);

            p = p.next;
        }

        return fakeHead.next;
    }
}