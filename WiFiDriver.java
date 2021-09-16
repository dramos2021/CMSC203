import java.util.Scanner;
public class WiFiDriver {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("**********************************************************************\n"+                                                          
				"**            WiFi Troubleshooter v1.0      9/15/2021      	    **\n"+
				"**							    	    **\n"+
				"**     This program will Help Diagnose your WiFi connection	    **\n"+
				"**                                                                  **\n"+
				"**********************************************************************\n\n");
		
		System.out.println("(1)First Step: lets try rebooting your computer");
		
		System.out.println("Are you now able to connect to the internet?(Y / N): ");
		String response = input.nextLine();
		
		if (responseEvaluate(loopBadInput(response))) {
			System.out.println("rebooting your computer seems to have resolved the issue.");
			exitGreeting();
			System.exit(0);
		}
			else
				System.out.println("Let's try something else\n");
		
		
		System.out.println("(2)Second Step: lets try rebooting your router");
		System.out.println("Are you now able to connect to the internet?(Y / N): ");
			response = input.nextLine();
			if (responseEvaluate(loopBadInput(response))) {
				System.out.println("rebooting your router seems to have resolved the issue.");
				exitGreeting();
				System.exit(0);
			}
			else
				System.out.println("Let's try something else\n");
		
		System.out.println("(3)Third Step: make sure the cables to your router are plugged in \n"+
						   "firmly and nthat your router is getting power");
		System.out.println("Are you now able to connect to the internet?(Y / N): ");
			response = input.nextLine();
			if (responseEvaluate(loopBadInput(response))) {
				System.out.println("Securing the cable connections seems to have resolved the issue.");
				exitGreeting();
				System.exit(0);
			}
			else
				System.out.println("Let's try something else\n");
		
		System.out.println("(3)Fourth step: move your computer closer to your router");
			System.out.println("Are you now able to connect to the internet?(Y / N): ");
			response = input.nextLine();
			if (responseEvaluate(loopBadInput(response))) {
				System.out.println("Moving closer to the router seems to have resolved the issue.");
				exitGreeting();
				System.exit(0);
					}
			else
				System.out.println("(5)Fifth Step: Contact you ISP. This seems to a service provider issue.\n"+
								   "Make sure your router is connected to the cable from your ISP \n"+
								   "before contacting them");
		
		
			exitGreeting();
		
		
		
		}
	
	
		
	



public static boolean responseEvaluate(String response) {
	
		switch(response.trim()) {
		case "y":
		case "Y":return true;
		case "n":
		case "N":return false;
		default:return false;
		}
	}
	
		
	

//This method will eliminate blank spaces and verify that input was valid.
public static boolean checkInput(String response) {
		

		if(response.length() != 1)
			return false;
		
		switch(response) {
		case "y":
		case "Y":return true;
		case "n":
		case "N":return true;
		default: return false;
		}
		
	}
	
//This method will loop until a valid input is entered.
public static String loopBadInput(String response) {
	Scanner input = new Scanner(System.in);
	while(!(checkInput(response.trim()))) {
	System.out.println("Invalid response please try again\n"+	
					   "Are you now able to connect to the internet?(Y / N): ");
	response = input.nextLine();
		}
	return response;
	}


public static void exitGreeting() {
	System.out.print("\n\n**********************************************************************\n"+                                                          
			"**                 WiFi Troubleshooter v1.0            	            **\n"+
			"**							    	    **\n"+
			"**     This program will now exit, thank you for trying it! "
			+ "	    **\n"+
			"**                                                                  **\n"+
			"**********************************************************************\n\n");
	
	}
}
	
