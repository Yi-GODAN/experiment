package setup6.Thread.com.YiMing.Thread.pc2;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 15:30
 */
public class Goods {

    private String name;
    private String kind;

    Goods() {
    }

    public Goods(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public synchronized void set(String name, String kind) {
        this.setName(name);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setKind(kind);
        System.out.println("生产者---生产了" + this.getName() + "====" + this.getKind());
    }

    public synchronized void get() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者---消费了" + this.getName() + "====" + this.getKind());
    }
}
