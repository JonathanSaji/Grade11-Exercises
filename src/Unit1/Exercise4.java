package Unit1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        int integer = 0;
        Scanner console = new Scanner(System.in);

        boolean keepGoing;
            do{
                try{
                    System.out.println("Enter Integer");
                    integer = console.nextInt();
                    keepGoing = false;
                }catch(InputMismatchException e){
                    System.err.println("Input Error Try Again");
                    keepGoing = true;
                    console.nextLine();
                }
            }while(keepGoing);

            int sqrRoot = (int)Math.sqrt(integer);//type cast it
            if(sqrRoot*sqrRoot == integer){
                System.out.println(integer + " is a perfect square");
            }
            else{
                System.out.println(integer + " is not a perfect square");
            }



//    Write a program to ask the user for an integer, and print out if it is a perfect square (a perfect square number can be written as a whole number times itself, for example: 1, 4, 9, 16, etc).
//    Sample input: 25
//    Sample output: 25 is a perfect square

    }
}
