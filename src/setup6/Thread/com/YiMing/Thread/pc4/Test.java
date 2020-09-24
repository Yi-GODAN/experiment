package setup6.Thread.com.YiMing.Thread.pc4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 15:41
 */
public class Test {

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue<Goods>(5);

        ProducerQueue producer = new ProducerQueue(blockingQueue);
        ConsumerQueue consumer = new ConsumerQueue(blockingQueue);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}
