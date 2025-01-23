package ExamReview;

public class Temprature {
    public static void main(String[] args) {
        int [ ] temperature = { 80, 75, 55, 21, 3, 98, 67};
        PrintEveryOtherInt(temperature);
    }

    public static void PrintEveryOtherInt(int[]a){
        for(int i = 0; i<=a.length -1; i += 2){
            if(i==a.length -1){
                System.out.print(a[i]);
            }
            else {
                System.out.print(a[i] + ", ");
                 }
            }
    }
}