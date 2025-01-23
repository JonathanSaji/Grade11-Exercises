package ExamReview;

import Unit1.TestPrep.Scan;

import java.util.Scanner;

public class PrintBiggestNumber {
    public static void main(String[] args) {
        BiggestNumber();
    }
    public static void BiggestNumber(){
        Scanner console = new Scanner(System.in);
        int temp = -999999999;
        for(int i = 1; i <= 10; i++){
            System.out.print("Enter Number: ");
            int choice = console.nextInt();
            if(choice > temp){
                temp = choice;
            }
        }
        System.out.println("The Biggest number is: " + temp);
    }
}
