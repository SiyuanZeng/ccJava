package Question2_0_String_Manipulation.Question2_19_NegativeAndPositiveNumbersSorting;

/**
 * Created by SiyuanZeng's on 4/26/2016.
 */
public class NegativePositiveNumbers {
    public static int[] sort(int[] numbers){
        int[] sorted = new int[numbers.length];

        int j = 0;
        for(int i=0; i< numbers.length; i++) {
            if (numbers[i] < 0) {
                sorted[j] = numbers[i];
                j++;
            }
        }

        for(int i=0; i< numbers.length; i++) {
            if (numbers[i] == 0) {
                sorted[j] = numbers[i];
                j++;
            }
        }

        for(int i=0; i< numbers.length; i++) {
            if (numbers[i] > 0) {
                sorted[j] = numbers[i];
                j++;
            }
        }

        return sorted;
    }

}
