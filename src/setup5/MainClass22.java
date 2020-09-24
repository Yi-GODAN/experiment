package setup5;

public class MainClass22 {

    //泛型
    public static <E> void printArray(E[] inputArray) {
        //输出
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.println("输出整型数组：");
        printArray(integerArray);
        System.out.println("\n输出双精度浮点型数组：");
        printArray(doubleArray);
        System.out.println("\n输出字符型数组：");
        printArray(characterArray);
    }
}
