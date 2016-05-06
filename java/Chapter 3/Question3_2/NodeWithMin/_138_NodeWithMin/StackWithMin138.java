package Question3_2.NodeWithMin._138_NodeWithMin;

import java.util.Stack;

public class StackWithMin138 extends Stack<NodeWithMin138> {

    public void push(int value) {
        int min = Math.min(value, min());
        super.push(new NodeWithMin138(value, min));
    }


    public int min() {
        if (isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return peek().min;
        }
    }
}