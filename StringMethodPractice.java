// Nelson Rivera
public class StringMethodPractice {

	public static void main(String[] args) {
		lengthExercise();
		charAtExercise();
		substringExercise(); 
		indexOfExercise();

	}
	public static void lengthExercise(){ 
	
		String s = "hello"; 
		/*  Exercise 1: print out the length of string s   */
		System.out.println("Exercise 1: " + s.length());
		}
	
	public static void charAtExercise(){
		String s = "hello"; 
		/*  Exercise 2: print out the 2nd character in s  */
		System.out.println("Exercise 2: " + s.charAt(1));
		
		 
		/* Exercise 3: write a for loop to print out each   
		 * * character of s on a separate line  */
		System.out.println("Exercise 3:");
		for (int i = 0; i < s.length(); i++) {
			System.out.println( s.charAt(i));
		}

		/*  Exercise 4: write a for loop to print the characters  
		 * * s backwards, ie display "olleh" on the console  */
		System.out.print("Exercise 4: ");	
			for (int i = (s.length() -1); i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}
	
	public static void substringExercise(){
		System.out.println();
		String s = "hello world!";
		/*  Exercise 5: Use substring method to display "world!" * to the console. */
		System.out.println("Exercise 5: " +s.substring(6));
		/*  Exercise 6: Use substring method to display "ell" to  * the console. */
		System.out.println("Exercise 6: " + s.substring(1,4));
		/*  Exercise 7: Write a for loop to displays the characters * in s in two-letter 
		 * chunks, each on its own line. For eg: *     he *     ll *     l  *     wo *     rl *     d! */
		System.out.println("Exercise 7: ");	

		int a=0;
		int b=2;
		String solution ="";
		for(int i=0; i<s.length();i++) {
			if(solution.equals("d!")) {
				break;
			}
			solution =(s.substring(a, b));
			System.out.println(solution);
			a+=2;
			b+=2;
			}
		}
	
	public static void indexOfExercise(){
		String s = "Another exercise";
		/*  Exercise 8: use the indexOf method to display where 
		 * *  the substring "the" occurs in s. */
		System.out.print("Exercise 8: ");	
		System.out.println(s.indexOf("the"));
		
		/*  Exercise 9: use indexOf and substring method to split 
		 * * the string, s, into "Another" and "exercise" strings.  
		 * * Display the both substrings to the console.  */
		String one = s.substring(s.indexOf("A"),s.indexOf(" "));
		String two = s.substring(s.indexOf(" "));
		System.out.println( "Exercise 9: " + one + two);
	}

}
