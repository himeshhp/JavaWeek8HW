package javaweek8hwhimesh;

public class Point {
    int x, y;

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double dis;
        int x1 = getX();
        int x2 = 0;
        int y1 = getY();
        int y2 = 0;
        dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return dis;
    }

    public double distance(int x, int y) {
        double dis;
        int x1 = this.x;
        int y1 = this.y;
        dis = Math.sqrt((y - y1) * (y - y1) + (x - x1) * (x - x1));
        return dis;
    }

    public double distance(Point second) {
        double dis;
        double x1 = this.x;
        double x2 = second.x;
        double y1 = this.y;
        double y2 = second.y;
        dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return dis;
    }

    public static void main(String[] args) {
        //set the value of x and y
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)=" + first.distance());
        //get the distance of point by passing parameter as object
        System.out.println("distance(second)=" + first.distance(second));
        System.out.println("distance(2,2)=" + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()=" + point.distance());
    }
}


