package setup5;

import java.io.*;

//自定义异常类，继承Exception类
public class InsufficientfundsException extends Exception {
    //此处的amount用来存储当出现异常(取出的钱多余余额)
    private double amount;

    public InsufficientfundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
