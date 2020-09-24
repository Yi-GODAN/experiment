package setup3;

import java.util.LinkedList;

public class MainClass2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        // Java 实例 – 在链表（LinkedList）的开头和结
        System.out.println(list);
        list.addFirst("0");
        System.out.println(list);
        list.addLast("6");
        System.out.println(list);

        // Java 实例 – 获取链表（LinkedList）的第一个
        System.out.println("链表的第一个元素是：" + list.getFirst());
        System.out.println("链表的最后一个元素是：" + list.getLast());

        // Java 实例 – 删除链表中的元素 subList(前闭后开区间)
        System.out.println("删除链表中的元素：" + list.subList(2, 4));
        list.subList(2, 4).clear();
        System.out.println("删除后链表中的元素是：" + list);

        // Java 实例 – 获取链表的元素
        MainClass2 stack = new MainClass2();
        for (int i = 30; i < 40; i++)
            stack.push(new Integer(i));
        System.out.println("");
        System.out.println("链表2中的第一个元素是：" + stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    private LinkedList list2 = new LinkedList();

    public void push(Object o) {
        list2.addFirst(o);
    }

    public Object top() {
        return list2.getFirst();
    }

    public Object pop() {
        return list2.removeFirst();
    }
}
