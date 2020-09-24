package setup6;

public class TestPet {

    TestPet(careForPet cfp) {
        cfp.feeding();
        cfp.play();
    }

    public static void main(String[] args) {
        TestPet tp1 = new TestPet(new Worker());
        TestPet tp2 = new TestPet(new farmer());
        TestPet tp3 = new TestPet(new cadre());
    }
}
