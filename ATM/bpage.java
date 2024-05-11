import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class bpage implements ActionListener{ 

	JFrame f=new JFrame();

	int lf;
          
	JPanel buttonsPanel = new JPanel(new GridLayout(0, 1));
	JButton b1;
	JButton b2; 
	JButton b3;
	JButton b4;


	public bpage(int l){
		this.lf = l;
		b1 = new JButton(l == 0? "برداشت وجه" : "Cash withdrawal");
		b2 = new JButton(l == 0? "تغییر رمز" : "Change password");
		b3 = new JButton(l == 0? "کارت به کارت" : "Card by card");
		b4 = new JButton(l == 0? "اعلام موجودی" : "Inventory announcement");



		buttonsPanel.setBounds(0,0,400, 300);
		//e.setBounds(50,100,100, 40);

		b1.addActionListener(this); 
		b2.addActionListener(this);
		b3.addActionListener(this); 
		b4.addActionListener(this);

		buttonsPanel.add(this.b1);
        buttonsPanel.add(this.b2);
        buttonsPanel.add(this.b3);
        buttonsPanel.add(this.b4);
		
		f.add(buttonsPanel);
		f.setSize(400,350);
		f.setLayout(null);
		f.setVisible(true);  
	}


	@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            new cashwithdrawal(lf);
        }
		else if(e.getSource() == b2){
        	new changepasswordpage(lf);
		}
		else if(e.getSource() == b3){
			new cardbycard(lf);
		}
		else{
			new inventoryannouncement(lf);
		}
	}

}  

