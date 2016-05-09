package LeetCode.RemoveLinkedListElement;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class RemoveLinkedListElements {
    public LinkedListNode removeElements(LinkedListNode head, int val) {
        LinkedListNode fakeHead = new LinkedListNode(0, null, null);
        fakeHead.next = head;
        LinkedListNode p = fakeHead;

        while(p.next != null){
            if(p.next.data == val){
                LinkedListNode next = p.next;
                p.next = next.next;
            }else{
                p = p.next;
            }
        }

        return fakeHead.next;
    }
}
