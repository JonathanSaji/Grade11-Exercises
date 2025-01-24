package Unit5.Arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] n = {3,1,2,4,3,6};
        System.out.println(Arrays.toString(InsertionSortIntegers(n)));

        String[] a = {"cat","apple","Dog","Ball"};
        System.out.println(Arrays.toString(InsertionSortStrings(a)));
    }

    public static int[] InsertionSortIntegers(int[]a){
        int temp;
        for(int i = 1; i < a.length; i++){
            for(int j = i-1;j >=0;j--){
                if(a[j+1] < a[j]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
                else{
                    j=0;
                }
            }
        }
        return a;
    }

    public static String[] InsertionSortStrings(String[]a){
        String temp;
        for(int i = 1; i < a.length; i++){
            for(int j = i-1; j>=0; j--){
                if(a[j+1].compareToIgnoreCase(a[j]) < 0){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
                else{
                    j=0;
                }
            }
        }
        return a;
    }
}
