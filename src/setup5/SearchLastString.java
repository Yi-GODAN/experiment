package setup5;

public class SearchLastString {

    public static void main(String[] args) {
        String str = "Hello!! World！";
        int lastIndex = str.lastIndexOf("World");

        if (lastIndex == -1) {
            System.out.println("没有找到字符串World");
        } else {
            System.out.println("World字符串最后出现位置为: " + lastIndex);
        }
    }
}
