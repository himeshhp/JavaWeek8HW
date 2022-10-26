package javaweek8hwhimesh.poolarea;

public class Cuboid extends Rectangle {
    double height;

    Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
        if (height < 0) {
            height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea() * height);
    }
}