import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;



public class cashwithdrawal implements ActionListener{   

	JFrame f=new JFrame();
	private int pass = 1234;
    int lf;
	JButton p;
	JTextArea area;
	JLabel l1;


	public cashwithdrawal(int l){
		this.lf = l;
		area = new JTextArea();
		l1=new JLabel(l == 0? "وجه مورد نظر را وارد کنید" : "Enter cash value");  
		p = new JButton(l == 0? "ثبت" : "Enter");

		area.setBounds(150,30, 100,20);  
		l1.setBounds(150, 70, 200, 20);
		p.setBounds(150,200,100, 40);
		
		p.addActionListener(this);  
		
		f.add(p);
		f.add(area);
		f.add(l1);
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);  
	}

	@Override
    public void actionPerformed(ActionEvent e){
		new success(lf);	
	}

	

}  

