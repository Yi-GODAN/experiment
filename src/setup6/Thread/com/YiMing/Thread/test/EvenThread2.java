package setup6.Thread.com.YiMing.Thread.test;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 08:21
 */
public class EvenThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "是偶数----" + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        EvenThread2 evenThread1 = new EvenThread2();
        Thread thread = new Thread(evenThread1);
        Thread thread2 = new Thread(evenThread1);
        thread.start();
        thread2.start();
    }
}
