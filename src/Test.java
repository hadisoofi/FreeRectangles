public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(2,0);
        Point center = new Point(3, 0);
        Point p2 = p1.rotate(center, 90);
        System.out.println(p2);

    }
}
