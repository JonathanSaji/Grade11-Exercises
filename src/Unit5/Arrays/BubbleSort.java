package Unit5.Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] n = {3,1,2,4,3,6};
        System.out.println(Arrays.toString(BubbleSort(n)));

        String[] a = {"cat","apple","Dog","Ball"};
        System.out.println(Arrays.toString(BubbleSortStrings(a)));

    }

    public static int[] BubbleSort(int[]a){
        int temp;
        for(int i = 0; i<a.length -1; i++){
            for(int j = 0; j<a.length -i -1; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static String[] BubbleSortStrings(String[] a){
        String temp;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j<a.length -i -1 ; j++){
                if(a[j].compareToIgnoreCase(a[j+1]) > 0){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}
