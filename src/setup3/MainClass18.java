package setup3;

// java 程序 - 演示线程状态
class thread implements Runnable {
    public void run() {
        // thread2 - 超时等待
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of thread1 while it called join() method on thread2 - "
                + MainClass18.thread1.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MainClass18 implements Runnable {
    public static Thread thread1;
    public static MainClass18 obj;

    public static void main(String[] args) {
        obj = new MainClass18();
        thread1 = new Thread(obj);

        // 创建 thread1 现为初始状态
        System.out.println("State of thread1 after creating it - "
                + thread1.getState());
        thread1.start();

        // thread1 - 就绪状态
        System.out.println("State of thread1 after calling .start() method on it - "
                + thread1.getState());
    }

    public void run() {
        thread myThread = new thread();
        Thread thread2 = new Thread(myThread);

        // 创建 thread1，现为初始状态
        System.out.println("State of thread2 after creating it - "
                + thread2.getState());

        // thread2 - 就绪状态
        System.out.println("State of thread2 after calling .start() method it - "
                + thread2.getState());

        // moving thread1 to timed waiting state
        try {
            // moving - 超时等待
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread2 after calling .sleep() method on it - "
                + thread2.getState());

        try {
            // 等待 thread2 终止
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread2 it has finished it's execution - "
                + thread2.getState());
    }
}
