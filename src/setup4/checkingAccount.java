package setup4;

import setup5.InsufficientfundsException;

import java.io.*;

//此类模拟银行账户
public class checkingAccount {
    //balance为余额，number为账号
    private double balance;
    private int number;

    //定义构造方法
    public checkingAccount(int number) {
        this.number = number;
    }

    //方法：存钱
    public void deposit(double amount) {
        balance += amount;
    }

    //方法：取钱
    public void withdraw(double amount) throws InsufficientfundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientfundsException(needs);
        }
    }

    //方法：返回余额
    public double getBalance(double balance) {
        return balance;
    }

    //方法：返回卡号
    public int getNumber(int number) {
        return number;
    }
}
