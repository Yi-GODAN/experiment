package setup4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

class TxtPad implements ActionListener {
    JFrame frame;
    JMenuBar bar;
    JMenu mFile;
    ImageIcon imageFile, imageNew, imageOpean, imageSave, imageClose;
    JMenuItem itemNew, itemOpean, itemSave, itemClose;
    JTextArea ta;
    JScrollPane sp;

    public TxtPad() {
        frame = new JFrame("记事本");

        imageFile = new ImageIcon("D:" + File.separator + "java" + File.separator + "图标" + File.separator + "file.png");
        imageNew = new ImageIcon("D:" + File.separator + "java" + File.separator + "图标" + File.separator + "new.png");
        imageOpean = new ImageIcon("D:" + File.separator + "java" + File.separator + "图标" + File.separator + "opean" +
                ".png");
        imageSave = new ImageIcon("D:" + File.separator + "java" + File.separator + "图标" + File.separator + "save.png");
        imageClose = new ImageIcon("D:" + File.separator + "java" + File.separator + "图标" + File.separator + "close" +
                ".png");
        ta = new JTextArea();

        sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        bar = new JMenuBar();
        mFile = new JMenu("文件");
        itemNew = new JMenuItem("新建", imageNew);
        itemOpean = new JMenuItem("打开", imageOpean);
        itemSave = new JMenuItem("保存", imageSave);
        itemClose = new JMenuItem("关闭", imageClose);

        itemNew.setMnemonic('N');
        itemNew.setAccelerator(KeyStroke.getKeyStroke('N'));
        itemOpean.setMnemonic('O');
        itemOpean.setAccelerator(KeyStroke.getKeyStroke('O'));
        itemSave.setMnemonic('S');
        itemSave.setAccelerator(KeyStroke.getKeyStroke('S'));
        itemClose.setMnemonic('C');
        itemClose.setAccelerator(KeyStroke.getKeyStroke('C'));


        mFile.setIcon(imageFile);
        mFile.add(itemNew);
        mFile.add(itemOpean);
        mFile.add(itemSave);
        mFile.addSeparator();
        mFile.add(itemClose);

        itemNew.addActionListener(this);
        itemOpean.addActionListener(this);
        itemSave.addActionListener(this);
        itemClose.addActionListener(this);

        bar.add(mFile);
        frame.setJMenuBar(bar);
        frame.add(sp);
        frame.setSize(900, 600);
        frame.setLocation(500, 300);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        //instanceof 运算符是用来在运行时指出对象是否是特定类的一个实例。instanceof通过返回一个布尔值来指出，这个对象是否是这个特定类或者是它的子类的一个实例。
        if (event.getSource() instanceof JMenuItem) {
            JMenuItem menuitem = (JMenuItem) event.getSource();
            if (menuitem == itemNew) {
                new TxtPad();
            } else if (menuitem == itemClose) {
                System.exit(1);
            } else if (menuitem == itemOpean) {
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File file = chooser.getSelectedFile();

                try {
                    FileReader reader = new FileReader(file);
                    char[] c = new char[(int) file.length()];
                    reader.read(c);
                    ta.setText(new String(c));
                    reader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (menuitem == itemSave) {
                JFileChooser chooser = new JFileChooser();
                chooser.showSaveDialog(null);
                File file = chooser.getSelectedFile();

                try {
                    FileWriter writer = new FileWriter(file);
                    char[] c = new char[ta.getText().length()];
                    c = ta.getText().toCharArray();
                    writer.write(c);
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
