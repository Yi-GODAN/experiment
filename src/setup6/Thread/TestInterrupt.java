package setup6.Thread;

import java.util.Date;

public class TestInterrupt {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("=====" + new Date() + "=====");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

}
