package ѧ��ѡ��ϵͳ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jdk.internal.platform.Container;
import ѧ��ѡ��ϵͳ.login.MyListener;

public class Choosing_courses extends JFrame {
	JRadioButton jr1,jr2,jr3;
	ButtonGroup bg1,bg2,bg3,bg4;
	JLabel jl;
	JButton sure;
	JPanel jp1;
	
	void init() {
		sure.addActionListener(new MyListener());
	}//��init������Ϊȷ����ťע�ᶯ���¼�������
	
	public Choosing_courses (){	
		
		JFrame jf = new JFrame("ѧ��ѡ��");
		jf.setSize(1000,500);
		jf.setVisible(true);
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		
	    Teacher t1,t2,t3;
		//t1 = new Teacher(1,"�Գ�","��","����","��101","8:00am--10:00am",5);
		t1 = new Teacher(1,"����","��","����","��101","8:00am--10:00am",5);
		//t2 = new Teacher(2,"Ǯ���","��","Java","��101","10:20am--12:20am",3);
		t2 = new Teacher(2,"����","��","Java","��101","10:20am--12:20am",3);
		//t3 = new Teacher(3,"������","Ů","Ӣ��","��102","2:00pm--4:00pm",2);
		t3 = new Teacher(3,"����","Ů","Ӣ��","��102","2:00pm--4:00pm",2);
		jp1 = new JPanel();//��ӱ�ǩ
		jl = new JLabel("��ѡ�Σ�");
		jp1.add(jl);
		contentPane.add(jl);

		jr1 = new JRadioButton(t1.toString());//��ʾ��ѡ��ť����
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
		sure = new JButton("ȷ��");
		bg4 = new ButtonGroup();
		bg4.add(sure);
		contentPane.add(sure);
		
	}
/*
 * ��ȷ����ť���м�������������Ӧ����ѡ�κ�Ľ���
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
