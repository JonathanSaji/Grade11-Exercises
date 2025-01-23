package Unit1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int side1 = 0,side2 = 0,side3 = 0;
        boolean askAgain;
        do {
            try {
                System.out.println("Enter Each Side Length with a space Then Click Enter");
                 side1 = console.nextInt();
                 side2 = console.nextInt();
                 side3 = console.nextInt();
                if(side1 + side2 + side3 != 180){
                    System.out.println("Sides Don't Add Up To 180");
                    askAgain = true;
                }
                else{
                    askAgain = false;
                }
            }catch(InputMismatchException e){
                System.err.println("Invalid Input");
                console.nextLine();
                askAgain = true;
            }
        }while(askAgain);

        if(side1 == 60 && side2 == 60 && side3 == 60){
            System.out.println("This Triangle is a Equilateral");
        }
        else if(side1 != side2 && side3 != side2 && side3 != side1){
            System.out.println("This Triangle is a Scalene");
        }
        else if(side1 == side2 && side3 != side2 || side3 == side2 && side1 != side2 || side3 == side1 && side2 != side1){
            System.out.println("The Triangle is Isosceles");
        }


    }
}


//Write a program that accepts the 3 side lengths of a triangle, and determines if it is equilateral, scalene or isosceles. If any of the inputs are not integers, you can say "exiting the program".
//Sample input: hi 30 60
//Sample output: A value entered is not an integer. Exiting program.

