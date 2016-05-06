package Question2_2;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 6/16/2014.
 */
public class a_Recursive {

    public static int nthToLast(LinkedListNode head, int k){
        if (head == null){
            return 0;
        }
        // Go to the end
        int i = nthToLast(head.next, k) + 1;

        // Come back one by one
        if (i==k){
            System.out.println(head.data);
        }

        return i;
    }


}
