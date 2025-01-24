package Unit3_ObjectOriented.Rectangle;

import Unit3_ObjectOriented.Circle.Circle;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,44);
        Rectangle w = new Rectangle(4,44);
        Circle c = new Circle();
        System.out.println(r.equals(w));
        System.out.println(r.compareTo(w));
    }
}
