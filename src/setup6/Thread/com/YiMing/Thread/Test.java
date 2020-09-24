package setup6.Thread.com.YiMing.Thread;

/**
 * @Program: ThinkingInJava
 * @Description: 1~10 10~1 交替输出
 * @Author: YiMing
 * @Created: 2020/09/03 10:26
 */
public class Test implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "===========" + i);
            try {
                Thread.sleep(1005);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Test());
        thread.start();
        for (int i = 10; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + "===========" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
