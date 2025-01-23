package Unit5.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] i = {3,1,5,6,7,2};
        System.out.println(LinearS(i,5));
        //prints 2
    }
    public static int LinearS(int[] a, int element){
        for(int i = 0; i <= a.length -1; i++) {
            if (a[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
