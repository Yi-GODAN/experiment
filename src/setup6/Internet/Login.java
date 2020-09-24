package setup6.Internet;

import java.io.Serializable;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 16:40
 */
public class Login implements Serializable {

    private static final long serialVersionUID = -2585600241117880607L;
    private String userName;
    private String passWord;

    public Login() {}

    public Login(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
