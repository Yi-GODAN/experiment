package setup5;

public class testArray {
    public static void main(String[] args) {
        double[] mylist = {1.9, 2.0, 2.1, 2.2};
        double[] mylist2 = {1.9, 2.9, 3.0, 4.1};
        double total = 0;
        double max = 0;

        //打印所有元素
        for (int i = 0; i < mylist.length; i++) {
            System.out.println(mylist[i]);
        }

        //计算所有元素和
        for (int i = 0; i < mylist.length; i++) {
            total += mylist[i];
        }
        System.out.println("Total is :" + total);

        //查找最大元素
        for (int i = 0; i < mylist.length; i++) {
            if (mylist[i] > max) max = mylist[i];
        }
        System.out.println("max is :" + max);

        //打印所有元素 for-each
        for (double element : mylist2) {
            System.out.println(element);
        }
    }
}
