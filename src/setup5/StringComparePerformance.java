package setup5;

public class StringComparePerformance {

    public static void main(String[] arg) {
        String[] variables = new String[50000];

        long startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) variables[i] = "hello";
        long endTime = System.nanoTime();
        System.out.println("使用自变量赋值字符串，花费时间: " + (endTime - startTime) + "纳秒");

        String[] variables2 = new String[50000];

        long startTime2 = System.nanoTime();
        for (int i = 0; i < 50000; i++) variables2[i] = new String("hello");
        long endTime2 = System.nanoTime();
        System.out.println("使用对象赋值字符串，花费时间: " + (endTime2 - startTime2) + "纳秒");

        String[] variables3 = new String[50000];

        long startTime3 = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            variables3[i] = new String("hello");
            variables3[i] = variables3[i].intern();
        }
        long endTime3 = System.nanoTime();
        System.out.println("使用字符串对象 intern 方法赋值字符串: " + (endTime3 - startTime3) + "纳秒");
    }
}
