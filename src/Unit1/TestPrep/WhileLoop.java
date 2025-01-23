package Unit1.TestPrep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean keepGoing = true;
        int num = 0;
        while(keepGoing){
            try{
                System.out.println("Enter An Integer");
                num = console.nextInt();
                keepGoing = false;
            }catch(InputMismatchException e){
                System.err.println(e + " Error");
                console.nextLine();
                keepGoing = true;
            }
            if(num <= 0){
                System.out.println("Incorrect Integer Try Again");
                keepGoing = true;
            }
        }
        int printNum = 1;
        while(num != 0){
            System.out.print(printNum + ", ");
            num--;
            printNum++;
        }
    }
}
