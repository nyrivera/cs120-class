//Nelson Rivera


public class NelsonRiveraQ2 {

	public static void main(String[] args) {
// This will call the   printHorizontalBar and printX from the Main method
		printHorizontalBar();
		printX();

		
// Couldn't remember how to use the Random :(		
		for(int count = 0; count<=5; count++){
			count = (int)(Math.random()* 5)+1;
			
			System.out.println(" ");
			printHorizontalBar();
			printX();
			System.out.println(count);
		};
	
	}

	public static void printHorizontalBar() {
		System.out.println(" ***** \n *****");
	}
// This prints the two lines with the 5 stars each	

	public static void printX() {
		System.out.println( "  * *\n   *\n  * *");
	}
// this prints the X with the 5 stars.	

}
