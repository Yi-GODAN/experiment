package setup1.Interfaces;

import setup1.polymorphism.music.Note;

/**
 * toString( ), all Instruments would otherwise use the original,
 * non-abstract toString( ) from the root class Object.
 */

abstract class Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    // Forces implements in derived class
    abstract public String toString();
}

class Wind extends Instrument {
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Instrument {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Instrument {
    public String toString() {
        return "Woodwind";
    }
}

public class E09_AbstractMusic5 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
        i.adjust();
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
