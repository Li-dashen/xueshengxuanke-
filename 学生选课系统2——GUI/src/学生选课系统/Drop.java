package ѧ��ѡ��ϵͳ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jdk.internal.platform.Container;
import ѧ��ѡ��ϵͳ.login.MyListener;

public class Drop extends JFrame {
	JRadioButton jr1,jr2,jr3;
	ButtonGroup bg1,bg2,bg3,bg4;
	JLabel jl;
	JButton drop;
	JPanel jp1;
	
	public Drop (){	
		
		JFrame jf = new JFrame("�˿�");
		jf.setSize(1000,500);
		jf.setVisible(true);
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		
	    Teacher t1,t2,t3;
	    t1 = new Teacher(1,"����","��","����","��101","8:00am--10:00am",5);
	    t2 = new Teacher(2,"����","��","Java","��101","10:20am--12:20am",3);
	    t3 = new Teacher(3,"����","Ů","Ӣ��","��102","2:00pm--4:00pm",2);
		//t1 = new Teacher(1,"�Գ�","��","����","��101","8:00am--10:00am",5);
		//t2 = new Teacher(2,"Ǯ���","��","Java","��101","10:20am--12:20am",3);
		//t3 = new Teacher(3,"������","Ů","Ӣ��","��102","2:00pm--4:00pm",2);
		
		jp1 = new JPanel();
		jl = new JLabel("���˿Σ�ֻ������һ�ſΣ���");
		jp1.add(jl);
		contentPane.add(jl);

		jr1 = new JRadioButton(t1.toString());
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
		drop = new JButton("�˿�");
		bg4 = new ButtonGroup();
		bg4.add(drop);
		contentPane.add(drop);
		
		drop.addActionListener(new ActionListener() {     //����ȷ����ť��JButton���Ͱ�ť
			public void actionPerformed(ActionEvent e) {   
				if(jr1.isSelected()) {               //����button3��ť��jr1���Ͱ�ť
					new Finish();                         //��תҳ��
				}
			}
	});
		/*
		 * ����ͬ��
		 */
		drop.addActionListener(new ActionListener() {    
			public void actionPerformed(ActionEvent e) {   
				if(jr2.isSelected()) {               
					new Finish1();                         
				}
			}
	});
		drop.addActionListener(new ActionListener() {     
			public void actionPerformed(ActionEvent e) {   
				if(jr3.isSelected()) {               
					new Finish2();                        
				}
			}
	});
	}

	
	
	public static void main(String[]args) {
		Drop d = new Drop();
	}
}
