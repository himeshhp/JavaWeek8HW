package javaweek8hwhimesh.cylinder;

public class Circle {

    protected double radius = 0;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
        if(radius<0)
            radius=0;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }
}