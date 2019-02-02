import java.lang.Math;

public class Line {

    private Point point1, point2;

    //y=ax+b
    private double a, b;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;

        a = (point2.y - point1.y) / (point2.x - point1.x);
        b = point1.y - a * point1.x;
    }

    //finds the cross point between this line and another line
    public Point crossPoint(Line line) {
        double x = (line.b - this.b) / (this.a - line.a);
        double y = findY(x);
        return new Point(x, y);
    }

    public double findY(double x) {
        return a * x + b;
    }

    //checks if a point is between the initial and final points of a line
    public boolean isWithinBounds(Point p) {
        double minX = Math.min(point1.x, point2.x);
        double maxX = Math.max(point1.x, point2.x);
        if (p.x >= minX && p.x <= maxX) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("y=%.2fx+%.2f, I=(%.2f,%.2f), E=(%.2f,%.2f)",a,b, point1.x, point1.y, point2.x, point2.y);
    }
}