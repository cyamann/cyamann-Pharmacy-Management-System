import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private Map<String,ArrayList<Medicine>> drugs = new HashMap<>() ;
    private int capacity;

    public Warehouse() {

    }
    //public boolean searchMedicine(Medicine medicine)
    
    public void add(String type,Medicine medicine) {
        ArrayList<Medicine> drugList = drugs.get(type);
        if(drugList == null){
            drugList = new ArrayList<>();
            drugList.add(medicine);
            drugs.put(type,drugList);
        }
        else{
            if(!drugList.contains(medicine)){
                drugList.add(medicine);
            }
        }
    }

    public Map<String, ArrayList<Medicine>> getDrugs() {
        return drugs;
    }

    public void delete(Medicine medicine) {
        /*
    	
    	if(drugs.contains(medicine)) {
    		//delete
    		
    	}

         */
    
    }
    
    
    public void deleteExpired() {
    	
    	//will be return always
    }
}
