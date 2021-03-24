// Nelly
public class NestedLoopsAssignment {

	public static void topAndBottom() {
		for(int i=0; i<1;i++) {
			System.out.print("|");
			for(int j=0 ; j<9; j++) {
				System.out.print("\"");
			}
			System.out.println("|");
			}
	}
	public static void topTriangle(String spaces, String semiColon, int i, int interior) {
		
		for( int j =4; j>0; j--) {
			System.out.print( spaces + "\\");
			for (i = 0; i<interior; i++) {
				System.out.print(semiColon);
			}
			interior = interior -2;
			spaces = spaces + " ";
			System.out.println("/");
			}
	}

	public static void bottomTriangle( String semiColon, int i, int interior2) {
		String[] spaces = {"    ","   ", "  ", "  ", "  ", " "};
			
		for( int j =0; j<4; j++) {
		  System.out.print( spaces[i] + "/");
		  for (i = 0; i<interior2; i++) {
			System.out.print(semiColon);
			}
			interior2 = interior2 +2;
			System.out.println("\\");
		}
	}
	
	public static void main(String[] args) {
		String spaces =" ";
		String semiColon =":";
		int i =0;
		int interior = 7;
		int interior2 =1;
		topAndBottom();
		topTriangle(spaces, semiColon, i, interior);
		bottomTriangle( semiColon, i, interior2);
		topAndBottom();
	}

}
