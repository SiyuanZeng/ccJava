package Question3_1;

public class StackData {
	public int start;
	public int pointer;
	public int size = 0;
	// capacity will also change when shifting, it will shrink
    public int capacity;

	public StackData(int _start, int _capacity) {
		start = _start;
		pointer = _start - 1;
		capacity = _capacity;
	}
	
	public boolean isWithinStack(int index, int total_size) {
		// LeetCode.Traversal.Note: if stack wraps, the head (right side) wraps around to the left.
        boolean isIndexInBound = start <= index && index < start + capacity;
        boolean isIndexInLeftSide = start + capacity > total_size &&
                index < (start + capacity) % total_size;
        if (isIndexInBound) {
			// non-wrapping, or "head" (right side) of wrapping case
			return true;
		} else if (isIndexInLeftSide) {
			// tail (left side) of wrapping case
			return true;
		}
		return false;
	}
}
