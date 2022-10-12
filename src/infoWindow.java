import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class infoWindow {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("INFORMATION");
	private JLabel label2 = new JLabel("Your order is being prepared at this moment.");
	
	infoWindow(boolean flag){
		panel.setBounds(0, 0, 200, 100);
		panel.setBackground(new Color(0,0,0));
		label.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,15));
		label.setBounds(140, 20, 200, 50);
		label.setSize(200,100);
		label.setBackground(new Color(12,27,95));
		panel.add(label);
		//frame.add(label);
		
		//label2.setFont(new Font("High Tower Text",Font.CENTER_BASELINE,20));
		
//		label2.setBounds(200, 200, 200, 50);
		//frame.add(label2);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(400, 250);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
