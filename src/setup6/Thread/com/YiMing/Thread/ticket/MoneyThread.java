package setup6.Thread.com.YiMing.Thread.ticket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 11:31
 */
public class MoneyThread implements Runnable{

    private int money = 10000;

    @Override
    public void run() {
        while (money > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                System.out.println(Thread.currentThread().getName()+"，准备取款");
                if (money >= 0) {
                    System.out.println(Thread.currentThread().getName()+"完成取款");
                    money -= 1000;
                }
            }
        }
    }

    public static void main(String[] args) {
        MoneyThread moneyThread = new MoneyThread();
        Thread thread1 = new Thread(moneyThread, "张三");
        Thread thread2 = new Thread(moneyThread, "张三的老婆");
        thread1.start();
        thread2.start();
    }
}
