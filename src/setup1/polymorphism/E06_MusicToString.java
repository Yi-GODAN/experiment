package setup1.polymorphism;

import setup1.polymorphism.music.Instrument;
import setup1.polymorphism.music.Note;

class Wind2 extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed2 extends Instrument {
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

class Woodwind extends setup1.polymorphism.music.Wind2 {
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String toString() {
        return "Woodwind";
    }
}

class Brass2 extends setup1.polymorphism.music.Wind2 {
    public void play(Note n) {
        System.out.println("Brass2.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass2");
    }
}

public class E06_MusicToString {
    static Instrument[] orchestra = {
            new setup1.polymorphism.music.Wind2(),
            new setup1.polymorphism.music.Percussion(),
            new setup1.polymorphism.music.Stringed2(),
            new setup1.polymorphism.music.Brass2(),
            new setup1.polymorphism.music.Woodwind()
    };

    public static void printAll(Instrument[] orchestra) {
        for (Instrument i : orchestra)
            System.out.println(i);
    }

    public static void main(String[] args) {
        printAll(orchestra);
    }
}
