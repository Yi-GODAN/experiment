package setup6.Thread.com.YiMing.Thread.pc3;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 12:07
 */
public class Producer implements Runnable {

    Goods goods = null;

    Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                goods.set("娃哈哈", "矿泉水");
            } else {
                goods.set("旺仔", "牛奶");
            }
        }
    }
}
