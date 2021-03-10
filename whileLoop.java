import java.util.Scanner;
public class whileLoop {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int userInput = 1;
		int sum = 0;		
			
		while(userInput != 0) {
			System.out.println( "Enter a number (0 to quit): ");
			userInput = scn.nextInt();
			sum +=userInput;
		}
		System.out.println(sum);
		System.out.println("Loop Exit");
		scn.close();		
	}
}

