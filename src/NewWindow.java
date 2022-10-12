import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class NewWindow implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label;
	JTextField name = new JTextField();
	JTextField ID = new JTextField();
	JButton enter = new JButton("Enter");
	
	
	JPanel top = new JPanel();
	JPanel bottom = new JPanel();
	JPanel blend = new JPanel();
	JLabel upText = new JLabel("CUSTOMER");
	JLabel Name = new JLabel("CUSTOMER");
	JLabel id = new JLabel("  ID");
	
	
	
	JPanel topHalf = new JPanel();
	JPanel bottomHalf = new JPanel();

	
	JLabel upTextE = new JLabel("EMPLOYEE");
	JLabel user_name = new JLabel("user name");
	JLabel pswd = new JLabel("pswd");
	
	JTextField user_n = new JTextField();
	JTextField password = new JTextField();
	
	JButton order = new JButton("PREPARE ORDER");
	JButton bill =  new JButton("RETURN BILL");
	
	JButton next_order =  new JButton("NEXT ORDER");
	
	
	NewWindow(boolean flag){
		
		if(flag) {//customer beginning page
		
			
			top.setBackground(new Color(89, 165, 216));
			top.setBounds(0, 0, 500, 45);
			bottom.setBounds(0, 500, 500, 200);
			bottom.setBackground(new Color(204, 230, 244));
			blend.setBackground(new Color(0,0,0));
			blend.setBounds(0, 45, 500, 2);
			upText.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,20));
			
			topHalf.setBounds(0,200,500,300);
			bottomHalf.setBounds(0, 300, 500, 200);
			Name.setText("Name");
			Name.setLayout(null);
			//Name.setBounds(0, 50, 100,100);
			Name.setLocation(150,400);
			Name.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,20));
			Name.setSize(100, 100);
		
			//topHalf.setBackground(new Color(0,0,0));
			
			topHalf.add(Name);
			name.setLocation(0, 250);
			name.setVisible(true);
			name.setPreferredSize(new Dimension(170,50));
			//customer_name = name.getText();
			//name.setBounds(0, 0, 0, 0);
			
			id.setBounds(250, 470, 50, 100);
			id.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,20));
			ID.setLocation(0, 250);
			ID.setVisible(true);
			ID.setPreferredSize(new Dimension(170,50));
			
			bottomHalf.add(id);
			bottomHalf.add(ID);
		
			
			enter.setBounds(250, 450, 300, 150);
			enter.addActionListener(this);
			bottom.add(enter);
			//topHalf.add(id);
			topHalf.add(name);
			
			frame.add(bottomHalf);
			frame.add(topHalf);
			top.add(upText);
			frame.add(blend);
			frame.add(bottom);
			frame.add(top);
			
			
			if(enter.isSelected()) {
				//infoWindow i = new infoWindow(true);
				
				
			}
		}
		else {//employee
			//prepare order (delete+vs sv)
			//return bill ilaçlar -- fiyat topplam 
			
			JPanel jpan =  new JPanel();
			jpan.setBounds(0,0, 500,150);
			jpan.setVisible(true);
			jpan.setBackground(new Color(204, 230, 244));
			
			
			user_name.setLocation(0, 250);
			user_name.setVisible(true);
			user_name.setPreferredSize(new Dimension(170,50));
			
			pswd.setLocation(0, 400);
			pswd.setVisible(true);
			pswd.setPreferredSize(new Dimension(170,50));
			
			jpan.add(user_name);
			jpan.add(pswd);
			frame.add(jpan);
			
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500, 750);
		frame.setVisible(true);
		
	}
	
	public void customerNextPage() {
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == enter) {
			infoBox i = new infoBox(false);
		}
	}
}



class infoBox{
	 infoBox(boolean flag){
		 JFrame jfrm = new JFrame("info Box");
		 jfrm.setSize(275, 100);
		 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JLabel jlab = null;
		 if(flag) {
			 jlab = new JLabel("Your Prescription is being Prepared...");
		 }
		 else {
			 jlab = new JLabel("invalid ID");
		 }
		 jfrm.add(jlab);
		 jfrm.setVisible(true);
	 }
	
}
