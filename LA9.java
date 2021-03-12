// Nelson Rivera

public class LA9 {
	
	public static double findHypotenuse(double a, double b) {
		double hypotenuse =Math.sqrt(Math.pow(a , 2) + (Math.pow(b , 2)));
		return hypotenuse;
	}
	
	public static int quadrant(double x, double y) {
		if(x>=1 && y>=1) {
			return 1;
		}else if(x<=-1 && y>=1){
			return 2;
		}else if(x<=-1 && y <= -1) {
			return 3;
		}else if( x>=1 && y<=-1) {
			return 4;
		}
			return 0;
	}
	public static void main(String[] args) {
		double a = 5.0;
		double b = 5.0;
		double x = 0;
		double y = -5;
		System.out.println(findHypotenuse(a,b));
		System.out.println("Your coordinates are on quadrant " + quadrant(x,y) + ".");
	}

}
