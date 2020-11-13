package ink.laoliang;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private static Main jFrame;

    public Main() {

        super("SelectorTest");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 640);
        setLocationRelativeTo(null);
        setVisible(true);

        // 设置窗体布局
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
        add(panel);

        // 按钮
        JButton button = new JButton("按钮");
        panel.add(button);

        // 单行文本框
        JTextField textField = new JTextField(28);
        panel.add(textField);

        // 文本域
        JTextArea textArea = new JTextArea(3, 10);
        textArea.setLineWrap(true);
        JScrollPane scrollPaneForTextArea = new JScrollPane(textArea);
        panel.add(scrollPaneForTextArea);

        // 复选框
        JCheckBox checkBox1 = new JCheckBox("C#");
        JCheckBox checkBox2 = new JCheckBox("Java");
        panel.add(checkBox1);
        panel.add(checkBox2);

        // 单选按钮
        JRadioButton radioButton1 = new JRadioButton("yes");
        JRadioButton radioButton2 = new JRadioButton("no");
        panel.add(radioButton1);
        panel.add(radioButton2);

        // 下拉列表
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("--请选择--");
        comboBox.addItem("C#");
        comboBox.addItem("Java");
        comboBox.addItem("Python");
        panel.add(comboBox);

        // 列表框
        String[] items = new String[]{"C#", "Java", "Python"};
        JList list = new JList(items);
        panel.add(list);

        // 滑块
        JSlider slider = new JSlider(0, 100);
        panel.add(slider);

        // 进度条
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(20);
        panel.add(progressBar);

        // 表格
        JTable table = new JTable(5, 6);
        JScrollPane scrollPaneForTable = new JScrollPane(table);
        panel.add(scrollPaneForTable);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> jFrame = new Main());
    }
}
