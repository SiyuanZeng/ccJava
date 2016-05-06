package Interview0_1;

/**
 * Created by SiyuanZeng's on 4/28/2016.
 */
public class Fibonaci {

    private static int printFi(int number) {
        if (number <=1) {
            return 1;
        }

        int result = printFi(number-1) + printFi(number-2);

        return result;
    }


    public static void main(String[] args) {

        int number = 5;

        for (int i =0 ; i< number; i++) {
            System.out.println(printFi(number));
        }


    }

}
