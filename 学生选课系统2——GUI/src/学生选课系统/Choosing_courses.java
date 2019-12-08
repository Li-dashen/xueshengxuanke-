package 学生选课系统;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jdk.internal.platform.Container;
import 学生选课系统.login.MyListener;

public class Choosing_courses extends JFrame {
	JRadioButton jr1,jr2,jr3;
	ButtonGroup bg1,bg2,bg3,bg4;
	JLabel jl;
	JButton sure;
	JPanel jp1;
	
	void init() {
		sure.addActionListener(new MyListener());
	}//在init方法中为确定按钮注册动作事件监听器
	
	public Choosing_courses (){	
		
		JFrame jf = new JFrame("学生选课");
		jf.setSize(1000,500);
		jf.setVisible(true);
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		
	    Teacher t1,t2,t3;
		//t1 = new Teacher(1,"赵筹","男","高数","教101","8:00am--10:00am",5);
		t1 = new Teacher(1,"张三","男","高数","教101","8:00am--10:00am",5);
		//t2 = new Teacher(2,"钱多多","男","Java","机101","10:20am--12:20am",3);
		t2 = new Teacher(2,"李四","男","Java","机101","10:20am--12:20am",3);
		//t3 = new Teacher(3,"孙悦悦","女","英语","教102","2:00pm--4:00pm",2);
		t3 = new Teacher(3,"王五","女","英语","教102","2:00pm--4:00pm",2);
		jp1 = new JPanel();//添加标签
		jl = new JLabel("请选课：");
		jp1.add(jl);
		contentPane.add(jl);

		jr1 = new JRadioButton(t1.toString());//显示单选按钮内容
		bg1 = new ButtonGroup();
		bg1.add(jr1);
		contentPane.add(jr1);
		jr2 = new JRadioButton(t2.toString());
		bg2 = new ButtonGroup();
		bg2.add(jr2);
		contentPane.add(jr2);
		jr3 = new JRadioButton(t3.toString());
		bg3 = new ButtonGroup();
		bg3.add(jr3);
		contentPane.add(jr3);
		
		jp1 = new JPanel();
		sure = new JButton("确定");
		bg4 = new ButtonGroup();
		bg4.add(sure);
		contentPane.add(sure);
		
	}
/*
 * 对确定按钮进行监听并且做出响应，打开选课后的界面
 */
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			new courses1();
		}
	}
	
	public static void main(String[]args) {
		Choosing_courses C_courses = new Choosing_courses();
		new Choosing_courses().init();
	}
}
