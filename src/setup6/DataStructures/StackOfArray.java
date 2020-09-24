package setup6.DataStructures;

/**
 * @Program: ThinkingInJava
 * @Description: 用数组实现栈
 * @Author: YiMing
 * @Created: 2020/09/01 17:59
 */
public class StackOfArray {

    private int top; // 栈顶指针
    private int[] arr;
    private int size;

    StackOfArray(int size) {
        this.top = - 1;
        this.arr = new int[size];
        this.size = size;
    }

    public void push(int ele) {
        if (!isFull()) {
            ++top;
            arr[top] = ele;
            System.out.println("Pushed element:" + ele);
        } else {
            System.out.println("Stack is full!!!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(arr[top]);
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public static void main(String[] args) {
        StackOfArray stack = new StackOfArray(10);
        stack.pop();
        System.out.println("=======================");
        stack.push(10);
        stack.push(30);
        stack.push(50);
        stack.push(40);
        System.out.println("=======================");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("========================");
    }
}
