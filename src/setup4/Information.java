package setup4;

import java.util.Scanner;

public class Information {
    //封装
    private long CardNum = 62250028;
    private int Password = 123456;
    private long Money = 10000;

    //功能
    public void Login() {
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        System.out.println("------------登陆界面--------------");
        System.out.print("请输入账号：");
        int n = console.nextInt();
        System.out.print("请输入密码：");
        int m = console.nextInt();
        if (n == getCardNum() && m == getPassword()) {
            Frame();
        } else {
            System.out.println("输入错误，是否重新输入？1.是 \t2.否 \t");
            int i = console.nextInt();
            switch (i) {
                case 1:
                    Login();
                    break;
                case 2:
                    Exit();
                    break;
            }
        }
    }

    public void Query() {
        System.out.println("余额：" + getMoney());
    }

    public void Deposit() {
        System.out.println("请输入存入金额：");
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if (n >= 100 && n <= 5000 && n % 100 == 0) {
            setMoney(getMoney() + n);
            System.out.println("存款成功！");
        } else {
            System.out.println("现金输入错误,是否重新输入？1.是 \t2.否 \t");
            int i = console.nextInt();
            switch (i) {
                case 1:
                    Deposit();
                    break;
                case 2:
                    Frame();
                    break;
            }
        }
    }

    public void Withdrawl() {
        System.out.println("请输入取款金额：");
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if (n <= Money && n > 100 && n % 100 == 0) {
            setMoney(getMoney() - n);
            System.out.println("取款成功！");
        } else {
            System.out.println("取款失败,是否重新输入？1.是 \t2.否 \t");
            int i = console.nextInt();
            switch (i) {
                case 1:
                    Withdrawl();
                    break;
                case 2:
                    Frame();
                    break;
            }
        }
    }

    public void ChangePassword() {
        System.out.println("请输入密码：");
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if (n == this.Password) {
            System.out.println("请输入新密码：");
            int m = console.nextInt();
            System.out.println("请确认新密码：");
            int i = console.nextInt();
            if (m == i && m >= 100000 && m != this.Password) {
                setPassword(m);
                System.out.println("密码修改成功！");
            } else {
                System.out.println("新密码不一致或修改的密码与原密码一致,是否重新输入？1.是 \t2.否 \t");
                switch (i) {
                    case 1:
                        ChangePassword();
                        break;
                    case 2:
                        Frame();
                        break;
                }
            }
        } else {
            System.out.println("密码输入错误！请重新输入");
            ChangePassword();
        }
    }

    public void Exit() {
        System.exit(0);
    }

    //界面
    public void Frame() {
        while (true) {
            @SuppressWarnings("resource")
            Scanner console = new Scanner(System.in);
            System.out.println("\n-------------------------------");
            System.out.println("1.存款\n2.取款\n3.更改密码\n4.查询\n5.退出");
            int n = console.nextInt();
            switch (n) {
                case 1:
                    Deposit();
                    break;
                case 2:
                    Withdrawl();
                    break;
                case 3:
                    ChangePassword();
                    break;
                case 4:
                    Query();
                    break;
                case 5:
                    Exit();
                    break;
                default:
                    System.out.println("输入错误！");
                    Frame();
                    break;
            }
        }
    }

    //set get 方法
    public long getCardNum() {
        return CardNum;
    }

    public void setCardNum(int cardNum) {
        CardNum = cardNum;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public long getMoney() {
        return Money;
    }

    public void setMoney(long money) {
        Money = money;
    }

}
