package javaweek8hwhimesh.carpetcalc;

public class Calculator {
    Floor floor;
    Carpet carpet;

    Calculator(Floor floor, Carpet carpet) {
        super();
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
}