/*
 * **Summative Sums 
 * Write a static method that takes in an array of ints, adds them together, and returns the result.
 * Call your new method inside a main method and print out the results for the following three example arrays:
 * { 1, 90, -33, -55, 67, -16, 28, -55, 15 } { 999, -60, -77, 14, 160, 301 } 
 * { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 } 
 *  example of output
 * #1 Array Sum: 42 #2 Array Sum: 1337 #3 Array Sum: 2001
 * */
public class SummativeSum {

	public static void main(String[] args) {
		int[][] numArr = {{ 1, 90, -33, -55, 67, -16, 28, -55, 15 }, // first num array
							 { 999, -60, -77, 14, 160, 301 }, // second num array
							 { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }}; // third num array
		for (int i = 0; i < numArr.length; i++){
			System.out.println("#" +(i+1) + " Array Sum: " + addArrayElements(numArr[i]));
		}
		
	}
	private static int addArrayElements(int[] myarra) {
		int sum = 0;
		for(int i: myarra) {
			sum += i;
		}
		return sum;
	}

}
