package Unit1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise1 {

    public static int seconds;
    public static int choice;
    public static void main(String[] args) {
        boolean keepGoing = true;
        boolean retry = false;
        Scanner console = new Scanner(System.in);
       do {
           do {
               try {
                   System.out.println("Please Enter an Integer for Movie Convertor");
                   seconds = console.nextInt();
                   keepGoing = false;
               } catch (InputMismatchException e) {
                   System.err.println("Error");
                   keepGoing = true;
                   console.nextLine();
               }
           } while (keepGoing);

           int hours, minutes, remaining_seconds;
           hours = seconds / 3600;
           minutes = seconds - 3600 * hours;
           minutes /= 60;

           remaining_seconds = seconds - 3600 * hours - minutes * 60;
           System.out.println(hours + " Hours " + minutes + " Minutes " + remaining_seconds + " Seconds");

           boolean keepAsking = false;
           do {
               do {
                   try {
                       System.out.println("Wanna Go Again?, Enter 1 (Yes) , Enter 2 (No)");
                       choice = console.nextInt();
                   } catch (InputMismatchException e) {
                       System.err.println("Invalid Input");
                       console.nextLine();
                       keepAsking = true;
                   }
               } while (keepAsking);

               if (choice == 1) {
                   retry = true;
               } else if (choice == 2) {
                   retry = false;
                   System.exit(0);
               } else {
                   System.err.println("Invalid Input, Try Again");
                   keepAsking = true;
               }
           }while(keepAsking);
       }while(retry);
    }
}


//Sample Output
//Get user input of the length of a movie in seconds and convert to time in hours, minutes and seconds.
//Sample input: hi
//Sample output: "Please enter an integer"
//Sample input: 3721
//Sample output: "1 hour, 2 minutes, 1 second."
//Sample input: 1
//Sample output: "0 hours, 0 minutes, 1 second."
