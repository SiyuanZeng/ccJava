package Interview0_2;

/**
 * Created by SiyuanZeng's on 5/3/2016.
 */
public class Fibonacci {

    public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= number; i++)
            System.out.println(i + ": " + fib(i));
    }


}
