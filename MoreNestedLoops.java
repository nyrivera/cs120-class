public class MoreNestedLoops {

	public static void main(String[] args) {
		System.out.println();
		exTwo();
		System.out.println();
		exThree();
		System.out.println();

		for (int col = 1;col<=5; col ++ ) {
			for (int row=1;row<=col; row++) {
				System.out.print(row);
			}
			System.out.print(", ");
		}
	}
	public static void exTwo() {
		for (int col = 1; col<=5; col ++) {
			for (int row = 4; row>=col;row--) {
				System.out.print(".");
				
			}
			System.out.print(col);
		for (int tail =1; tail<col; tail ++) {
			System.out.print(".");
		}
			
			System.out.println();
		}
	}
		
		public static void exThree() {
			for (int col =1; col <=5; col++) {
				System.out.print(col);
				for (int row=1; row <=5; row++) {
				System.out.println();
				}
				
			}
		}
		
}
