package ѧ��ѡ��ϵͳ;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ѧ��ѡ��ϵͳ.Choosing_courses.MyListener;

public class courses1 extends JFrame{
	JButton drop_class;
	JLabel course1,course2,course3;
	JPanel jp1,jp2,jp3,jp4;
	Teacher t1,t2,t3;
	JButton drop;
	 final Container c = getContentPane();
		
		void init() {
			drop.addActionListener(new MyListener());
		}
		
	public courses1() {

		JFrame jf = new JFrame("�α�");
		jf.setSize(1000,500);
		jf.setVisible(true);
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		
		t1 = new Teacher(1,"�Գ�","��","����","��101","8:00am--10:00am",5);
		t2 = new Teacher(2,"Ǯ���","��","Java","��101","10:20am--12:20am",3);
		t3 = new Teacher(3,"������","Ů","Ӣ��","��102","2:00pm--4:00pm",2);
		
		jp1 = new JPanel();
		course1 = new JLabel(t1.toString());
		contentPane.add(course1);
		jp2 = new JPanel();
		course2 = new JLabel(t2.toString());
		contentPane.add(course2);
		jp3 = new JPanel();
		course3 = new JLabel(t3.toString());
		contentPane.add(course3);
		
		jp4 = new JPanel();
		drop = new JButton("�˿�");
		contentPane.add(drop);
	}
	
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			new Drop();//���˿�ϵͳ����
		}
	}
	public static void main(String[] args) {
		courses1  courses1 = new courses1();
		new courses1().init();
	}

}
