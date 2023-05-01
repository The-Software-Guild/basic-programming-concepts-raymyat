/* **Program name: HealthyHearts 
 * Create a simple calculator that asks the user for their age, 
 * calculates the healthy heart rate range for that age, and displays the result.
 * Their maximum heart rate should be 220 - their age. 
 * The target heart rate zone is the 50 - 85% of the maximum. 
 * Sample output
 * What is your age? 50 Your maximum heart rate should be 170 beats per minute Your target HR Zone is 85 - 145 beats per minute
 * */
import java.util.Scanner;
public class HealthyHearts {
	public static void main(String[] args) {
		System.out.println("What is your age?");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		//calculate heart rate
		int maxHeartRate = 220 - age;
		int lowerTarget = (int)Math.ceil(0.5 * maxHeartRate);
		int upperTarget = (int)Math.ceil(0.85 * maxHeartRate);
		
		System.out.println("Your maximum heart rate should be "+maxHeartRate+" beats per minute Your target HR Zone is "
							+lowerTarget+" - "+upperTarget+" beats per minute");
	}

}
