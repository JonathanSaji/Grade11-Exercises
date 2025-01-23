package Unit2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class U2Exercise1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean keepAsking;
        double GasCost = 0,LNum = 0;
        do{
            try {
                System.out.println("Enter the cost of gas, SPACE, then enter number of litres");
                GasCost = console.nextInt();
                LNum = console.nextInt();
                keepAsking = false;
            }catch(InputMismatchException e){
                System.err.println("Error Caught");
                console.nextLine();
                keepAsking = true;
            }

        System.out.println("The Total Price of Gas Is: " +  totalCost(GasCost,LNum));
        System.out.println("Do You Want To Go Again 1 2");
        int choice = console.nextInt();
        if(choice == 1){
            keepAsking = true;
        }
        }while(keepAsking);
    }

    public static double totalCost(double costGas,double numL){
        return costGas/numL;
    }
}

//Write a method called totalCost(double costGas, double numL) that accepts the following parameters:
//cost of gas $/L,
//number of L required to fill up the tank
//Returns: the total cost of gas
//
//In the main method, ask the user for the 2 pieces of information. Include error checking to ensure the user enters two values that are positive double values.

