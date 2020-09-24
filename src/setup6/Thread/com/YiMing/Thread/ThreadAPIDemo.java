package setup6.Thread.com.YiMing.Thread;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 09:28
 */
public class ThreadAPIDemo implements Runnable{

    public static void main(String[] args) {

        // 获取当前线程对象
        Thread thread = Thread.currentThread();
        // 获取当前线程的名称
        System.out.println(thread.getName());
        // 获取线程的id
        System.out.println(thread.getId());
        // 获取线程的优先级，在一般系统中范围是1~10，默认5，（有些系统为1~100）
        System.out.println(thread.getPriority());
        // 设置线程池的优先级
        /**
         * 优先级越高一定越先执行吗？
         *      不一定，只是优先执行的概率较大
         */
        thread.setPriority(10);
        System.out.println(thread.getPriority());

        ThreadAPIDemo threadAPIDemo = new ThreadAPIDemo();
        Thread thread1 = new Thread(threadAPIDemo);
        System.out.println(thread1.isAlive());
        thread1.start();
        System.out.println(thread1.isAlive());
        System.out.println(thread1.getPriority());
        /*for (int i = 0; i < 5;i++) {
            System.out.println(Thread.currentThread().getName() + "========" + i);
        }*/
        System.out.println(thread1.isAlive());
    }

    @Override
    public void run() {
        /*for (int i = 0; i < 5;i++) {
            System.out.println(Thread.currentThread().getName() + "========" + i);
        }*/
    }
}
