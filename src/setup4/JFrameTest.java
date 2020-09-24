package setup4;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

public class JFrameTest {
    //由于Swing跟AWT有千丝万缕的联系，它既要支持AWT又要有自己新的体系，
    //所以呢，这个如果对于AWT中的Frame是可以直接通过setBackground来设置背景色，
    //但是对于JFrame则不可以，应该采用下面的方法：
    //JFrame frame = new JFrame();
    //frame.getContentPane().setBackground(Color.Red);
    public static void main(String[] args) {
        JFrame jframe = new JFrame("这是我的第一个窗口");
        Dimension d = new Dimension();
        JLabel l = new JLabel("哈哈哈哈哈", JLabel.CENTER);
        Font f = new Font("甲骨文", Font.ITALIC, 20);
        jframe.add(l);
        l.setFont(f);
        l.setForeground(Color.WHITE);
        Point p = new Point();
        d.setSize(500, 300);
        p.move(700, 300);
        jframe.setSize(d);
        jframe.setLocation(p);
        jframe.getContentPane().setBackground(Color.RED);
        jframe.setVisible(true);


    }
}
