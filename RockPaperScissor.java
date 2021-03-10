/*Group 6 Assignment - Code was made by collaborative effort between Cameron Walker, Michael Rodriguez-Alvarez 
 * and Nelson Rivera. Each member contributed elements of this code and its completion */
import java.util.Scanner;
import java.util.Random;

//Nelson Rivera
public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pick a number to select: Rock (1), Paper (2), Scissor (3) to quit press (4)");
		
			//A "while loop" as validation, if the input is anything other than a number. 
			while(!scan.hasNextInt()) {
			System.out.println("Invalid Input try again:");
			scan.next();
			}
			//Scanner is used to obtain user input.
			int myPick= scan.nextInt();		
			
			/*The code running the game is enclosed in another 
			 * while loop - this allow the game to continue running.
			 * Inside used the Random utility to generate the computer input.
			 * A switch is used to call the function for either rock paper or scissors 
			 * using the input from the user.
			 * Any other input other than integers 1 to 4 returns "Invalid Input".
			 * The number 4 is used to escape the while loop.
			 * The program will continue to ask the user for input until the user presses 4 to quit.
			*/
			
			Random rand = new Random();
			
			while (myPick != 4){
			
			int cpuPick = rand.nextInt(3)+1;
// Cameron Walker
				switch(myPick) {
					case 1: System.out.println(rock(cpuPick));
						break;
					case 2: System.out.println(paper(cpuPick));
						break;
					case 3: System.out.println(scissor(cpuPick));
						break;
					case 4: System.out.println("You quit. Goodbye.");
							break;
					default:
						System.out.println("Invalid Input.");
						break;
					} 
					
					System.out.println("Play again! Rock (1), Paper (2) or Scissors(3), use (4) to quit.");
//Cameron Walker
					while(!scan.hasNextInt()) {
						System.out.println("Invalid Input try again:");
							scan.next();
					}
						myPick= scan.nextInt();
						}
					System.out.println("Thank you for playing, goodbye.");
					scan.close();
			}
//Michael Rodriguez Alvarez	
		/* The Methods Rock, Paper and Scissor do not distinguish between rock paper and scissors,
		 * the cpuPick is still randomized and provides an equal chance of each outcome.
		 */
	public static String rock(int cpuPick) {
		if(cpuPick==1) {
			return "You picked rock, computer picked rock. Its a tie.";
		}else if(cpuPick==2){
			return "You picked rock, computer picked paper. The computer won.";
		}else {
			return "You picked rock, computer picked scissors. You won";
			}
		}
	
	public static String paper(int cpuPick) {
		if(cpuPick==1) {
			return "You picked paper, computer picked rock. You win.";
		}else if(cpuPick==2){
			return "You picked paper, computer picked paper. Its a tie.";
		}else {
			return "You picked paper, computer picked scissors. The computer won";
		}
	}
	public static String scissor(int cpuPick) {
		if(cpuPick==1) {
			return "You picked scissors, computer picked rock. The computer won.";
		}else if(cpuPick==2){
			return "You picked scissors, computer picked paper. You won.";
		}else {
			return "You picked scissors, computer picked scissors. Its a tie.";
		}
	}
}
	
