package javaweek8hwhimesh.carpetcalc;

public class Carpet {
    double cost;

    Carpet(double cost) {
        if (cost < 0)
            cost = 0;
        this.cost=cost;
    }

    public double getCost() {
        return cost;
    }
}