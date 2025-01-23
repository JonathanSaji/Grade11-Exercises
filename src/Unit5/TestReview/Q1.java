package Unit5.TestReview;

import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {
        int[] integers = new int[50];
        int StartNum = 2;
        for (int j = 0; j <= integers.length-1; j++) {
            if(StartNum % 2 == 0){
                integers[j] = StartNum;

            }
            StartNum += 2;
        }
        System.out.println(Arrays.toString(integers));

        for(int i = 0; i <= integers.length -1; i++){
            integers[i] -= 1;
            }
        System.out.println(Arrays.toString(integers));

        for(int i=0; i< integers.length; i++){
            boolean isPrime = true;

            //check to see if the numbers are prime
            for (int j=2; j<integers[i]; j++){

                if(integers[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            //print the number
            if(isPrime)

                System.out.println(integers[i] + " are the prime numbers in the array ");
        }




        }
    }



//a. Declare an array of integers of size 50, and store the even numbers from 2 to 100
//b. Subtract one from each number in the array
//c. Find the last prime number in the array (recall, a prime number is only divisible by one and itself)
