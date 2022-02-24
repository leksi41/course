package by.itland.itjava.Artyr000.lesson08;

public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point other){
        return Math.sqrt(Math.pow(other.x-this.x,2)+Math.pow(other.y - this.y,2));
    }

    public static void main(String[] args){
        Point pointA = new Point(3, 4);
        Point pointB = new Point(-3, -4);

        System.out.println(pointB.distance(pointA));
    }
}
