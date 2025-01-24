import java.sql.SQLOutput;
import java.util.Arrays;

public class ExamPractice {
    public static void main(String[] args) {
        int[] n = {3,2,4,6,1,2};
        System.out.println(Arrays.toString(BubbleSort(n)));

        int[] a = {3,2,4,6,1,2};
        System.out.println(Arrays.toString(SelectionSort(a)));

        int[] s = {3,2,4,6,1,2};
        System.out.println(Arrays.toString(InsertionSort(s)));

        int[] x = {3,2,4,6,1,2};
        System.out.println(Arrays.toString(BubbleSortDescending(x)));

        System.out.println(isPrimeNumber(7));
        System.out.println(FindFactorial(7));
        int[] array = new int[24];
        for(int i = 0,value = 1; i < array.length; i++,value +=2){
           if(isPrimeNumber(value)) {
               array[i] = value;
           }
           else{
               i--;
           }
        }
        System.out.println(Arrays.toString(array));

        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        String Countries[] = { "India","Afgan","USA","CANADA","AUSITALIA"};
        System.out.println(Arrays.toString(Countries));
        System.out.println(Arrays.toString(BubbleSortStrings(Countries)));

        char[] Alphabets = new char[26];
        for(int i = 0,value = 0; i <=a.length-1;i++,value++){
            Alphabets[i] = 'a';
            Alphabets[i] += value;
        }
        System.out.println(Arrays.toString(Alphabets));
        int [ ] temperature = { 80, 75, 55, 21, 3, 98, 67};
        for(int i =1; i <= temperature.length -1; i+=2){
            System.out.println(temperature[i]);
        }
        int num = 0;
        for(int i = 1; i<10; i++)
        {

            for(int k=i; k<5; k++)
            {
                num++;
                System.out.println("See that!");

            }
            System.out.println(num);
        }
    }
    public static int[] BubbleSort(int[]a){
        int temp;
        for(int i = 0; i < a.length-1;i++){
            for(int j = 0; j<a.length -1 -i;j++){
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
        int SmallInd;
        for(int i = 0; i<a.length;i++){
            SmallInd = i;
            for(int j = i+1; j<a.length;j++){
                if(a[j] < a[SmallInd]){
                    SmallInd = j;
                }
            }
            temp = a[i];
            a[i] = a[SmallInd];
            a[SmallInd] = temp;
        }
        return a;
    }
    public static int[] InsertionSort(int[]a){
        int temp;
        for(int i =1; i<a.length;i++){
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
    public static boolean isPrimeNumber(int n){
        if(n <=1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
    return true;

    }
    public static int FindFactorial(int num){
        if(num == 0){
            return 1;
        }

        return num * (FindFactorial(num -1));
    }

    public static int[] BubbleSortDescending(int[]a){
        int temp;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j< a.length -i -1; j++){
                if(a[j] < a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static String[] BubbleSortStrings(String[]a){
        String temp;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - i -1;j++){
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
