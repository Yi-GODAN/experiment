package setup6.Thread.com.YiMing.Thread.pc4;

import java.util.concurrent.BlockingQueue;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 12:07
 */
public class ConsumerQueue implements Runnable {

    BlockingQueue<Goods> blockingQueue = null;

    ConsumerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            try {
                Goods goods = blockingQueue.take();
                System.out.println("消费者消费的商品是："+goods.getName()+"--"+goods.getKind());
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
