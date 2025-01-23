package Unit5.Arrays;

import java.util.Arrays;

public class Exercise53 {
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'A', 'B'};
        System.out.println(search(characters,'B'));

        int[] integers = {3,6,7,8,2,1};
        System.out.println(Arrays.toString(BubbleSort(integers)));
        int[] changedInt = BubbleSort(integers);
        System.out.println(binaryBackward(changedInt,6));

    }

    public static int search(char[] c, char element) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == element) {
                return i;
            }

        }
        return -1;
    }

    public static int[] BubbleSort(int[] c){
        int temp;
        for(int i = 0; i < c.length; i++){
            System.out.println(Arrays.toString(c));
            for(int j = 0; j < c.length - i -1 ;j++){
                if(c[j] > c[j+1]){
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        return c;
    }
    public static int binaryBackward(int[] c, int element){
        int min = 0;
        int max = c.length - 1;
        int mid;

        while(min < max){
            mid = (min + max) /2;
            if(c[mid] == element){
                return mid;
            }
            else if(c[mid] > element){
                min = mid +1;
            }
            else{
                max = mid -1;
            }
        }
            return -1;
    }

    public static int BinarySearch(int [] c , int element){
        int min = 0;
        int max = c.length - 1;
        int mid;

        while(min < max){
            mid = (min+max) / 2;
            if(c[mid] == element){
                return mid;
            }
            else if(c[mid] > element){
                max = mid -1;
            }
            else{
                min = mid +1;
            }
        }
        return -1;
    }
}
