package setup6.Thread;

public class TestThread2 {
    public static void main(String[] args) {
        Runner2 r = new Runner2();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}

class Runner2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("No. " + i);
        }
    }
}
