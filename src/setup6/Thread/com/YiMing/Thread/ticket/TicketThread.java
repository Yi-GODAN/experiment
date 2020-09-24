package setup6.Thread.com.YiMing.Thread.ticket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 08:11
 */
public class TicketThread implements Runnable {

    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 使用同步代码块的方式解决多线程数据安全的问题
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket-- + "张票");
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketThread ticketThread = new TicketThread();
        Thread thread1 = new Thread(ticketThread, "A");
        Thread thread2 = new Thread(ticketThread, "B");
        Thread thread3 = new Thread(ticketThread, "C");
        Thread thread4 = new Thread(ticketThread, "D");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
