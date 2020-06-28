import java.util.Arrays;
import java.util.ArrayList;
import java.util.Queue;


public class Dealership {
	private ArrayList<Manufacturer> manufacturer = new ArrayList<>();
	
		public boolean addManufacturer(Manufacturer x) {
			if(!hasManufacturer(x)) {
			manufacturer.add(x);
			return true;
		}
		else return false;
		}
		public boolean hasManufacturer(Manufacturer x) {
			for (int z = 0; z < manufacturer.size(); z++)
				if(manufacturer.get(z).equals(x)) {
			return true;
		}
				return false;
		}
		
		public boolean hasManufacturer (String make) {
			for (int z = 0; z < manufacturer.size(); z++)
				if(manufacturer.get(z).getMake().equals(make)) {
			return true;
		 }
	return false;
		}
		public Manufacturer getCarMakes(String make) {
			for (int z = 0; z < manufacturer.size(); z++) {
				if (manufacturer.get(z).getMake().equals(make)) {
        	return manufacturer.get(z);
        	 }
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


		public Queue<Car> getCarFromMake(String make) {
			for (int i = 0; i < manufacturer.size(); i++) {
				if(manufacturer.get(i).getMake().equals(make)){
				return  manufacturer.get(i).getCar();
			}
		}
		return null;
		}

		public Car getByModel(String enter_model) {
			for (int i = 0; i < manufacturer.size(); i++) {
				if (manufacturer.get(i).getByModel(enter_model) != null) {
				return manufacturer.get(i).getByModel(enter_model);
			}
		}
			return null;
	}
			public Car getByRegNum(String regNum) {
				for (int i = 0; i < manufacturer.size(); i++) {
					if (manufacturer.get(i).getByRegNum(regNum) != null) {
					return manufacturer.get(i).getByRegNum(regNum);
				}
			}	
		return null;
		}

		public void removeCar(Car kar) {
			for (int i = 0; i < manufacturer.size(); i++) {
				if(manufacturer.get(i).removeCar(kar)) return;
		}
	}

		public Car[] getAllCarAsArray() {
			ArrayList<Car> cars = new ArrayList();
				for (int i = 0; i < manufacturer.size(); i++) {
				cars.addAll(Arrays.asList(manufacturer.get(i).getAllCarAsArray()));
		}
		return cars.toArray(new Car[0]);
	}
	
	public ArrayList<Manufacturer> getManufacturer() {
	    return manufacturer;
	}
}

