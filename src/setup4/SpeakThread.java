package setup4;

public class SpeakThread extends Thread {
    public void run() {
        System.out.println("new thread starts...");
        System.out.println("I'm speaking...");
        System.out.println("new thread ends...");
    }
}
