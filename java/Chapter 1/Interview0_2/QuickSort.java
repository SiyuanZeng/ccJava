package Interview0_2;

/**
 * Created by SiyuanZeng's on 5/3/2016.
 */
public class QuickSort {
    private int array[];
    private int length;

    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        System.out.println("Again:");
        while (i <= j) {
            System.out.println("{i: " +i + ", j: " +j + "}");
            for (int m = 0; m < array.length; m++) {
                if (m > 0) {
                    System.out.print(", ");
                }
                System.out.print(array[m]);
            }
            System.out.println();


            while (array[i] < pivot) {
                i++;
                System.out.println("i++ :" + i +", " +array[i] + " < " + pivot);
            }
            System.out.println("SwitchValue > i++ :" + i +", " +array[i] + " < " + pivot);
            while (array[j] > pivot) {
                j--;
                System.out.println("j-- :" + j +", " +array[j] + " > " + pivot);
            }
            System.out.println("SwitchValue > j-- :" + j +", " +array[j] + " > " + pivot);
            if (i <= j) {
                System.out.println("arry[i] :" +array[i]);
                System.out.println("arry[j] :" +array[j]);

                exchangeNumbers(i, j);
                i++;
                System.out.println("after exchange i++ :" + i );
                j--;
                System.out.println("after exchange j-- :" + j );

                for (int m = 0; m < array.length; m++) {
                    if (m > 0) {
                        System.out.print(", ");
                    }
                    System.out.print(array[m]);
                }
                System.out.println();
            }
        }
        // The above sort the high values and low values in order for sure.
        // The following will sort the low values again, but we can be fore that the low values will still < than the above pivot.
        if (lowerIndex < j) {
            System.out.println();
            System.out.println();
            System.out.println("***lowerIndex (" + lowerIndex + ") < j ("  + j+")"  );

            quickSort(lowerIndex, j);
        }

        // After finish sorting the low values, we will sort the high values, but question is how about the high values sections?
        // Answer: the high section is from [i, highIndex], the starting value of high Index is full range.
        if (i < higherIndex) {
            System.out.println();
            System.out.println();
            System.out.println("***i(" + i + ") < higherIndex ("  + higherIndex +")" );
            quickSort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}