package ѧ��ѡ��ϵͳ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jdk.internal.platform.Container;
import ѧ��ѡ��ϵͳ.login.MyListener;

public class Finish extends JFrame {
	JLabel jl;
	JLabel course1,course2,course3;
	JButton drop;
	JPanel jp1,jp2,jp3;
	
	public Finish (){	
		
		JFrame jf = new JFrame("���տγ̣�");
		jf.setSize(1000,500);
		jf.setVisible(true);
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		
	    Teacher t2,t3;
		//t2 = new Teacher(2,"Ǯ���","��","Java","��101","10:20am--12:20am",3);
		//t3 = new Teacher(3,"������","Ů","Ӣ��","��102","2:00pm--4:00pm",2);
	    t2 = new Teacher(2,"����","��","Java","��101","10:20am--12:20am",3);
	    t3 = new Teacher(3,"����","Ů","Ӣ��","��102","2:00pm--4:00pm",2);
		jp1 = new JPanel();
		jl = new JLabel("���տγ̣�");
		jp1.add(jl);
		contentPane.add(jl);

		jp2 = new JPanel();
		course2 = new JLabel(t2.toString());
		contentPane.add(course2);
		jp3 = new JPanel();
		course3 = new JLabel(t3.toString());
		contentPane.add(course3);
		
	}

	
	public static void main(String[]args) {
		Finish f = new Finish();
	}
}
