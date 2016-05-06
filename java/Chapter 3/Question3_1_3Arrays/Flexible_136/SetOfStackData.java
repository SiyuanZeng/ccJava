package Question3_1_3Arrays.Flexible_136;

import CtCILibrary.AssortedMethods;

public class SetOfStackData {
    public static int defaultSize = 4;
    public static int numbOfStacks = 3;
    public static StackData[] stackData = {new StackData(0, defaultSize),
            new StackData(defaultSize, defaultSize),
            new StackData(defaultSize * 2, defaultSize)};
    public static int totalSize = defaultSize * numbOfStacks;
    public static int[] buffer = new int[totalSize];

    public static void main(String [] args) throws Exception  {
        push(0, 10);
        push(1, 20);
        push(2, 30);

        push(1, 21);
        push(0, 11);
        push(0, 12);
        System.out.println("Final Stack: " + AssortedMethods.arrayToString(buffer));

        pop(0);
        System.out.println("Final Stack: " + AssortedMethods.arrayToString(buffer));

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

    public static boolean isStackFull(int index) {
        StackData stack = stackData[index];
        return stack.size >= stack.capacity;
    }

    public static boolean isArrayFull() {
        return (stackData[0].size + stackData[1].size + stackData[2].size)  == totalSize;
    }


    public static boolean isStackEmpty(int index) {
        StackData stack = stackData[index];
        return stack.size == 0;
    }

    public static boolean isArrayEmpty() {
        return (stackData[0].size + stackData[1].size + stackData[2].size)  == 0;
    }


    public static int preElement(int pointer) {
        if (pointer == 0) {
            return totalSize - 1;
        }

        return pointer -1;
    }

    public static int nextElement(int pointer) {
        if (pointer == totalSize -1) {
            return 0;
        }

        return pointer + 1;
    }

    public static boolean isIndexWinthinStackArray(int index) {
        if (index >=0 && index < numbOfStacks) {
            return true;
        }
        return false;
    }

    public static void push( int index, int value) throws Exception {
        StackData stack = stackData[index];

        if (isStackFull(index)) {
            if (!isArrayFull()) {
                expand(index);
            }
        }
        stack.size++;
        buffer[stack.pointer] = value;
        stack.pointer = nextElement(stack.pointer);

    }


    public static void expand(int index) {
        shift ((index + 1) % numbOfStacks);
        stackData[index].capacity++;
    }

    public static void shift(int index) {
        if (isStackFull(index)) {
            shift((index + 1) % numbOfStacks);
            stackData[index].capacity++;
        }

        int endOfStack = (stackData[index].start + stackData[index].capacity - 1) % totalSize;

        while (stackData[index].isWithinStack(preElement(endOfStack), totalSize)) {
            buffer[endOfStack] = buffer[preElement(endOfStack)] ;
            endOfStack = preElement(endOfStack);
        }
        buffer[endOfStack] = 0;
        stackData[index].start = nextElement(stackData[index].start);
        stackData[index].capacity--;
        stackData[index].pointer++;
    }


    public static int pop(int index) throws Exception {
        if (!isIndexWinthinStackArray(index)) {
            throw new Exception("Stack index" + index + " is outOfBound");
        }

        if (isStackEmpty(index)) {
            throw new Exception("Stack " + index + " is empty");
        }
        int value = -1;
        if (stackData[index].isWithinStack(preElement(stackData[index].pointer), totalSize)) {
            value = buffer[preElement(stackData[index].pointer)];
            buffer[preElement(stackData[index].pointer)]= 0;
            stackData[index].pointer = preElement(stackData[index].pointer);
            stackData[index].size--;
        }
        return value;
    }

    public static int peek(int index) throws Exception {
        if (isValidIndex(index))
            return buffer[stackData[index].pointer];
        return -1;
    }


    public static boolean isValidIndex(int index) throws Exception {
        if (!isIndexWinthinStackArray(index)) {
            throw new Exception("Stack index" + index + " is outOfBound");
        }

        if (isStackEmpty(index)) {
            throw new Exception("Stack " + index + " is empty");
        }
        return true;
    }
}
