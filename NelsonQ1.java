//Nelson Rivera

import java.util.Scanner;
public class NelsonQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maxInt =0;
		double average =0.0;
		double count =0;
		double inputSum =0;
		
		System.out.println("Please enter some integer numbers. \nI will show the max and average. (any negati\nve integer to quit)");
		int userInput =sc.nextInt();
		
		while (userInput >=0) {
			if(userInput>=0) {
			inputSum = inputSum + userInput;
			count ++;
			average = inputSum/count;
			}
			userInput =sc.nextInt();
			
			if(userInput>maxInt) {
				maxInt =userInput;
			}
				
			}
		
		System.out.println("The max number is " + maxInt + "\nThe average is " + average);
		
	}



}
