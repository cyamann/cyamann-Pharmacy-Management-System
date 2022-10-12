import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	JButton customer;
	JButton employee;
	private String cus_id = null;
	MyFrame(String customer_id){
		cus_id = customer_id;
	}
	
	MyFrame(){
		customer = new JButton("Customer");
		customer.setBounds(150, 200, 200, 100);
		customer.addActionListener(this);
		employee = new JButton("Employee");
		employee.setBounds(150, 350, 200, 100);
		employee.addActionListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 750);
		this.setVisible(true);
		this.add(customer);
		this.add(employee);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == customer) {
			this.dispose();
			NewWindow window = new NewWindow(true);
		}
		if(e.getSource() == employee) {
			this.dispose();
			NewWindow window = new NewWindow(false);
		}
		
	}
	
}
