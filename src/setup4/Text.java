package setup4;

class Text {
    public static int X = 100;
    public final static int Y = 200;

    public Text() {
        System.out.println("Test构造函数执行");
    }

    static {
        System.out.println("static语句块执行");
    }

    public static void display() {
        System.out.println("静态方法被执行");
    }

    public void display_1() {
        System.out.println("实例方法被执行");
    }


    public static void main(String args[]) {
        try {
            Class.forName("Test");
            Class.forName("Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

