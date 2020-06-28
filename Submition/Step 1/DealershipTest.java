import java.util.Scanner;

public class DealershipTest {
	
	private static Dealership dealership = new Dealership();
	
	public static void main(String[] args) {
	       showMenu();
	    }
	
	public static void showMenu() {
		while (true) {
            switch (Menu.showMenu()) {
    
            case 1:
            	
            	String make = Input.getString("Please enter car make:");
            	if (dealership.hasManufacturer(make)) {
            		System.out.println("Car make already exists.");
            		}
            		else {
            			dealership.addManufacturer(new Manufacturer (make));
            			System.out.println("Car make added to system.");
            		}
            	break;
            	
            case 2:
            	
            	Manufacturer find = dealership.getCarMakes(Input.getString("Please enter car make:"));
            	if (find != null) {
                    dealership.deleteMake(find);
                    System.out.println("Car make removed successfully.");
                } 
            		else System.out.println("Car make not found in system.");
                break;
                
            case 3:
            	
            	boolean findMake = dealership.hasManufacturer(Input.getString("Please enter car make:"));
                	if (findMake) 
                		System.out.println("Car make was found.");
                		else System.out.println("Car make was not found.");
                break;
                
            case 4:
            	
                find = dealership.getCarMakes(Input.getString("Please enter car make:"));
                	if (find != null) 
                		System.out.println(find.toString());
                		else System.out.println("Car make was not found.");
                break;
                
            case 5:
            	
               if (dealership.getAllCars() == 0)
            	   System.out.println("No cars are being sold");
               		else {
               			for (Manufacturer c : dealership.getSortedList()) {
               			System.out.println(c.toString());
                }
               }
                break;
                
            case 6:
            	Scanner user_input = new Scanner(System.in);
            	System.out.println("Are you sure you want to exit? y/n ");
            	String exit;
            	
            	exit = user_input.next();

            	        
            	while(!exit.equals("y" ) && !exit.equals("n")) {
            		System.out.println("Choice not valid. Please input again. Quit? y/n");
                    exit = user_input.next();
            	}
            	if (exit.equals("y")) {
            		System.exit(0);
            	}
            	else if (exit.equals("n")) {
            		break;
            	}
             }
         }
	}
}

