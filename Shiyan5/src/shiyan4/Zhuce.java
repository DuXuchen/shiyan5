package shiyan4;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class Zhuce extends JFrame implements ActionListener{
	JButton b1 = new JButton("学生注册");
	JButton b2 = new JButton("打印学生选课信息");
	public Zhuce(){
		//设置顶层窗体
		JFrame win = new JFrame("学生选课系统");
		win.setSize(300,400);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setLayout(new FlowLayout());
		//设置按钮及其点击事件
		win.add(b1);
		win.add(b2);
		validate();
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
	    JFrame fram1 = new JFrame("学生注册");
	    JPanel p1 = new JPanel();
	    fram1.add(p1);
	    p1.setLayout(new FlowLayout());
	    fram1.setSize(300,280);
	    fram1.setVisible(true);
	    //设置学生注册界面
	    JLabel l1 = new JLabel("姓名：       ");
	    p1.add(l1);
	    JTextField tf1 = new JTextField(20);
	    p1.add(tf1);
	    JLabel l2 = new JLabel("学号：       ");
	    p1.add(l2);
	    JTextField tf2 = new JTextField(20);
	    p1.add(tf2);
	    JLabel l3 = new JLabel("所选科目：");
	    p1.add(l3);
	    //设置所选科目复选框
	    JCheckBox cb1 = new JCheckBox("高等数学");
	    JCheckBox cb2 = new JCheckBox("大学物理");
	    JCheckBox cb3 = new JCheckBox("计算机导论");
	    JCheckBox cb4 = new JCheckBox("生命科学导论");
	    JCheckBox cb5 = new JCheckBox("马克思主义原理");
	    p1.add(cb1);
	    p1.add(cb2);
	    p1.add(cb3);
	    p1.add(cb4);
	    p1.add(cb5);
	    //设置注册按钮
	    JButton bu2 = new JButton("注册");
	    p1.add(bu2);
	    bu2.addActionListener(ZhuceListener);
	}
}
