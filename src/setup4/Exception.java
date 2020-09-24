package setup4;

public class Exception {
    public static void main(String[] args) {
        System.out.println("程序开始运行。。。");

        int x = 10, result = 0;

        try {
            int y = Integer.parseInt(args[0]);
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0。。。");
        } catch (NumberFormatException e) {
            System.out.println("数字格式异常。。。");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界异常。。。");
        } finally {
            System.out.println("finally一定会执行。。。");
        }


        System.out.println(result);

        System.out.println("程序正常结束。。。");
    }
}
