//Nelson Rivera
import java.lang.Math;
import java.util.Arrays;

public class LA11 {

	public static void main(String[] args) {
		int[] intArray = { 4, 9, 1, 11, 0 };
		print(intArray);
		System.out.println(max(intArray));  //11
		System.out.println(min(intArray));  //0
		System.out.println(sum(intArray));  //25
			double[] dArray = {4.0, 9.0, 1.0, 11.0, 0.0};
			double num =2;
		System.out.println(Arrays.toString(expo(dArray, num)));//[16.0, 81.0, 1.0, 121.0, 0.0]
				
		}
	/* These two methods are nearly identical on the implementation. They compare the value stores in the 
	 * Array against the value of the maximum or value that an Integer can hold. then it replaces the value inside the 
	 * variable max or min and compares each value with the previous value.
	 */
	  public static int max(int[] intArray) {
        int max = -1*Integer.MAX_VALUE;
        for (int i=0;i<intArray.length; i++) {
        	if (intArray[i]>max) {
        		max =intArray[i];
        	}
        }
         return max;
	  }
    
	  public static int min(int[] intArray){
    	int min = Integer.MAX_VALUE;
        for (int i=0;i<intArray.length; i++) {
        	if (intArray[i]<min) {
        		min =intArray[i];
        	}
        }
         return min;
	  }
   
    /* This method needs to return an int that represents the sum of
     *  all the numbers on the array, in this case 25. I accomplished this by 
     *  using a for loop to iterate over using the array.lenght property. Once inside of the loop
     *  I used the variable sum to hold the values of the addition for all the iterations 
     *  and upon completion of the loop it returned the value to the main method.
     */
    public static int sum(int[] intArray){
     int sum = 0;
     for (int i = 0; i< intArray.length;i++){
    	 sum += intArray[i];
        }
    	return sum;
    } 
     	/*The instructions said return a new array that had the values [16.0, 81.0, 1.0, 121.0, 0.0]. 
    	 * I created the new array squared, then I used a for loop to iterate over dArray, every
    	 *  iteration saving the value for the math.pow inside of the new array. Lastly I returned
    	 *   the value of squared back to the main method and used the Arrays.toString to print the returned values.
		 */
    
    public static double[] expo(double[] dArray, double num ){
    	double[] squared = new double[5];
		for (int i = 0; i < dArray.length; i++) {
		squared [i] = Math.pow(dArray[i], num);
		}
    	return squared;
}
   	
    /* This method needed to print the values of intArray, separated by a comma. I imported the used the 
     * java.util.Arrays. Using the property to.Sting, I was able to print a representation of values
     * inside of the array by converting them to a string and using println to print to the console.
     */
    public static void print(int[] intArray){
        System.out.println(Arrays.toString(intArray));
    }
}


