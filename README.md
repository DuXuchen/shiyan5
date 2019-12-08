# shiyan5
班级：计181 姓名：杜栩辰 学号：2018310755
实验目的
建立一个学生选课系统，利用GUI窗体及其组件设计窗体界面，完成学生选课过程业务逻辑编程，并基于文件保存并读取数据
实验要求
1. 定义每种角色人员的属性，及其操作方法。
属性示例：	人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
			学生（编号、姓名、性别、所选课程、……）
			课程（编号、课程名称、上课地点、时间、授课教师、……）
2. 设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
3. 基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
4. 针对操作过程中可能会出现的各种异常，做异常处理
5. 基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
实验内容
1. 建立包含每种角色属性的相关类，例如如下的课程类
public class Course {
	String coursename;
	String address;
	String time;
	int id;
	int score;
2. 设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
public static void main(String[] args) {
		JFrame win = new JFrame("选课系统");
		win.setSize(300,500);
		win.setVisible(true);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		win.add(p1);
		Label l1 = new Label("选课信息：");
		p1.add(l1);
		
		JCheckBox box1 = new JCheckBox("电路与模拟电子技术");
        JCheckBox box2 = new JCheckBox("高等数学");
        JCheckBox box3 = new JCheckBox("大学物理");
        JCheckBox box4 = new JCheckBox("马克思主义原理");
        p1.add(box1);
        p1.add(box2);
        p1.add(box3);
        p1.add(box4);
		
		Label l2 = new Label("添加课程：");
		p1.add(l2);
		Label l3 = new Label("课程名称");
		p1.add(l3);
		JTextField text1 = new JTextField(20);
		p1.add(text1);
3. 基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
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
4. 针对操作过程中可能会出现的各种异常，做异常处理。
public void actionPerformed(ActionEvent e) {
		File f = new File("D:/jtest/","a.txt");
		try {
			r_file = new FileReader(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		buf_reader = new BufferedReader(r_file);  
	}
5. 基于输入/输出编程，支持学生、课程、教师等数据的读写操作。与字节输入和输出流一样，Reader和Writer只是建立一条通往字符文件的通道，而
要实现对字符数据的读写操作，还需要读方法和写方法来完成。
public void actionPerformed(ActionEvent e) {
		File f = new File("D:/jtest/","a.txt");
		try {
			r_file = new FileReader(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		buf_reader = new BufferedReader(r_file);  
	}
	public void writeFile() {
		try {
			w_file = new FileWriter("b.txt");
			buf_writer = new BufferedWriter(w_file);
			String str = txt.getText();
			buf_writer.write(str,0,str.length());
			buf_writer.flush();
		}
		catch(IOException ew) {System.out.println(ew);}
	}
实验心得
通过本次实验，我进一步学习到了文件的输入流和输出流，学习的IO包中的一些基本类和基本方法。理解了IO包中由File提供的描述文件和目录的操作与管理方法。
输入和输出是计算机的基本操作，也是程序设计语言的一项重要的基本功能，我会在进一步巩固加深对这方面的理解。

