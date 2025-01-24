package Unit3_ObjectOriented;
public class RecursionFactorial{
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
        System.out.println(isPrimeFactor(82));
    }

    public static int factorial(int n) {
        if (n == 0) { // Base case
            return 1;
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static boolean isPrimeFactor(int num){
        if(num <= 1){
            return false;
        }
        for(int i =2; i <= Math.sqrt(num);i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}