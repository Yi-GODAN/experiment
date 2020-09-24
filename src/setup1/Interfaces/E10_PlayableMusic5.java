package setup1.Interfaces;

import setup1.polymorphism.music.Note;

interface Playable {
    void play(Note n);
}

abstract class Instrument2 {
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    // Forces implements in derived class
    abstract public String toString();
}

class Wind2 extends Instrument2 implements Playable {
    public String toString() {
        return "Wind";
    }

    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
}

class Percussion2 extends Instrument2 implements Playable {
    public String toString() {
        return "Percussion";
    }

    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
}

class Stringed2 extends Instrument2 implements Playable {
    public String toString() {
        return "Stringed";
    }

    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
}

class Brass2 extends Instrument2 implements Playable {
    public String toString() {
        return "Brass";
    }

    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
}

class Woodwind2 extends Instrument2 implements Playable {
    public String toString() {
        return "Woodwind";
    }

    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
}

public class E10_PlayableMusic5 {
    static void tune(Playable p) {
        p.play(Note.C_SHARP);

    }

    static void tuneAll(Playable[] p) {
        for (Playable playable : p)
            tune(playable);
    }

    public static void main(String[] args) {
        Playable[] p = {
                new Wind2(),
                new Percussion2(),
                new Stringed2(),
                new Brass2(),
                new Woodwind2()
        };
        tuneAll(p);
    }
}

/**
 * We make Playable a concrete class to eliminate code duplication,
 * as Wind2, Percussion2, and Stringed2 only use interfaces,
 * and don’t inherit from any concrete classes.
 */
