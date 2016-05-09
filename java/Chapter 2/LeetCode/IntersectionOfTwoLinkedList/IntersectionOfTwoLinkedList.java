package LeetCode.IntersectionOfTwoLinkedList;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class IntersectionOfTwoLinkedList {
        public LinkedListNode getIntersectionNode(LinkedListNode headA, LinkedListNode headB) {
            int len1 = 0;
            int len2 = 0;
            LinkedListNode p1=headA, p2=headB;
            if (p1 == null || p2 == null) {
                return null;
            }



            // get the length
            while(p1 != null){
                len1++;
                p1 = p1.next;
            }
            while(p2 !=null){
                len2++;
                p2 = p2.next;
            }


            int diff = 0;
            p1=headA;
            p2=headB;




            // Make them meet after diff th steps
            if(len1 > len2){
                diff = len1-len2;// why this?
                // * What the hell! So long!!!
                int i=0;
                while(i<diff){
                    p1 = p1.next;
                    i++;
                }
            }else{
                diff = len2-len1;
                int i=0;
                while(i<diff){
                    p2 = p2.next;
                    i++;
                }
            }





            //???? Why would this be a necessity, the previous loop is to keep at the same pace instead of finding the same node.
            while(p1 != null && p2 != null){
                if(p1.data == p2.data){
                    return p1;
                }else{

                }
                p1 = p1.next;
                p2 = p2.next;
            }

            return null;
    }
}
