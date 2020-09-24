package setup5;

public class MainClass8 {

    public static void main(String[] args) {
        String[] name = new String[]{"A", "B", "C"};
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(name, 0, extended, 0, name.length);
        for (String str : extended) {
            System.out.println(str);
        }
    }
}
