package javaweek8hwhimesh.poolarea;

public class Rectangle {
    double width;
    double length;

    Rectangle(double width,double length) {
        this.length = length;
        this.width = width;
        if (width<0)
            width=0;
        if(length<0)
            length=0;
    }

    public Rectangle() {

    }

    public double getWidth (){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return (width*length);
    }
}
