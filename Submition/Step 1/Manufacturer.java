

public class Manufacturer implements Comparable <Manufacturer> {
	

	
	private String make;
		
	public Manufacturer(String make) {
		
		this.make = make;
	}
		
@Override
	public String toString() {
	  String s = "";
	  s += this.make + " ";
	 
	  return s;
	}
	

	public String getMake() {
		return make;
}
@Override
	public int compareTo(Manufacturer manufacturer) {
		return this.make.compareTo(manufacturer.make);
	
	}
}

