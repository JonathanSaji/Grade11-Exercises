package ExamReview.Dog;

public class Dog {
    public int weight;
    public String breed;
    public String colour;
    public String name;

    public Dog(){
        this.weight = 10;
        this.breed = "German Sheppard";
        this.colour = "Black";
        this.name = "Doggie";
    }

    public Dog(int w, String b, String c, String n){
        this.weight = w;
        this.breed = b;
        this.colour = c;
        this.name = n;
    }

    public String toString(){
        return "Weight: " + this.weight + " \nBreed: " + this.breed + " \nColor: " + this.colour + " \nName: " + this.name;
    }



    public static void main(String[] args) {
        Dog aDog = new Dog();
        System.out.println(aDog);
    }


}





//Given a Class, Dog with the
//following instance variables:
//int weight;
//String breed;
//String colour;
//String name;
//
//1. Write a default constructor that sets all the instance
//variables to some reasonable default value.
//
//1. Write a constructor that takes parameters for all
//instance variables and sets them accordingly.
//
//1. What would be the output of the following code in the main:
//
//Dog aDog = new Dog( );
//System.out.print(aDog);
//
//1. Write a toString( ) method that returns a String
//with the Dog’s name, breed and colour on
//separate lines.