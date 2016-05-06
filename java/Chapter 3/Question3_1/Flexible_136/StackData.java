package Question3_1.Flexible_136;

public class StackData {
    public int start ;
    public int capacity;
    public int pointer;
    public int size ;


    public StackData(int start, int capacity) {
        this.start = start;
        this.capacity = capacity;
        this.pointer = start;
    }

    public boolean  isWithinStack(int pointer, int totalSize) {
        boolean isWithinStack = pointer >= start && pointer <= start + capacity - 1; 	// How to make sure the last part is corrext?
        boolean isOnTheLeftSide = pointer <= (start + capacity -1) % totalSize && pointer >= start;

        if (isWithinStack || isOnTheLeftSide) {
            return true;
        }
        return false;
    }


}