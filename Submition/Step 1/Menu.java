
public class Menu {

	private static String displayMenu = "\n Welcome to dealership \n"+
			"\nWelcome to dealership \n"+
    		"1 Add car make \n"+
    		"2 Remove car make \n"+
            "3 Find specific car  make \n"+ 
            "4 Show specific car make \n"+ 
            "5 Show all car makes \n"+
            "6 Exit program";
	
	
	public static int showMenu() {
		int i = Input.getInteger(displayMenu);
        if (!(i < 1 || i > 6)) {
            return i;
        } else {
            System.out.println("Please enter value between 1 and 6");
            return showMenu();
        }
	}
}
