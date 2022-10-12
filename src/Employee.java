
public class Employee extends Person{

	private int salary;
	private boolean availability;
	
	
	public Employee(String name, String id, int age, int salary, boolean availability) {
		this.name = name;
		this.id = id;
		this.age =age;
		this.salary = salary;
		this.availability = availability;
		
	}
	
	public void getPayment() {
		
	}
	
	public void getOrder() {
		
	}
	
	public void setAvailability(Boolean flag) {
		this.availability = flag;
	}
	public boolean getAvailability() {
		return availability;
	}
	
	public String getId() {
		return this.id;
	}
	
}
