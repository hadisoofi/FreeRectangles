import java.lang.Math;


public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // rotate point around another point by an angle of alpha
    public Point rotate(Point center, double alpha) {

        Point p = this.subtract(center);
        double xNew = p.x * Math.cos(alpha * Math.PI / 180.0) - p.y * Math.sin(alpha * Math.PI / 180.0) ;
        double yNew = p.x * Math.sin(alpha * Math.PI / 180.0) + p.y * Math.cos(alpha * Math.PI / 180.0) ;
        xNew += center.x;
        yNew += center.y;
        return new Point(xNew, yNew);
    }

    public Point add(Point p) {
        return new Point(this.x + p.x, this.y + p.y);
    }

    public Point subtract(Point p) {return new Point(this.x - p.x, this.y - p.y);}

    @Override
    public String toString() {
        return String.format("x: %.2f, y: %.2f", x, y);
    }
}