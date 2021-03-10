import java.util.Scanner;
// Nelson Rivera

public class LA8 {
	
	public static double average() {
		Scanner sc = new Scanner(System.in);
		int input =1;
		double avg =0;
		int count =0;
		int sum =0;
		
			while(input!=0) {
				System.out.println("Type a number(0 to quit): ");
				input = sc.nextInt();
				sum+=input;
				avg =(double)sum/(count);	
				count++;
			}
			sc.close();		
			return avg;
	}
		
	public static void main(String[] args) {
		System.out.println("The average of all inputs is "+ average());;
	}

}
