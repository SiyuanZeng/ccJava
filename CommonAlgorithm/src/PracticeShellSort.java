public class PracticeShellSort {
    public static void main(String[] args) {
        int[] arr = {343,35,12,5,6,7,8,12,4,7,8,1};
        shellSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    private static void shellSort(int[] arr) {
        // TODO Auto-generated method stub
        int inner, outter, temp, interval;
        interval = 1;
        while (interval <= arr.length / 3) {
            interval = interval * 3+1; // Will make sure that the first one will always get called!!!
        }
        while (interval > 0) {
            for (outter = interval; outter < arr.length; outter++) {
                temp = arr[outter];
                inner = outter;
                while (inner > interval - 1 && arr[inner - interval] >= temp) {
                    arr[inner] = arr[inner - interval];//
                    inner -= interval;
                }
                   arr[inner] = temp; //The last one will have the smallest value.
            }
            interval = (interval - 1) / 3;
        }

    }



}
