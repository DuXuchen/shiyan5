package shiyan4;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class Zhuce extends JFrame implements ActionListener{
	JButton b1 = new JButton("ѧ��ע��");
	JButton b2 = new JButton("��ӡѧ��ѡ����Ϣ");
	public Zhuce(){
		//���ö��㴰��
		JFrame win = new JFrame("ѧ��ѡ��ϵͳ");
		win.setSize(300,400);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setLayout(new FlowLayout());
		//���ð�ť�������¼�
		win.add(b1);
		win.add(b2);
		validate();
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
	    JFrame fram1 = new JFrame("ѧ��ע��");
	    JPanel p1 = new JPanel();
	    fram1.add(p1);
	    p1.setLayout(new FlowLayout());
	    fram1.setSize(300,280);
	    fram1.setVisible(true);
	    //����ѧ��ע�����
	    JLabel l1 = new JLabel("������       ");
	    p1.add(l1);
	    JTextField tf1 = new JTextField(20);
	    p1.add(tf1);
	    JLabel l2 = new JLabel("ѧ�ţ�       ");
	    p1.add(l2);
	    JTextField tf2 = new JTextField(20);
	    p1.add(tf2);
	    JLabel l3 = new JLabel("��ѡ��Ŀ��");
	    p1.add(l3);
	    //������ѡ��Ŀ��ѡ��
	    JCheckBox cb1 = new JCheckBox("�ߵ���ѧ");
	    JCheckBox cb2 = new JCheckBox("��ѧ����");
	    JCheckBox cb3 = new JCheckBox("���������");
	    JCheckBox cb4 = new JCheckBox("������ѧ����");
	    JCheckBox cb5 = new JCheckBox("���˼����ԭ��");
	    p1.add(cb1);
	    p1.add(cb2);
	    p1.add(cb3);
	    p1.add(cb4);
	    p1.add(cb5);
	    //����ע�ᰴť
	    JButton bu2 = new JButton("ע��");
	    p1.add(bu2);
	    bu2.addActionListener(ZhuceListener);
	}
}
