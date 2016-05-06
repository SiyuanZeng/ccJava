package Question3_1_3Arrays.Flexible_137;

public class StackData {
    public int pointer;
    public int start;
    public int capacity;
    public int size;


    public StackData (int start, int capacity ) {
        this.start = start;
        this.pointer = start;
        this.capacity = capacity;
        this.size = 0;
    }

    public boolean isWithinStack(int pointer, int totalSize) {
        boolean isWithinStack = pointer >= start && pointer <= start + capacity;
        boolean isOnLeftSideOfStack = pointer >= (start + capacity) % totalSize && pointer <= start;

        if (isWithinStack || isOnLeftSideOfStack) {
            return true;
        }
        return false;
    }
} 
