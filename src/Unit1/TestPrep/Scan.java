package Unit1.TestPrep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean keepGoing = true;
        int FDigitNum = 0;
        while (keepGoing) {
            try {
                System.out.println("Enter a 4 Digit Number");
                FDigitNum = console.nextInt();
                if (FDigitNum / 1000 >= 1 && FDigitNum / 1000 <= 9) {
                    keepGoing = false;
                } else {
                    keepGoing = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e);
                keepGoing = true;
                console.nextLine();
            }
        }
        int Digit1 = FDigitNum / 1000;
        int Digit2 = (FDigitNum - Digit1*1000) / 100;
        int Digit3 = (FDigitNum - Digit1*1000 - Digit2*100) / 10;
        int Digit4 = (FDigitNum - Digit1*1000 - Digit2*100 - Digit3*10) / 1;
        int total = (Digit1 + Digit2 + Digit3 + Digit4);
       System.out.println(total);
    }
}
