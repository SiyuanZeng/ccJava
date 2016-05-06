package Question3_2.IndependentStack._139_Indie_01;

import java.util.Stack;

/**
 * Created by SiyuanZeng's on 9/2/2014.
 */
public class IndieStack extends Stack<Integer> {

    public Stack<Integer> stack = new Stack<Integer>();

    public void push(int value) {
        if (value <= min()) {
            stack.push(value);
        }
        super.push(value);
    }

    public Integer pop() {
        int value = super.pop();
        if (value == min()) stack.pop();
        return value;
    }


    public int min() {
        if (stack.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return stack.pop().intValue();
    }

}