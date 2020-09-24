package setup6.Thread.com.YiMing.Thread.test;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 08:21
 */
public class EvenThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "是偶数----" + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        EvenThread1 evenThread1 = new EvenThread1();
        EvenThread1 evenThread2 = new EvenThread1();
        evenThread1.start();
        evenThread2.start();
    }
}
