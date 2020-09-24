package setup5;

public class BoxDemo<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        BoxDemo<Integer> integerBox = new BoxDemo<Integer>();
        BoxDemo<String> stringBox = new BoxDemo<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World!"));

        System.out.printf("����ֵΪ��%d\n", integerBox.get());
        System.out.printf("�ַ���Ϊ��%s\n", stringBox.get());
    }
}
