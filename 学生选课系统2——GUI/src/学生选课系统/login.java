package 学生选课系统;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
	JPanel jp1,jp2,jp3;  //定义
	JButton Login;
	JLabel user,Id;    //定义标签
	JTextField jtf1,jtf2;//定义文本框
	final Container c = getContentPane();//定义组件，并且为添加组件时使用
	
	void init() {
		Login.addActionListener(new MyListener());
	}//在init方法中为登录按钮注册动作事件监听器
	
	public login() {
		this.setTitle("学生管理系统");
		this.setSize(500, 500);
		this.setVisible(true);
		
		jp1 = new JPanel();
		user = new JLabel("用户名：");
		jtf1 = new JTextField(15);
		   jp1.add(user);
		   jp1.add(jtf1);
		   
		jp2 = new JPanel();
	    Id = new JLabel("学号：");
		jtf2 = new JTextField(15);
		 jp2.add(Id);
	     jp2.add(jtf2);
	     
	   jp3 = new JPanel();
	   Login = new JButton("登录");
	   jp3.add(Login);
	   
	   c.setLayout(new GridLayout(5,1,10,10));
	   c.add(new JPanel());   
	   c.add(jp1);
	   c.add(jp2);
	   c.add(jp3);
	   c.add(new JPanel());
	}
	/*
	 * 用于监听按钮登录
	 */
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String s1 = jtf1.getText();
			String s2 = jtf2.getText();
			if(s1.equals("李易安")&&s2.equals("7")) {
				new Choosing_courses();//显示选课界面
			} else {
				JOptionPane.showMessageDialog(null, "用户名或学号错误，请重新输入");
			}
		}
	}
	public static void main(String[] args) {
		login  lg = new login();
		new login().init();
	}
}

