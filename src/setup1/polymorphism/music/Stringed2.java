package setup1.polymorphism.music;

public class Stringed2 extends Instrument {
    void play(Note n) {
        System.out.println("Stringed2.play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Stringed2");
    }
}
