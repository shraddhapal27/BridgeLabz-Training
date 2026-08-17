package day13.homework;

import org.w3c.dom.css.Rect;

public class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    void scale(int factor){
        length = length*factor;
        width = width * factor;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = r1;
        r2.scale(2);

        System.out.println("rect1 length: " + r1.length);
        System.out.println("rect1 width: " + r1.width);

        System.out.println("rect2 length: " + r2.length);
        System.out.println("rect2 width: " + r2.width);
    }

}
