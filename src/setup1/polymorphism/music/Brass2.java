package setup1.polymorphism.music;

public class Brass2 extends Wind2 {
    public void play(Note n) {
        System.out.println("Brass2.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass2");
    }
}