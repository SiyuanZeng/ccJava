package Question2_0_String_Manipulation.Question2_1_DuplicateWordsInString;

import CtCILibrary.LinkedListNode;

import java.util.Hashtable;

/**
 * Created by SiyuanZeng's on 6/11/2014.
 */
public class Practice {
    //

    public static void deleteDups(LinkedListNode node){
        Hashtable table = new Hashtable();
        // what is the previous here? new linkedList
        // Why is it null?
        LinkedListNode previous = null;
        while(node != null){
            // Already in table
            if (table.containsKey (node.data)){
                // This is the hard point. Why do we want to put it into the next?
                // previous.next = current node.
                // here what it does is to skip the current node.
                previous.next = node.next;
            // Not in the table
            }else{
                // what is this true? To delete,,  table.put (node.data, true);// what is this true? To delete,
                table.put (node.data, true);

                // save the current one and go to the next one, why do we need a previous one? Use this one to create a new linkedlist
                previous = node;
            }
            // go to next node.
            node = node.next;
        }
    }




    public static void deleteDups2(LinkedListNode node){
        Hashtable<LinkedListNode, Boolean> table = new Hashtable();
        LinkedListNode previous = null ;

        while (null != node) {
            if (!table.contains(node)) {
                table.put(node, true);
                previous = node;
            } else {
                previous.next = node.next;
            }
            node = node.next;
        }
    }

}



