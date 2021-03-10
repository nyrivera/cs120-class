//Nelson Rivera

import java.util.Scanner;
// importing the java scanner to add the interaction with the user.
public class NelsonRiveraQ1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
// 	set us the variable scn for use in the scanner
		
		int numOne = 0;
		int numTwo= 0;
		int addition =0;
		int substraction =0;
		double average = 0;
// initialize all variable we are going to use and re-use for the program. Including the double for the average.
		
		System.out.println( "Please enter a number:" );
		numOne=scn.nextInt();
// used the scanner to assign a new value to the variable numOne.
		
		System.out.println( "Please enter another number:");
		numTwo = scn.nextInt();
// used the scanner to assign a new value to the variable numOne.
		
		addition = numOne + numTwo;
		substraction = numOne - numTwo;
		average = (double)(numOne + numTwo)/2;
//These are the formulas for the results we want. I casted the equation on the average formula in order to get the proper results.
		
		System.out.println( numOne + " + " + numTwo + " = " + addition);
		System.out.println( numOne + " - " + numTwo + " = " + substraction);
		System.out.println( "The average of " + numOne + " and " + numTwo + " = " + average);
// used println to display to the console the results, concatenating strings in order to display everything properly.		
		
		scn.close();
// closed variable scn to avoid leakage to other parts of the program. 		
	}

}
