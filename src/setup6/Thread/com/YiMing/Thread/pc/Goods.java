package setup6.Thread.com.YiMing.Thread.pc;

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

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  String getKind() {
        return kind;
    }

    public  void setKind(String kind) {
        this.kind = kind;
    }
}
