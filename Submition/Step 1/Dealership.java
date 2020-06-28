import java.util.Arrays; 
import java.util.ArrayList;


public class Dealership {
	private ArrayList<Manufacturer> manufacturer = new ArrayList<>();
	
	public boolean addManufacturer(Manufacturer x) {
		if(!hasManufacturer(x)) {
			manufacturer.add(x);
			return true;
		}else return false;
	}
	
public boolean hasManufacturer (String make) {
	for (int z = 0; z < manufacturer.size(); z++)
		if(manufacturer.get(z).getMake().equals(make)) {
			return true;
				 }
		return false;
	}
	
public boolean hasManufacturer(Manufacturer x) {
	 for (int z = 0; z < manufacturer.size(); z++)
		 if(manufacturer.get(z).equals(x)) {
			 return true;
			 }
	 return false;
}

public Manufacturer getCarMakes(String make) {
	 for (int z = 0; z < manufacturer.size(); z++) 
         if (manufacturer.get(z).getMake().equals(make)) { 
        	 return manufacturer.get(z);
        	 }
	 	
	 return null;
	 }


public int getAllCars() {
	return this.manufacturer.size();
	}
public void deleteMake(Manufacturer x) {
	this.manufacturer.remove(x);
	}
public Manufacturer[] getSortedList() {
	// TODO Auto-generated method stub
	Manufacturer[] manufacturer = this.manufacturer.toArray(new Manufacturer[0]);
    Arrays.sort(manufacturer);
    return manufacturer;
	
	}
}

