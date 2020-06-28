import java.util.ArrayList;
import java.util.Queue;
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
                    } else {
                        dealership.addManufacturer(new Manufacturer(make));
                        System.out.println("Car make added");

                    }
                    break;

                case 2:

                    Manufacturer y = dealership.getCarMakes(Input.getString("Please enter car make:"));
                    if (y == null) {
                        System.out.println("Car make not found");
                        break;
                    }

                    String model = Input.getString("Enter car model");
                    String regNum = Input.getString("Enter car registration number");
                    
                    if (dealership.getByRegNum(regNum) != null) {
                    	System.out.println("Car already exists");
                    	break;
                    }
                    String colour = Input.getString("Enter car colour");

                    if (y.addCar(new Car(model, regNum, colour))) ;
                    System.out.println("Car added.");

                    break;

                case 3:
                    Car kar = dealership.getByModel(Input.getString("Please enter car model"));
                    if (kar != null)
                        System.out.println("Car model found");
                    else System.out.println("Car model not found");
                    break;


                case 4:
                    kar = dealership.getByRegNum(Input.getString("Please enter car registration number to remove it"));
                    if (kar != null) {
                        dealership.removeCar(kar);
                        System.out.println("Car removed");
                    } else
                        System.out.println("Car was not found");
                    break;

                case 5:

                    Manufacturer x = dealership.getCarMakes(Input.getString("Please enter car make:"));
                    if (x != null) {
                        dealership.deleteMake(x);
                        System.out.println("Removed successfully");

                    } else System.out.println("Car make not found");
                    break;


                case 6:

                	Queue<Car> cars = dealership.getCarFromMake(Input.getString("Please enter car make"));
                    if(cars == null || cars.size() == 0){
                        System.out.println("No cars from this make available");
                        break;
                    } else if(cars.size() > 0){
                        cars.forEach(car -> System.out.println(car));
                   }
                    break;
                    
                case 7:

                    if (dealership.getAllCars() == 0)
                        System.out.println("No cars are being sold");
                    else {
                    	for (int i = 0; i < dealership.getManufacturer().size(); i++) {
                            System.out.println(dealership.getManufacturer().get(i).getMake());
                        }
                    	for (Car car : dealership.getAllCarAsArray())
                            System.out.println(car.toString());
                    break;}
                    break;
                        
                case 8:

                    Scanner user_input = new Scanner(System.in);
                    System.out.println("Are you sure you want to exit? y/n ");
                    String exit;

                    exit = user_input.next();


                    while (!exit.equals("y") && !exit.equals("n")) {
                        System.out.println("Choice not valid. Please input again. Quit? y/n");
                        exit = user_input.next();
                    }
                    if (exit.equals("y")) {
                        System.exit(0);
                    } else if (exit.equals("n")) {
                        break;
                    }
            }
        }
    }
}

