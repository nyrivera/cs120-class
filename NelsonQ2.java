//Nelson Rivera
import java.util.Random;


public class NelsonQ2 {

	public static void main(String[] args) {
		
		// Here are the variables I created to handle the random and the letter grade for the switch.
		// used 101 because the Random doesn't include the last number. 
		Random ra = new Random();
		int grade = ra.nextInt(101);
		int letterGrade =0;
		System.out.println(grade);
		
		//these if statements convert from the GPA to the numbers 1-4 for use on the switch.
		if(grade>90){
			letterGrade =1;
		}else if (grade<=89 && grade > 80) {
			letterGrade =2;
		}else if (grade<=79 && grade > 70){
			letterGrade = 3;
		}else if (grade<=69 && grade > 60){
			letterGrade = 4;
		}else {
				letterGrade = -1;
			}
		
	// Here is the switch to provide the input on the console.
		switch (letterGrade) {
		case 1: System.out.println("The grade = " + grade +"\nExcellent" );
			break;
		case 2:System.out.println("The grade = " + grade +"\nWell done" );
			break;
		case 3:System.out.println("The grade = " + grade +"\nNot bad" );
			break;
		case 4:System.out.println("The grade = " + grade +"\nYou passed" );
			break;
		default:System.out.println("The grade = " + grade +"\nYou better try again" );
			break;
			
		}

	}

}
