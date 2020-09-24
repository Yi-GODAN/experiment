package setup6.Thread.com.YiMing.Thread;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 08:03
 */
public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "----------------" + i);
        }
    }

    public static void main(String[] args) {
        RunnableDemo runnable = new RunnableDemo();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "========" + i);
        }
    }
}
