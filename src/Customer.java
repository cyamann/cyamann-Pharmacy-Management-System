import java.util.ArrayList;

public class Customer extends Person {

	private boolean insurance;
	private ArrayList<String> prescription;
	private String id;
	
	public Customer(String name, String surname, int age, boolean insurance, ArrayList<String> prescription, String id) {
	}
	
	
	
	public Customer(String name, String surname, int age, boolean insurance, ArrayList<String> prescription) {
		this.insurance = insurance;
		this.prescription = prescription;
		this.age = age;
		this.name = name;
		this.surname = surname;
		this.id = id;
		
	}
	
	
	
	
	public boolean orderConfirmation() {
		//choose from the guı and confirm
		boolean confirmation_status = true;
		
		return confirmation_status;
		//gui
	}
	


	
}
