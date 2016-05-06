package Question3_1_3Arrays.Flexible01;

/**
 * Created by SiyuanZeng's on 9/2/2014.
 */


public class StackData {
    public int start;
    public int capacity;
    public int size = 0;
    public int pointer = -1;


    public boolean isWithinStack(int index, int total_size) {
        boolean isWithinStack = index >= start && index < start + capacity;
        boolean isWithinCircularStack = start + capacity > total_size && index < (start + capacity) % total_size;

        if ( isWithinStack || isWithinCircularStack) return true;
        return false;
    }

    public StackData ( int start, int capacity) {
        this.capacity = capacity;
        this.start = start;
        // How to handle the start index?
        this.pointer = start -1;
    }

}
