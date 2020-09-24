package setup6.Thread;

public class TestThread3 {
    public static void main(String[] args) {
        Runner3 r = new Runner3();
        Thread t = new Thread(r);
        t.start();
    }
}

class Runner3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            if (i % 10 == 0 && i != 0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("No. " + i);
        }
    }
}
