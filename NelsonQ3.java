// Nelson Rivera
import java.util.Scanner;
import java.lang.Math;

public class NelsonQ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = 0;
		int exp =0;
		
		System.out.println("Please enter a base: ");
		base = sc.nextInt();
		System.out.println("Please enter a exponent: ");
		exp = sc.nextInt();
		displayPowerOf(base, exp);
	}
	public static void displayPowerOf(int base, int exp) {
		//way one with Math Class
		int results =0;
		int count = 0;
		while (count<=exp ){
		results = (int) Math.pow(base, count);
		System.out.print(results +" ");	
		count ++;
		}
		System.out.println();
		// using a loop
		int results2 =0;
		for (int i=0; i<exp; i++) {
			results2= (int)Math.pow(base, count);
			System.out.print(results2 + " ");
		}
		
		}
		
		
	}


