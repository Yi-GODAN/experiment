package setup6.Thread.com.YiMing.Thread;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 10:02
 */
public class YieldTest {

    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                Thread.yield();
//                thread.stop();
                System.out.println(Thread.currentThread().getName() + "=======" + i + "礼让一次");
            } else {
                System.out.println(Thread.currentThread().getName() + "=======" + i);
            }
        }
    }
}
