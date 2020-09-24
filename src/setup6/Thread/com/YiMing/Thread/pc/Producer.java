package setup6.Thread.com.YiMing.Thread.pc;

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
                goods.setName("娃哈哈");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setKind("矿泉水");
                System.out.println("生产者---生产了" + goods.getName() + "====" + goods.getKind());
            } else {
                goods.setName("旺仔");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setKind("牛奶");
                System.out.println("生产者---生产了" + this.goods.getName() + "====" + this.goods.getKind());
            }
        }
    }
}
