package setup6.Thread.com.YiMing.Thread;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 10:03
 */
public class JoinTest {

    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "=======" + i);
                if (i == 3)
                    thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
