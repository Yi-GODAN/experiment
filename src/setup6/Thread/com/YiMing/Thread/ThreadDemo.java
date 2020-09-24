package setup6.Thread.com.YiMing.Thread;

/**
 * @Program: ThinkingInJava
 * @Description:多线程简单实例
 * @Author: YiMing
 * @Created: 2020/09/03 07:40
 */

/**
 * 实现多线程时：
 *      1. 需要继承Thread类
 *      2. 必须要重写run方法，指的是核心执行的逻辑
 *      3. 线程在启动时，不要直接调用run方法，而是要通过start()来进行调用
 *      4. 每次运行相同的代码，结果可能都不相同，原因在于多线程谁来先抢占资源认为无法控制
 *  的二种实现方法：（使用了代理设计模式）
 *      1. 实现Runnable接口
 *      2. 重写run方法
 *      3. 创建Thread对象，将创建好的runnable的子类实现作为thread的构造函数
 *      4. 通过thread.start()进行启动
 *  推荐使用第二种方式
 *      1. java是单继承，将继承关系留给最需要的类
 *      2. 使用Runnable接口之后不需要给共享变量添加static关键字，每次创建一个对象，作为共享对象即可
 *   线程的生命周期：
 *      1. 新生状态：
 *          当创建好当前线程对象之后，没有启动之前（调用start方法之前）
 *          ThreadServer thread = new ThreadServer
 *          RunnableDemo run = new Runnable
 *      2. 就绪状态：准备开始执行，并没有执行，表示调用start方法之后。
 *          当对应的线程创建完成，且调用start方法之后，所有的线程会添加至一个就绪队列中，所有的线程同时去抢占CPU资源
 *      3. 运行状态：当前进程获取到cpu资源之后，就绪队列中的所有线程会抢占cup的资源，谁先抢占，则谁先执行，在执行过程中的状态叫做运行状态。
 *          进入的方式：
 *              1. 正常运行完成且结束
 *              2. 认为中断执行，比如使用stop方法
 *              3. 程序抛出未捕获的异常
 *      4. 阻塞状态：在程序运行过程中，发生某系异常情况，导致线程无法执行，此时会进入线程阻塞状态，进入阻塞状态的原因消除之后，所有的阻塞队列会再次进入到就绪状态中，随机抢占cpu资源，等待执行。
 *          进入的方式：
 *              sleep()
 *              等待IO资源
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "----------------" + i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "========" + i);
        }
    }
}
