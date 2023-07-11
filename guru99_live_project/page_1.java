package guru99_live_project;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class page_1 {

	public static void main(String[] args) {

		JFrame f = new JFrame("");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 * //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 * //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		 * frame.setSize(300, 300); JButton button1 = new JButton("Press");
		 * frame.getContentPane().add(button1); frame.setVisible(true);
		 * 
		 * JFrame f=new JFrame("Button Example");
		 */
		JLabel l1, l2;
		l1 = new JLabel("Que1:Which one among these is not a datatype");
		l1.setBounds(50, 50, 1000, 30);
		f.add(l1);
		
		//l2 = new JLabel("Second Label.");
		//l2.setBounds(50, 100, 100, 30);
		//f.add(l2);
		/*
		 * f.setSize(300, 300); f.setLayout(null); f.setVisible(true);
		 */
		JRadioButton r1=new JRadioButton("int");    
		JRadioButton r2=new JRadioButton("Float");
		JRadioButton r3=new JRadioButton("boolen");    
		JRadioButton r4=new JRadioButton("chat");
		r1.setBounds(75,100,100,30);    
		r2.setBounds(75,130,100,30);    
		r3.setBounds(75,160,100,30);    
		r4.setBounds(75,190,100,30); 
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);    
		f.add(r1);f.add(r2);f.add(r3);f.add(r4);  
		
		JButton b = new JButton("Next");
		b.setBounds(300, 330, 95, 30);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
