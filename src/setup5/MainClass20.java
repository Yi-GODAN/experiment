package setup5;

class MyClass {
    int height;

    MyClass() {
        System.out.println("无参数构造函数");
        height = 4;
    }

    MyClass(int i) {
        System.out.println("房子的高度为：" + i + "米");
        height = i;
    }

    void info() {
        System.out.println("房子的高度为：" + height + "米");
    }

    void info(String str) {
        System.out.println("房子的高度为：" + str + "米");
    }
}

public class MainClass20 {

    public static void main(String[] args) {
        MyClass t = new MyClass(3);
        t.info();
        t.info("重载方法");
        //重载构造函数
        new MyClass();
    }
}
