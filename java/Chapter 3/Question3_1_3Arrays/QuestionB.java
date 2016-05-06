package Question3_1_3Arrays;

public class QuestionB {
	static int number_of_stacks = 3;
	static int default_size = 4;
	static int total_size = default_size * number_of_stacks;
    // This is the stack
	static StackData [] stackDataArr = {new StackData(0, default_size),
									 new StackData(default_size, default_size), 
									 new StackData(default_size * 2, default_size)};
	static int [] buffer = new int [total_size];


	
	public static int numberOfTotalElements() {
		return stackDataArr[0].size + stackDataArr[1].size + stackDataArr[2].size;
	}
	
	public static int nextElement(int index) {
		if (index + 1 == total_size) {
			return 0;
		} else {
			return index + 1;
		}
	}
	
	public static int prevElementOfIndex(int index) {
        // What is this stuff?
		if (index == 0) {
			return total_size - 1;
		} else {
			return index - 1;
		}
	}

    // How does it do the shift?
    // Why shift?
	// What is shift?
	public static void shift(int stackNum) {
		StackData stackData = stackDataArr[stackNum];
        // Why would this one be bigger than capacity?
		// Check whether this stackData is full. YES, shift the next stack and increase a space.
		if (stackData.size >= stackData.capacity) {// full stack then goes to next stack
            // wrap around
			int nextStack = (stackNum + 1) % number_of_stacks;
			shift(nextStack);
			// make some room, there have to be a stack to be able to shift, because the array is not full yet
			// How is the full array like?
			stackData.capacity++;
		}

        // What is the stackData? Is it a single stackData, or all 3?
        // Where is the number of stackData defined?
        // Will start and capacity change?
        // because the start may be any places, maybe at the end.
        // Why would the end be any places?
        int endOfArray = (stackData.start + stackData.capacity - 1) % total_size;


		// Shift all the elements one step further.
		for (
			// end of array
               // Why do we need end of the array?
                // Where does it check that the array is not full, it is in the front of the method.
				int i = endOfArray;
			// Why passing totalSize?
             // To check whether the end is at the left side of the array
             // To shift all the elements within the stack bound
			 stackData.isWithinStack(i, total_size);
			 i = prevElementOfIndex(i)) { // This can be anything.
			buffer[i] = buffer[prevElementOfIndex(i)];// Move 1 step
		}


		// Reset the first element to 0 and change the start, pointer, and capacity.
		// What is this one?
        // Why this one?
		buffer[stackData.start] = 0;
        // Why move this one?
        // Shrink the stack
		stackData.start = nextElement(stackData.start); // move start start
		stackData.pointer = nextElement(stackData.pointer); // move stackData pointer
		stackData.capacity--; // return capacity to original
	}
	
	/* Expand stack by shifting over other stackDataArr */
	public static void expand(int stackNum) {
		shift((stackNum + 1) % number_of_stacks);// Next stack wrapping around
		stackDataArr[stackNum].capacity++;
	}

	static void push(int stackNum, int value) throws Exception {
		StackData stack = stackDataArr[stackNum];
		/* Check that we have space */
		// How can size more than capacity? original capacity.
		if (stack.size >= stack.capacity) {
            // shift when there are still some room, this is hard if I only read in the nested methods
			if (numberOfTotalElements() >= total_size) { // Totally full
				throw new Exception("Out of space."); 
			} else { // just need to shift things around
                // expand what?
				expand(stackNum);
			}
		}
		/* Find the index of the top element in the array + 1, 
		 * and increment the stack pointer */	
		stack.size++;
		stack.pointer = nextElement(stack.pointer);		
		buffer[stack.pointer] = value;	
	}

	static int pop(int stackNum) throws Exception {
		StackData stack = stackDataArr[stackNum];
		if (stack.size == 0) {
			throw new Exception("Trying to pop an empty stack.");
		}
		int value = buffer[stack.pointer];
		buffer[stack.pointer] = 0;
		stack.pointer = prevElementOfIndex(stack.pointer);
		stack.size--;
		return value;
	}

	static int peek(int stackNum) {
		StackData stack = stackDataArr[stackNum];
		return buffer[stack.pointer];
	}

	static boolean isEmpty(int stackNum) {
		StackData stack = stackDataArr[stackNum];
		return stack.size == 0;
	}
}
