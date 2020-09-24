package setup4;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Windows implements ActionListener {

    public Windows() {
        //定义
        JFrame frame;
        JPanel panel;
        JLabel luser, lpsw, lresult;
        JButton bLogin, bQuit;
        JTextField TxtUser;
        JPasswordField TxtPsw;
        Point point;

        //实例化
        frame = new JFrame("登陆");
        luser = new JLabel("卡号");
        lpsw = new JLabel("密码");
        lresult = new JLabel("登录状态：。。。");
        bLogin = new JButton("登陆");
        bQuit = new JButton("退出");
        TxtUser = new JTextField();
        TxtPsw = new JPasswordField();
        panel = new JPanel();
        point = new Point();

        //创建
        frame.setLayout(null);

        luser.setBounds(5, 5, 60, 20);
        lpsw.setBounds(5, 30, 60, 20);
        TxtUser.setBounds(80, 5, 100, 20);
        TxtPsw.setBounds(80, 30, 100, 20);
        bLogin.setBounds(40, 60, 60, 20);
        bQuit.setBounds(110, 60, 60, 20);
        lresult.setBounds(5, 100, 300, 20);

        frame.add(luser);
        frame.add(lpsw);
        frame.add(lresult);
        frame.add(bLogin);
        frame.add(bQuit);
        frame.add(TxtUser);
        frame.add(TxtPsw);
        frame.add(panel);

        bLogin.addActionListener(this);
        bQuit.addActionListener(this);

        point.setLocation(800, 400);
        frame.setLocation(point);
        frame.setSize(220, 180);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {


    }

}
