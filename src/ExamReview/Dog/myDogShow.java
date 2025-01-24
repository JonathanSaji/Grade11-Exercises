package ExamReview.Dog;

import java.util.Arrays;

public class myDogShow {
    String[] someDogs;
    String showDate; //in the form MMM/DD/YYYY
    int numDogs;

    public myDogShow(){
        this.someDogs = new String[]{"Puppy,Dog,Retriever,Black Sheppard"};
        this.showDate = "12/05/2025";
        this.numDogs = 10;
    }
    //1. Write a void method named dogsInShow that takes a DogShow
    //object and outputs all the dogs in that show to the console.

    public void dogsInShow(myDogShow d){
        System.out.println(Arrays.toString(d.someDogs));
    }

    public static void main(String[] args) {
        myDogShow d = new myDogShow();
        d.dogsInShow(d);
        char[] alphabets = new char[26];
        for(int i = 0; i <= alphabets.length - 1; i++){
            char letter = 'A';
            alphabets[i] = letter +=i;
        }
        System.out.println(Arrays.toString(alphabets));
    }
}
