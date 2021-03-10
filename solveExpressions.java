package Practice;

public class solveExpressions {

	public static void main(String[] args) {
		double myFirstNumber = 20.00;
		double mySecondNumber = 80.00;
		
		double firstResult = (myFirstNumber +mySecondNumber) * 100.00;
		double myReminder = firstResult % 10.00;
		System.out.println( myReminder);
		boolean leftOver = false;
		
		if( !(myReminder ==0)) 
			leftOver = true;
					
		 if (!leftOver) {
			 System.out.println("we got a reminder" );
		 }
		System.out.println(leftOver);
	}
}
