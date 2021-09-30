package assignment2_CMSC203;
import java.awt.Toolkit;
import java.util.Scanner;



public class RandomNumberGuesser {
	public static void main(String[] args) throws InterruptedException {
	Scanner keyboard = new Scanner(System.in);
	int randNum;
	int nextGuess;
	
	String newGame = "Y";
	
		
do {	
	int lowGuess = 0;
	int highGuess = 100;
	randNum = RNG.rand();
	boolean repeat = true;
	RNG.resetCount();
	
System.out.println("================================================================================\n" +// Header
		"================================================================================\n" +
		"===									     ===\n" +
		"===		     RANDOM NUMBER GUESSER GAME	V1.0	9/28/2021	     ===\n" +
		"===									     ===\n" +
		"===			 PRESS ENTER TO START 		          	     ===\n" +
		"===									     ===\n" +
		"================================================================================\n" +
		"================================================================================");
keyboard.nextLine();

for (int i = 3; i > 0; i--) { // Start message
	Toolkit.getDefaultToolkit().beep();
	System.out.print("		"+ i + "...");
	Thread.sleep(1100);
	
	}
System.out.println("	GO!\n" );


System.out.println("Enter your first guess: ");
do {
nextGuess = keyboard.nextInt();
	while(!RNG.inputValidation(nextGuess, lowGuess, highGuess)){
		nextGuess = keyboard.nextInt();	
	}


	switch(highLowOrWin(nextGuess, randNum)) {//Takes three different paths depending on user input
	
		case -1:System.out.println("Number of guesses is: " + RNG.getCount() + "\nYour guess was too low");
			lowGuess = nextGuess;
			break;
		case  0:System.out.println("Number of guesses is: " + RNG.getCount() + 
								 "\nCongratulations! You have guessed the number!\n");
			for (int i = 0; i < 3; i++) {
			Toolkit.getDefaultToolkit().beep();
			Thread.sleep(850);}
			repeat = false;
			break;
		case  1:System.out.println("Number of guesses is: " + RNG.getCount() + "\nYour guess was too high");
			highGuess = nextGuess;
			break;
	}
}while(repeat);

keyboard.nextLine();//clear buffer
System.out.println("Play Again? (Y / N): ");
newGame = keyboard.nextLine();

}while((newGame.equalsIgnoreCase("y")));

for(int i=0;i<3;i++) {//Exit Greeting 75 - 102
System.out.print("\n");
Thread.sleep(400);
}

Thread.sleep(400);
System.out.print("		 T h a n k    y o u");
for(int i=0;i<3;i++) {
System.out.print("\n");
Thread.sleep(400);
}
Thread.sleep(400);
System.out.print("    	      		f o r");
for(int i=0;i<3;i++) {
System.out.print("\n");
Thread.sleep(400);
}
Thread.sleep(400);
System.out.print("    	  	    p l a y i n g");
for(int i=0;i<3;i++) {
System.out.print("\n");
Thread.sleep(400);
}
Thread.sleep(400); 
System.out.print("    	  	    G o o d b y e!");
for(int i=0;i<3;i++) {
System.out.print("\n");
Thread.sleep(600);
}
}


	
/*Checks to see if the number guess was correct or if the guess was higher or lower
 * than the number.
 * @returns 0 if guess is correct
 * @returns 1 if guess is high
 * @returns 1 if guess is low
@param nextGuess
@param randNum**/
	
public static int highLowOrWin(int nextGuess, int randNum) {
if(nextGuess == randNum)
	return 0;
if(nextGuess < randNum) 
	return -1;
else 
	return 1;
}	
	
	
	}


