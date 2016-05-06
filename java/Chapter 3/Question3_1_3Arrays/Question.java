package Question3_1_3Arrays;

public class Question {
    static int stackSize = 10;
    static int[] buffer = new int[stackSize * 3];

    // 3 stack pointers to keep track of the index of the top element
    static int[] stackPointer = {-1, -1, -1};



    static void push(int stackNum, int value) throws Exception {
        /* Check that we have space for the next element */
        if (++stackPointer[stackNum] >= stackSize) {
            throw new Exception("Out of space.");
        }
		/* Increment stack pointer and then update top value*/
        buffer[(stackNum * stackSize + stackPointer[stackNum])] = value;
    }

    static int pop(int stackNum) throws Exception {
        if (stackPointer[stackNum] == -1) {
            throw new Exception("Trying to pop an empty stack.");
        }
        int value = buffer[(stackNum * stackSize + stackPointer[stackNum])]; // Get top
        buffer[(stackNum * stackSize + stackPointer[stackNum]--)] = 0; // Clear index
        return value;
    }

    static int peek(int stackNum) {
        return buffer[(stackNum * stackSize + stackPointer[stackNum])];
    }

    static boolean isEmpty(int stackNum) {
        return stackPointer[stackNum] == -1;
    }

}
