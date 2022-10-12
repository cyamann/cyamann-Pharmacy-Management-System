import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import StackAndQueue.*;

public class Pharmacy {
	private String name;
	private String address;
	private int income;
	private int outcome;
	private ArrayList<Employee> employees =  new ArrayList<Employee>();
	private QueueInterface<Customer> customers =  new LinkedQueue<Customer>();
	private ArrayList<Customer> customers_inDatabase = new ArrayList<Customer>();
	
	private String userName = "admin";
	private String password = "1234"; 
	
	
	public Employee searchEmployee(String id) {
		//butona bağlanacak //guiden bu fonk çağırılacak daha sonra return edilen şey label olarak yazılacak
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getId().equals(id))
				return employees.get(i);
		}
	
			return null;
	}
	
	
	public void signinCustomer(Customer c) {
		//butonla birleşecekk
		customers.enqueue(c);
	}
	
	
	public void signUpCustomer(Customer c) {
		customers_inDatabase.add(c);
	}
	
	public void removeCustomer(Customer c) {
			 customers.dequeue();
			
		}
	
	public void addCustomer(Customer c) {
		customers_inDatabase.add(c);
	}
	
	
	public void addEmployee(Employee e) {
		//butonla bağlanacak
		employees.add(e);
	}
	
	
	public boolean removeEmployee(String id) {
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getId().equals(id)) {
				employees.remove(i);
				return true;

			}
		}
	
			return false;
	}
	

	
	public Boolean confirmPayment() {
		return false;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	
	public void setEmployees( ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}
