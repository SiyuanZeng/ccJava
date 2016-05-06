package Question2_0_String_Manipulation.Question2_20_Fibonacci;

/**
 * Created by SiyuanZeng's on 4/26/2016.
 */
public class Fibonacci {
    public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int febCount = 15;
        for (int i = 1; i <= febCount; i++)
            System.out.println(i + ": " + fib(i));
    }

}