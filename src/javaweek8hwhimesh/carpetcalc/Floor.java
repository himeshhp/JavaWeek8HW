package javaweek8hwhimesh.carpetcalc;


public class Floor {

    double width, length;

    Floor(double width, double length){
        this.length= length;
        this.width=width;
        if (width<0)
            width=0;
        if (length<0)
            length=0;
    }

    public double getArea(){
        return width*length;
    }
}