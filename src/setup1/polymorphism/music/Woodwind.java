package setup1.polymorphism.music;

public class Woodwind extends Wind2 {
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String toString() {
        return "Woodwind";
    }
}