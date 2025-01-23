package Unit3_ObjectOriented.Circle;

public class Circle {
    private double radius;
    private String units;

    public Circle(){
        this.radius = 0;
        this.units = "cm";
    }

    public Circle(double r, String u){
        this.radius = r;
        this.units = u;
    }
    public void setRadius(double r){
        if(r > 0) {
            this.radius = r;
        }
    }
    public void setUnits(String u){
        this.units = u;
    }
    public double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return radius*2;
    }
    public String getUnits(){
        return units;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*(radius*radius);
    }

}
