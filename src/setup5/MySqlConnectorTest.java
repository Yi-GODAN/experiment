package setup5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlConnectorTest {

    public static void main(String[] args) throws Exception {
        //加载数据访问驱动
        Class.forName("com.mysql.jdbc.Driver");
        //连接到数据库
        String url = "jdbc:mysql://localhost:3306/db_test?characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
        String user = "YiMing";
        String passwd = "YiMing";
        Connection conn = DriverManager.getConnection(url, user, passwd);
        //构建sql命令
        Statement state = conn.createStatement();
        String s = "insert into tb_emp2 values(007, 'YiMing', 23, 'boy')";
        state.executeUpdate(s);
    }
}
