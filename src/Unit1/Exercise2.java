package Unit1;

public class Exercise2 {
    public static void main(String[] args) {
        for(int i = 5; i <=100 ; i++){
            if(i % 3 == 0 || i % 5 == 0 && i !=100){
                System.out.print(i + ", ");
            }
            else if(i == 100){
                System.out.print(i);
            }
        }
    }
}



//Write a program that will print all of the numbers from 5 to 100 that are divisible by 3 or 5.
//Sample output:
//        5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25, 27, 30, 33, 35, 36, 39, 40, 42, 45, 48, 50, 51, 54, 55, 57, 60, 63, 65, 66, 69, 70, 72, 75, 78, 80, 81, 84, 85, 87, 90, 93, 95, 96, 99, 100,
