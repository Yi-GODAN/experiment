package setup6.Thread.com.YiMing.Thread.pc4;

import java.util.concurrent.BlockingQueue;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 12:07
 */
public class ProducerQueue implements Runnable {

    BlockingQueue<Goods> blockingQueue = null;



    ProducerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            Goods goods = null;
            if(i%2==0){
                goods = new Goods("娃哈哈","矿泉水");
            }else{
                goods = new Goods("旺仔","牛奶");
            }
            System.out.println("生产者开始生产商品："+goods.getName()+"--"+goods.getKind());
            try {
                blockingQueue.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
