package Question3_1_3Arrays._156;

/**
 * Created by SiyuanZeng's on 9/6/2014.
 */
public class StackArray {
    public static int stackSize = 4;
    public static int numbOfStack = 3;
    public static int[] buffer  = new int[stackSize * numbOfStack];
    public static int[] pointers = {-1, -1, -1};

    public static void main(String[] args) throws Exception {
        push(2, 4);
        System.out.println("Peek 2: " + peek(2));
        push(0, 3);
        push(0, 7);
        push(0, 5);
        System.out.println("Peek 0: " + peek(0));
        pop(0);
        System.out.println("Peek 0: " + peek(0));
        pop(0);
        System.out.println("Peek 0: " + peek(0));
    }
    public static void push(int index, int v) {	// Have to make sure all the parameters are valid
        boolean isValidIndex = index >=0 && index < numbOfStack;
        if (isValidIndex) {
            boolean isStackAvaialbe =  pointers[index] < stackSize;
            if (isStackAvaialbe) {
                pointers[index]++ ;
                buffer[absTopOfStack(index)] = v;
            }
        } else {
            System.out.println("The index is not valid");
        }
    }


    public static int pop(int index) throws Exception {

        boolean isValidIndex = index >=0 && index < numbOfStack;
        if (isValidIndex) {
            if (isEmpty(index)) {
                System.out.println("The stack is empty");
                throw new Exception("The stack is empty");
            } else {
                int value = buffer[absTopOfStack(index)];
                return value;
            }
        } else {
            System.out.println("The index is not valid");
            throw new Exception("The stack is empty");
        }
    }


    public static int peek(int index) throws Exception {
        boolean isValidIndex = index >=0 && index < numbOfStack;
        int value;
        if (isValidIndex) {
            if (isEmpty(index)) {
                System.out.println("The stack is empty");
                throw new Exception("The stack is empty");
            } else {
                value = buffer[absTopOfStack(index)];
                pointers[index]--;
            }
        } else {
            System.out.println("The index is not valid");
            throw new Exception("The stack is empty");
        }
        return value;

    }


    public static int absTopOfStack(int index) {
        return index * stackSize + pointers[index];
    }

    public static boolean isEmpty(int index) {
        return pointers[index] == -1;
    }

    public static boolean isFull(int index) {
        return pointers[index] == stackSize - 1;
    }
}



