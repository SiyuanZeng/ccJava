import CtCILibrary.AssortedMethods;
import Question3_1_3Arrays.Flexible01.StackData;

public class Stack {
    public static int defaultSize = 4;
    public static int numberOfStacks = 3;
    public static int totalSize = numberOfStacks * defaultSize;
    public static StackData[] stackData = { new StackData(0, defaultSize),
            new StackData(defaultSize, defaultSize),
            new StackData(defaultSize * 2, defaultSize)
    };
    public static int[] buffer = new int[totalSize];


    public static void main(String [] args) throws Exception  {
        push(0, 10);
        push(1, 20);
        push(2, 30);

        push(1, 21);
        push(0, 11);
        push(0, 12);

        pop(0);

        push(2, 31);

        push(0, 13);
        push(1, 22);

        push(2, 31);
        push(2, 32);
        push(2, 33);
        push(2, 34);


        pop(1);
        System.out.println("Final Stack: " + AssortedMethods.arrayToString(buffer));
        push(2, 35);

        System.out.println("Final Stack: " + AssortedMethods.arrayToString(buffer));
    }
    public static boolean isEmpty(int stackNum) {
        return stackData[stackNum].size == 0;
    }

    // What to extract as a small method like nextElement
    public static int peek (int stackNum) throws Exception {
        StackData stack = stackData[stackNum];
        // how about the default pointer position?
        int index = stack.pointer;

        if ( index == -1) throw new Exception("Trying to peep an empty stack");

        return buffer[index];
    }

    static boolean isStackFull(int stackNum) {
        StackData stack = stackData[stackNum];
        int size = stack.size;
        return size >= stack.capacity;

    }

    static boolean isArrayFull() {
        int size = stackData[0].size + stackData[1].size +stackData[2].size;
        return size >= totalSize;
    }

    public static boolean push ( int stackNum, int value) {
        StackData stack = stackData[stackNum];

        if (isStackFull(stackNum)) {
            if (isArrayFull()) {
                return false;
            } else {
                expand(stackNum);
            }
        }

            stack.pointer = nextElement(stack.pointer);
            stack.size++;

            buffer[stack.pointer] = value;
            return true;
    }



    public static void expand(int stackNum) {
        shift((stackNum + 1)% numberOfStacks) ;//
        stackData[stackNum].capacity++;
    }


    public static void shift(int stackNum) {
        StackData stack = stackData[stackNum];
        while (isStackFull(stackNum)) {
            int nextStack = (stackNum + 1) % numberOfStacks;
            shift(nextStack );
            stack.capacity++;//
        }


        int endOfArray = (stack.start + stack.capacity -1 ) % totalSize;

        // This one is more concise.
        while ( stack.isWithinStack(endOfArray, stack.capacity)) {
            buffer[endOfArray] = buffer[(endOfArray -1 + totalSize) % totalSize];
            endOfArray = prevElementOfIndex(endOfArray);
        }

        //Refactor the complex and they are multiple use.
        stack.start = nextElement(stack.start); // move start start
        stack.capacity--;
        stack.pointer = nextElement(stack.pointer);
    }


    public static int pop(int stackNum) throws Exception{
        if ( stackNum < 0 || stackNum >2) {
            throw new Exception("stack number is out of bound");
        }

        StackData stack = stackData[stackNum];

        if ( stack.size <= 0) {
            throw new Exception("Trying to pop an empty stack");
        }


        int value = buffer[stack.pointer];
        buffer[stack.pointer] = 0;//
        stack.pointer = prevElementOfIndex(stack.pointer);
        stack.size--;

        return value;

    }

    public static int nextElement(int index) {
        if (index + 1 == totalSize) {
            return 0;
        } else {
            return index + 1;
        }
    }

    public static int prevElementOfIndex(int index) {
        // What is this stuff?
        if (index == 0) {
            return totalSize - 1;
        } else {
            return index - 1;
        }
    }


}
