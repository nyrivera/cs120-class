import java.util.Scanner;

//Nelson Rivera
//I'm going to try to push myself...


public class LA7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Here I request user input, initialize the variables for input and store the input in the variable.		
		System.out.print( "Please enter a number: ");
		int intOne = scan.nextInt();
		
	System.out.print( "Please enter another number: ");
		int intTwo = scan.nextInt();
		
		System.out.print( "Please the last number: ");
		int intThree = scan.nextInt();
		
		/*now Ill call the methods, passing all 3 variables to each, ill use the printlin 
		statement to print to the screen the results of each*/
		System.out.println("The smallest integer for the first method is: " +usingMathClass(intOne, intTwo, intThree));
		System.out.println("The smallest integer for the second method is: " + usingNestedStatements(intOne, intTwo, intThree));
		System.out.println("The smallest integer for the third method is: " +usingLogiOperators(intOne, intTwo, intThree));
		
		scan.close();
	}	
	
	public static int usingMathClass(int intOne, int intTwo, int intThree) {
		//Here I used math.min to create two test and determine which of the three integers is the smallest.
		int testOne = Math.min(intOne, intTwo);
		int testTwo = Math.min(intOne, intThree);		
		//Here I return back the min of the two test.
		return Math.min(testOne, testTwo);
	}
	
	public static int usingNestedStatements(int intOne, int intTwo, int intThree) {
		//Here I nested two if statements, followed by an is else statement to check first intOne  vs intTwo and then intThree. This returns the smallest of the three integers.
		if (intOne>intTwo) {
			if (intTwo>intThree) {
				return intThree;
			} return intTwo;
		}
		else if (intOne > intThree)
		{		return intThree;
		}	return intOne;
	}
	
	public static int usingLogiOperators(int intOne, int intTwo, int intThree) {
		//Here I used the same method as above, I just used the && logic operator to combine statements and shorten the code needed to return the smallest integer. 
		if ((intOne<intTwo)&&(intOne<intThree)){ return intOne;
		} else if((intOne>intTwo)&&(intTwo<intThree)){ return intTwo;
		} return intThree;
	}
}
