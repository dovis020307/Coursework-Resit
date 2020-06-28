
public class Menu {

	private static String displayMenu = "\n Welcome to dealership \n"+
    		"1 Add car make \n"+
    		"2 Add details to car make \n"+
    		"3 Find car by model \n"+
    		"4 Remove car by registration number \n"+
    		"5 Remove car make \n"+
    	    "6 Show cars of specific make \n" +
            "7 Show all cars \n" +
            "8 Exit program \n";
	
	
	public static int showMenu() {
		int i = Input.getInteger(displayMenu);
        if (!(i < 1 || i > 8)) {
            return i;
        } else {
            System.out.println("Invalid option. Please enter value between 1 and 8");
            return showMenu();
        }
	}
	
}
