import java.util.Queue; 
import java.util.LinkedList;


public class Manufacturer implements Comparable <Manufacturer> {
	


	private String make;
	private Queue<Car> car = new LinkedList<>();
	
	public Manufacturer(String make) {
		this.make = make;
}
	
	public String getMake() {
		return make;
}
	
@Override
	public String toString() {
	  String s = "";
	  s += this.make + " ";
	 
	  return s;
	}
	
@Override
	public int compareTo(Manufacturer manufacturer) {
		return this.make.compareTo(manufacturer.make);
	
}	


public boolean hasCar(Car aCar) {
		for(Car cars : this.car)
			if(aCar.getModel().equals(cars.getModel()))
				return true;
		return false;
	}

	public boolean addCar (Car aCar) {
		
			this.car.add(aCar);
			return true;
		
	}
	
	 public boolean removeCar(Car car) {
	        return this.car.remove(car);
	    }
	 

	
	public int getCarsSize() {
        return this.car.size();
    }
	
	public Car[] getAllCarAsArray() {
        return this.car.toArray(new Car[0]);
    }
	public boolean findCarByModel(String model) {
        for (Car c : this.car)
        	if (c.getModel().equals(model)) return true;
        return false;
    }

	public Car getByModel(String model) {
		for (Car c : this.car)
			if(c.getModel().equals(model))
				return c;
		return null;
	}

	public Queue<Car> getCar() {
		return car;
	}

	public Car getByRegNum(String regNum) {
		// TODO Auto-generated method stub
		for(Car c:this.car)
			if(c.getRegNum().equals(regNum))
			return c;
		return null;
	}
}

