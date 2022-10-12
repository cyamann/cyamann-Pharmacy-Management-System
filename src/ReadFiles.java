import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
public class ReadFiles {
    private Medicine drug;
    public ReadFiles(Warehouse inventory) throws Exception{
        readDrugsContentOfFile(inventory);

    }

    private void readDrugsContentOfFile(Warehouse inventory)throws Exception{
        BufferedReader bfr= null;
        String line;
        try {
            bfr = new BufferedReader(new FileReader("medicines.csv"));
            while((line = bfr.readLine()) != null){
                String[] str = line.split(",");
                drug = new Medicine(Integer.parseInt(str[0]), str[1],str[2],str[3],Integer.parseInt(str[4]),Double.parseDouble(str[5]));
                inventory.add(str[2],drug);
            }
            bfr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    
    private Customer customer;
  
    	
    private void readCustomers(Pharmacy pharmacy) {
    	BufferedReader bfr = null;
    	String line;
    	int id_count = 0;
    	try {
    		bfr = new BufferedReader(new FileReader("customers.csv"));
    		while((line = bfr.readLine()) != null) {
    			String[] str = line.split(",");
    			ArrayList<String> meds = new ArrayList<String>();
    			for(int i=4; i<10; i++) {
    				if(str[i]!="")
    					meds.add(str[i]);
    				else
    					break;
    			}
    			customer = new Customer(str[0], str[1], Integer.parseInt(str[2]),Boolean.parseBoolean(str[3]), meds , String.valueOf(id_count));
    			customer = new Customer(str[0], str[1], Integer.parseInt(str[2]),Boolean.parseBoolean(str[3]), meds );
    			pharmacy.addCustomer(customer);
    			id_count++;
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    
    
    
    
    private Employee employee;
    private void readEmployee(Pharmacy pharmacy) {
    	BufferedReader bfr = null;
    	String line;
    	try {
    		bfr = new BufferedReader(new FileReader("Employee.csv"));
    		while((line = bfr.readLine())!=null) {
    			String [] str = line.split(",");
    			employee =new Employee(str[0], str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]), Boolean.parseBoolean(str[4]));
    			pharmacy.addEmployee(employee);
    			
    			
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
