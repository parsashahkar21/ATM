import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;



public class inventoryannouncement{   

	JFrame f=new JFrame();
	JLabel l1;


	public inventoryannouncement(int l){

		l1=new JLabel(l == 0? "هیچی پول نداری بدبخت" : "you have no money loser");  

		l1.setBounds(150, 70, 200, 20);
		
		
		f.add(l1);
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);  
	}

	

}  
