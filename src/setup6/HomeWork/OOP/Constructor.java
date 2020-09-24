package setup6.HomeWork.OOP;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/05 20:10
 */
public class Constructor {

    private int ID;
    private String password;
    private String email;

    public Constructor (int ID, String password, String email) {
        this.ID = ID;
        this.password = password;
        this.email = email;
    }

    public Constructor(int ID, String password) {
        this.ID = ID;
        this.password = password;
        this.email = ID + password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
