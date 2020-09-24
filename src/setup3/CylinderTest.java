package setup3;

public class CylinderTest extends Cylinder {
    public CylinderTest() {
        super(radius, height);
    }

    public static void main(String[] args) {
        CylinderTest tes = new CylinderTest();
        tes.getRadius();
        tes.getHeight();
        tes.getPerimeter();
        tes.getArea();
        tes.getVol();
        tes.disp();
        tes.dispVol();
    }
}
