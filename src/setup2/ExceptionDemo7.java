package setup2;

public class ExceptionDemo7 {

    public static void main(String[] args) {
        int n = 20;
        int result = 0;
        try {
            result = n / 0;
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch arithmetic exception: " + e);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException e1) {
                System.out.println("Manually throw chain exception： " + e1);
            }
        }
    }
}
