package setup3;

class MyThread extends Thread {
    boolean waiting = true;
    boolean ready = false;

    MyThread() {

    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting.");
        while (waiting)
            System.out.println("waiting: " + waiting);
        System.out.println("waiting...");
        startWait();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(threadName + "interrupted.");
        }
        System.out.println(threadName + " terminating.");
    }

    synchronized void startWait() {
        try {
            while (!ready)
                wait();
        } catch (InterruptedException e) {
            System.out.println("wait() interrupted");
        }
    }

    synchronized void notice() {
        ready = true;
        notify();
    }
}

public class MainClass13 {
    public static void main(String[] args) throws Exception {
        MyThread thread = new MyThread();
        thread.setName("MyThread #1");
        showThreadStatus(thread);
        thread.start();
        Thread.sleep(50);
        showThreadStatus(thread);
        thread.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thread);
        thread.notice();
        Thread.sleep(50);
        showThreadStatus(thread);
        while (thread.isAlive()) {
            System.out.println("alive");
        }
        showThreadStatus(thread);
    }

    static void showThreadStatus(Thread thread) {
        System.out.println(thread.getName() + "Alive:= " + thread.isAlive() + " State:=" + thread.getState());
    }
}
