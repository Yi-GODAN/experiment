package setup4;

public class SellTicketsTest {
    public static void main(String[] args) {
        SellTickets t = new SellTickets();
        new Thread(t, "窗口1").start();
        new Thread(t, "窗口2").start();
        new Thread(t, "窗口3").start();
    }
}

class SellTickets implements Runnable {
    private int tickets = 10;

    public void run() {
        for (int i = 1; i < tickets; i++) {
            synchronized (this) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖出第" + tickets + "张票");
            }
            tickets--;
        }

    }
}
