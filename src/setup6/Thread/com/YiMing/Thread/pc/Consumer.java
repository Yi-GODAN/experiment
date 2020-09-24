package setup6.Thread.com.YiMing.Thread.pc;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 12:07
 */
public class Consumer implements Runnable {

    Goods goods = null;

    Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者---取走了" + this.goods.getName() + "====" + this.goods.getKind());
        }
    }

}
