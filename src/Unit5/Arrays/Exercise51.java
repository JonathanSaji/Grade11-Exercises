package Unit5.Arrays;

public class Exercise51 {
    public static void main(String[] args) {
         int grades[] = {7,8,9,10,11,12};
         System.out.println(grades[4]);
        //System.out.println("Part 1:");
        //1. make an array of ints called grades with values 7, 8, 9, 10, 11, 12.
         System.out.println(grades[2]);
         for(int i = 0; i < grades.length; i++){
             grades[i]++;
             System.out.println(grades[i]);
         }
        System.out.println("\n\nPart 2:");
         String clubs[] = {"Chess and Checkers","Coding Club","Debate","Drama Club"};
         for(int i = 0; i < clubs.length; i++){
             System.out.print(clubs[i] + ", ");
         }
         clubFormater(clubs);
        System.out.println(clubs[0]);
         for(int i = 0; i < clubs.length; i++){
             System.out.println(clubs[i]);
         }
    }

    public static void clubFormater(String[] c){
        for(int i = 0; i<c.length;i++){
            c[i] = c[i].toLowerCase();
            if(!c[i].contains("club")){
                c[i] += " Club";
            }
        }

    }


}




//public static void main(String[] args) {

    //2. print grades at an index of 4

    //3. print the third element in grades (hint: the first element is 7)

    //4. use a loop to add one to each element in grades, and print each value on a new line.

    //System.out.println("\n\nPart 2:");
    //5. make an array of Strings called clubs and assign these Strings:
    //"Chess", "Coding Club", "Debate", "Drama Club"

    //6. Print out clubs, with each club on the same line, separated by a comma

    //7. Write a method after the main method called clubFormatter(String[] c)
    //that will be passed in an array of Strings, and check if each element contains the word "Club".
    //If it does not contain the word "Club" or "club", add "Club" to the string
    //Return type: void - arrays are passed in by reference - our original array will change

    //8. (Back in the main method)change the first element to "Chess and Checkers"

    //9. call clubFormatter with the club array

    //10. Print out the club array, with each club on a new line.
    //System.out.println("");//going to a new line

//} // end main method
