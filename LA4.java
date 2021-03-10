//Nelson Rivera

import java.util.Scanner;
public class LA4 {

	public static void main(String[] args) {
		//Here is the question one work:
		Scanner scan = new Scanner (System.in);
		int userInput = 1;
		// int userInput to catch the scanner input.
		int allUserInput = 0;
		// int allUserInput to catch the sum all of the userInput.
		int iterations = 0;
		// int iterations to count how many times we ran the loop.
		
		while( userInput != 0) {
			System.out.println("Enter a number (0 to escape): ");
			userInput = scan.nextInt();
			allUserInput +=userInput;
			iterations ++;
		
		}
		/*Because the way the while loop is built, when user 
		 input is 0, the loop runs one last time before exiting.
		 in order to properly obtain the average, we subtracted 
		 that last loop from the number of iterations*/ 
		System.out.println((double)allUserInput/(iterations -1));
		
		
		//here is the Question 2 work - for loop, 5 times, used the iteration to multiply by 3 to get the desired results.
		for (int i =1;i<=5;i++) {
			int count =0;
			count += i;
			
		System.out.println(" 3 times " +count + " = " + count*3);
		}
		
		scan.close();

	   }
	
	

	}


