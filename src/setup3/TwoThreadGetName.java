package setup3;

public class TwoThreadGetName extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            printMag();
        }
    }

    public void printMag() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name= " + name);
    }

    public static void main(String[] args) {
        TwoThreadGetName tt = new TwoThreadGetName();
        tt.start();
        for (int i = 0; i < 10; i++) {
            tt.printMag();
        }
    }
}
