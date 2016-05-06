package Question3_1._157;

/**
 * Created by SiyuanZeng's on 9/6/2014.
 */
public class StackArray {
    public static int size = 4;
    public static int numbOfStacks = 3;

    public static int[] buffer = new int[size * numbOfStacks];
    public static int[] pointers = { -1, -1, -1};

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

    public static boolean isEmpty(int index) {
        return pointers[index] == -1;
    }

    public static boolean isFull(int index) {
        return pointers[index] == size -1;
    }

    public static boolean isValidIndex(int index) throws Exception{
        if (index < 0 && index >= size)
            throw new Exception("Index out of bound");

        return true;
    }

    public static boolean hasRoom(int index) {
        return pointers[index] < size;
    }

    public static int absTopOfStack(int index) {
        return index * size + pointers[index];
    }


    public static void push(int index, int value) throws Exception{
        if (isValidIndex(index)) {
            if (hasRoom(index)) {
                pointers[index]++;
                buffer[pointers[index]] = value;
            } else {
                throw new Exception("The stack is full");
            }
        }
    }

    public static int pop(int index) throws Exception {
        int value = getLastValueInStack(index);
        buffer[pointers[index]] = 0;
        pointers[index]--;
        return value;
    }

    public static int peek(int index) throws Exception {
        return getLastValueInStack(index);
    }

    public static int getLastValueInStack(int index) throws Exception {
        int value = 0;
        if (isValidIndex(index)) if (!isEmpty(index)) {
            value = buffer[pointers[index]];
        }
            return value;
    }
}







