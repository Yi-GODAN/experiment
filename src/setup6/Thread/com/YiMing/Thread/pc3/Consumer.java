package setup6.Thread.com.YiMing.Thread.pc3;

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
            goods.get();
        }
    }

}
