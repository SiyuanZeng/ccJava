package Question3_1_3Arrays.Flexible_137;


import CtCILibrary.AssortedMethods;

public class SetOfStacks {
    public static int defaultSize = 4;
    public static int numbOfStacks = 3;
    public static StackData[] stacks = {new StackData(0, defaultSize),
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
        StackData stack = stacks[index];
        return stack.size == stack.capacity;
    }

    public static boolean isArrayFull() {
        int size = stacks[0].size + stacks[1].size + stacks[2].size;
        return size == totalSize;
    }

    public static boolean isStackEmpty(int index) {
        StackData stack = stacks[index];
        return stack.size == 0;
    }

    public static int prevElement(int pointer) {
        if (pointer == 0) {
            return totalSize - 1;
        }
        return pointer - 1;
    }

    public static int nextElement(int pointer) {
        if (pointer == totalSize -1) {
            return 0;
        }
        return pointer + 1;
    }

    public static boolean isValidIndex(int index) {
        boolean isValidIndex = index >=  0 && index < numbOfStacks;
        if (isValidIndex) {
            return true;
        }
        return false;
    }




    public static void push(int index, int value) throws Exception {
        if (!isValidIndex(index)) {
            throw new Exception("Index is not valid");
        } else {
            StackData stack = stacks[index];
            if (isArrayFull()) {
                throw new Exception("Array is full");
            } else {
                if (isStackFull(index)) {
                    expand (index);
                }
                buffer[stack.pointer] = value;
                stack.pointer = nextElement(stack.pointer);
                stack.size++;
            }
        }

    }

    public static void expand(int index) {
        shift((index + 1) % numbOfStacks) ;
        stacks[index].capacity++;
    }

    public static void shift(int index) {
        if (isStackFull(index)) {
            shift((index + 1) % numbOfStacks);
            stacks[index].capacity++;
        }
        StackData stack = stacks[index];
        int endOfStack = (stack.start + stack.capacity - 1) % totalSize;

        while (stack.isWithinStack(prevElement(endOfStack), totalSize)) {
            buffer[endOfStack] = buffer[prevElement(endOfStack)];
            endOfStack = prevElement(endOfStack);
        }
        buffer[endOfStack]  = 0 ;
        stack.pointer  = nextElement(stack.pointer);
        stack.start =  nextElement(stack.start);
        stack.capacity--;
    }

    public static int pop(int index) throws Exception {
        if (isValidIndex(index)) {
            StackData stack = stacks[index];
            if (!isStackEmpty(index)) {
                int value = buffer[prevElement(stack.pointer)];
                buffer[prevElement(stack.pointer)] = 0;
                stack.pointer = prevElement(stack.pointer);
                stack.size--;
                return value;
            } else {
                throw new Exception("Stack is empty");
            }
            } else{
                throw new Exception("Index is not valid");
            }
        }

    public static int peek(int index) throws Exception {
        if (isValidIndex(index)) {
            StackData stack = stacks[index];
            if (!isStackEmpty(index)) {
                return buffer[prevElement(stack.pointer)];
            } else {
                throw new Exception("Stack is empty");
            }
        } else {
            throw new Exception("Index is not valid");
        }
    }



    }
