package setup5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplaceEmp {

    public static void main(String[] args) {
        String str = "Hello World";

        //区分大小写
        System.out.println(str.replace('H', 'w'));
        System.out.println(str.replaceFirst("He", "Wa"));
        System.out.println(str.replaceAll("He", "Ha"));

        //用正则表达式替换字符串中指定字符
        String regex = "[abcdH]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str); //替换a、b、c、d、H字符为空，即删除这几个字母
        regex = matcher.replaceAll("").trim();

        System.out.println(regex);
    }
}
