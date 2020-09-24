package setup1.polymorphism.music;

public class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play()");
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
