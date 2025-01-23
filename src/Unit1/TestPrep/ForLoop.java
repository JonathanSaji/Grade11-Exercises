package Unit1.TestPrep;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double change = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Enter Number: " + i);
            double number = console.nextDouble();
            change += number;

        }
        System.out.println(change);
    }
}
