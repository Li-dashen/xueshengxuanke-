package 学生选课系统;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jdk.internal.platform.Container;
import 学生选课系统.login.MyListener;

public class Finish2 extends JFrame {
	JLabel jl;
	JLabel course1,course2,course3;
	JButton drop;
	JPanel jp1,jp2,jp3;
	
	public Finish2 (){	
		
		JFrame jf = new JFrame("最终课程：");
		jf.setSize(1000,500);
		jf.setVisible(true);
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		
	    Teacher t1,t2;
		
	    t1 = new Teacher(1,"赵筹","男","高数","教101","8:00am--10:00am",5);
		t2 = new Teacher(2,"钱多多","男","Java","机101","10:20am--12:20am",3);
		
		jp1 = new JPanel();
		jl = new JLabel("最终课程：");
		jp1.add(jl);
		contentPane.add(jl);

		jp2 = new JPanel();
		course2 = new JLabel(t1.toString());
		contentPane.add(course2);
		jp3 = new JPanel();
		course3 = new JLabel(t2.toString());
		contentPane.add(course3);
		
	}

	
	public static void main(String[]args) {
		Finish2 f = new Finish2();
	}
}
