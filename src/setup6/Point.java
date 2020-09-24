package setup6;

public class Point {
    double x, y, z;

    Point(int _x, int _y, int _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public void setX(int _x) {
        x = _x;
    }

    public void setY(int _y) {
        y = _y;
    }

    public void setZ(int _z) {
        z = _z;
    }

    public double distance() {
        return Math.sqrt(Math.pow(x, 2) +
                Math.pow(y, 2) + Math.pow(z, 2));
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 1, 1);
        Point p2 = new Point(2, 3, 4);
        p1.setX(2);
        p1.setY(2);
        p1.setZ(2);
        System.out.println("P1 Original distance square : " +
                p1.distance());
        System.out.println("P2 Original distance square : " +
                p2.distance());
    }
}
