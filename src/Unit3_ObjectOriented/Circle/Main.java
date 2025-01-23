package Unit3_ObjectOriented.Circle;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0, "cm");
        System.out.println(c1.getUnits());
        c1.setRadius(6);
        System.out.println(c1.getRadius()); //prints out 6.0 (new radius)
        c1.setRadius(-10); //shouldn't change radius, as radius > 0		System.out.println(c1.getRadius()); //prints out 6.0 (same radius)
        System.out.println(c1.getCircumference());//prints 37.699…
    }
}
