package setup5;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class MySQLDemo {

    //MySQL 8.0 以上版本 -JDBC 驱动名暨数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_test?useSSL=false&serverTimezone=UTC";

    //数据库的用户名和密码
    static final String USER = "YiMing";
    static final String PASSWORD = "YiMing";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);

            //打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            //执行插入
            stmt = conn.createStatement();
            String insert_sql;
            insert_sql = "INSERT INTO `db_test`.`websites` (`id`, `name`, `url`, `alexa`, `country`) VALUES ('6', " +
                    "'百度', 'https://www.baidu.com/', '1', 'CN');";
            stmt.executeUpdate(insert_sql);

            //执行查询
            System.out.println("实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, name, url FROM websites";
            ResultSet rs = stmt.executeQuery(sql);

            //展开结果集数数据库
            while (rs.next()) {
                //通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");

                //输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点URL: " + url);
                System.out.print("\n");
            }
            //完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //处理JDBC错误
            se.printStackTrace();
        } catch (Exception e) {
            //处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
                //不做处理
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye");
    }
}
