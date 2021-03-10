import java.util.Scanner;

public class LoopDemo2 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Type an even number or 999 to quit:");
		
		int userInput =1;
		
		while (userInput!=999) {
			userInput = scn.nextInt();
			if (userInput%2==0) {
				System.out.println("Good Job!");
				
			} else {
				if(userInput==999) {
					System.out.println("Goodbye!");
				}else {
				System.out.println("This is not an even number!");	
				}
				
				
			}
		}
		
		
		scn.close();
	}

}
