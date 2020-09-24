package setup6.io;

import java.io.Serializable;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/26 21:12
 */
public class Person implements Serializable {

    /**
     * 如果需要将对象通过IO流进行传输，那么必须要实现序列化接口
     * 当前类中必须声明一个serialVersionUID的值。
     * transient：使用此关键字修饰的变量，在进行序列化时，不会被序列化
     */
    private int id;
    private String name;
    transient private String pwd;

    public Person() {}

    public Person(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
