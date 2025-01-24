package Unit5.Arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] n = {3,1,2,4,3,6};
        System.out.println(Arrays.toString(SelectionSortInteger(n)));

        String[] a = {"cat","apple","Dog","Ball"};
        System.out.println(Arrays.toString(SelectionSortStrings(a)));
    }

    public static int[] SelectionSortInteger(int[]a){
        int smallInd;
        int temp;
        for(int i = 0; i< a.length -1; i++){
            smallInd = a[i];
            for(int j = i+1; j< a.length; j++){
                if(a[j]< a[smallInd]) {
                    smallInd = j;
                }
            }
            temp = a[i];
            a[i] = a[smallInd];
            a[smallInd] = temp;
        }
        return a;
    }

    public static String[] SelectionSortStrings(String[]a){
        String temp;
        int smallInd;
        for(int i = 0; i < a.length -1; i++){
            smallInd = i;
            for(int j = i +1; j <a.length;j++){
                if(a[j].compareToIgnoreCase(a[smallInd]) < 0){
                    smallInd = j;
                }
            }
            temp = a[i];
            a[i] = a[smallInd];
            a[smallInd] = temp;
        }
        return a;
    }
    public static int[] InsertionSort(int[]a){
        int temp;
        for(int i =1; i < a.length; i++){
            for(int j = i-1; j>=0;j--){
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
}
