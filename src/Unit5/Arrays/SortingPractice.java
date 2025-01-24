package Unit5.Arrays;

import java.util.Arrays;

public class SortingPractice {
    public static void main(String[] args) {
        int[] n = {3,1,2,6,4,3};
        System.out.println(LinearSearch(n,6));
        System.out.println(Arrays.toString(SelectionSort(n)));
        System.out.println(LinearSearch(n,6));
        System.out.println(BinarySearch(n,6));
        int[] a = {3,1,2,4,3,6};
        System.out.println(Arrays.toString(BubbleSort(a)));
        int[] s = {3,1,2,4,3,6};
        System.out.println(Arrays.toString(InsertionSort(s)));

    }

    public static int[] BubbleSort(int[] a){
        int temp;
        for(int i = 0; i < a.length -1; i++){
            for(int j = 0; j <a.length -1 -i; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] SelectionSort(int[]a){
        int temp;
        int smallInd;
        for(int i =0; i<a.length; i++){
            smallInd = i;
            for(int j = i+1; j< a.length; j++){
                if(a[j] < a[smallInd]){
                    smallInd = j;
                }
            }
            temp = a[i];
            a[i] = a[smallInd];
            a[smallInd] = temp;
        }
        return a;
    }

    public static int[] InsertionSort(int[] a){
        int temp;
        for(int i =1; i <a.length; i++){
            for(int j = i-1; j>=0; j--){
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
    public static int BinarySearch(int[] a,int element){
        int max = a.length;
        int min = 0;
        int mid;
        while(min < max){
            mid = (max+min)/2;
            if(a[mid] == element){
                return mid;
            }
            else if(a[mid] < element){
                min= mid+1;
            }
            else{
                max = mid-1;
            }
        }
        return -1;
    }

    public static int LinearSearch(int[] a,int element){
        for(int i = 0; i <=a.length -1;i++){
            if(a[i] == element){
                return i;
            }
        }
        return -1;
    }
}
