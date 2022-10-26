package javaweek8hwhimesh.cylinder;

public class Cylinder extends javaweek8hwhimesh.cylinder.Circle {
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        if (height < 0)
            height = 0;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

}