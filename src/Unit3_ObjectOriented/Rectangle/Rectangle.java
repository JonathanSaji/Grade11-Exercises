package Unit3_ObjectOriented.Rectangle;

import org.w3c.dom.css.Rect;

public class Rectangle implements Comparable {

    private int length;
    private int width;

    public Rectangle(int len, int wid){
        length = len;
        width = wid;
    }
    public Rectangle(){
        this.length = 1;
        this.width = 2;
    }
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setLength(double length){
        this.length = (int)length;
    }
    public void setWidth(double width){
        this.length = (int)width;
    }
    public int getArea(){
        return width*length;
    }
    public int getPerimeter(){
        return 2*width + 2*length;
    }
    public String toString(){
        return "Width: " + width + " Length: " + length;
    }
    @Override
    public int compareTo(Object o) {
        if(o instanceof Rectangle){
            Rectangle r = (Rectangle)o;
            if(r.getLength() == this.getLength()){
                return 0;
            }
            else if(r.getLength() > this.getLength()){
                return 1;
            }
            else if(r.getLength() < this.getLength()){
                return -1;
            }
            if(r.getWidth() == this.getWidth()){
                return 0;
            }
            else if(r.getWidth() > this.getWidth()){
                return 1;
            }
            else if(r.getWidth() < this.getWidth()){
                return -1;
            }
        }
        return -1;
    }



    public boolean equals(Object o){
        if(o instanceof Rectangle){
            Rectangle r = (Rectangle)o;
            if(r.getLength() == getLength() && r.getWidth() == getWidth() &&
            r.getArea() == getArea() && r.getPerimeter() == getPerimeter()){
                return true;
            }
        }
        return false;
    }
}










//Rectangle
//- length: int
//- width: int
//+ Rectangle(int len, int wid)
//+ Rectangle() ->use the this keyword
//+ getLength(): int
//+ getWidth(): int
//+ setLength(int len): void
//+ setWidth(int wid): void
//+ setLength(double len): void
//+ setWidth(double wid): void
//+ getArea(): int
//+ getPerimeter(): int
//+ toString(): String
//+ equals(Object o): boolean  -> Hint: most of this method is in the notes below

