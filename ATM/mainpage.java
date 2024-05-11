import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class mainpage implements ActionListener{ 

	JFrame f=new JFrame();
          
	JButton p=new JButton("فارسی");
	JButton e=new JButton("English");

	
	public mainpage(){
		p.setBounds(200,100,100, 40);
		e.setBounds(50,100,100, 40);

		 p.addActionListener(this); 
		 e.addActionListener(this);  
		
		f.add(p);
		f.add(e);
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);  
	}

	@Override
    public void actionPerformed(ActionEvent e){	
        if(e.getSource() == p){
            new passwordpage(0);
        }
		else{
        	new passwordpage(1);
		}
	}

}  
