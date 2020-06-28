
public class Car implements Comparable <Car> {
	
	
	
	private String model;
	private String regNum;
	private String colour;
	
public Car (String model, String regNum, String colour) {
	
	this.model = model;
	this.regNum = regNum;
	this.colour = colour;
}

@Override
public int compareTo(Car o) {
	// TODO Auto-generated method stub
	return this.model.compareTo(o.model);

}
@Override
public String toString() {
	String carDetails = " ";
	carDetails += this.model+" " + this.regNum +" " + this.colour;
	return carDetails;
}

public String getModel() {
	// TODO Auto-generated method stub
	return model;
}

public String getRegNum() {
	// TODO Auto-generated method stub
	return regNum;
}







}
