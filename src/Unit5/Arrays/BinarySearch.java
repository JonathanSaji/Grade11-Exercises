package Unit5.Arrays;


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2, 3};
        System.out.println(Arrays.toString(BubbleSort(array)));
        int[] sorted_array = BubbleSort(array);
        System.out.println(BinaryS(sorted_array, 5));
    }

    public static int[] BubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static int BinaryS(int[] a, int element){

    int min = 0;
    int max = a.length;
    int mid;
    while(min < max){
        mid = (min +max)/2;
        if(a[mid] == element){
            return mid;
        }
        else if(a[mid] > element){
           max = mid -1;
        }
        else{
            min = mid +1;
        }
    }
        return -1;
    }
}
