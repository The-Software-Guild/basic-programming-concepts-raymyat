/*
 * Ever heard of those places that you can mail in some of your dog’s hair, and they’ll send back a genetic analysis report to tell you 
 * what kind of dogs are in your most beloved pet’s ancestry?
 * Well, we don’t know how to do that. But we DO know how to generate random numbers. And half the time, that’s good enough. Especially for the Internet.
 * 
 * **DogGenetics 
 * Write a program that asks the user for the name of their dog, and then generates a fake DNA background report on the pet dog. 
 * It should assign a random percentage using five dog breeds. The total percentage should be 100%. 
 * example of output
 * You are welcome to use different text or dog breeds than what is shown here.
 * What is your dog's name? Sir Fluffy McFlufferkins Esquire Well then, I have this highly reliable report on Sir Fluffy McFlufferkins Esquire's prestigious background right here.
 * Sir Fluffy McFlufferkins Esquire is:
 * 61% St. Bernard 2% Chihuahua 29% Dramatic RedNosed Asian Pug 1% Common Cur 7% King Doberman
 * Wow, that's QUITE the dog! 
 * */
import java.util.Scanner;
import java.util.Random;
public class DogGenetics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your dog's name?");
		String dogName = sc.nextLine();
		int numOfType = 5;
		int sum = 100;
		int firstFour = 0;
		String[] dogBreeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug","Common Cur","King Doberman"};
		Random random = new Random();
		int[] numArray = new int[numOfType];
		
		for (int i = 0; i< numOfType; i++) {
			if (i != numOfType - 1) {
				//to print certain range : (upperbound - lowerbound)+ lower bound
				numArray[i] = random.nextInt(sum - 1 + 1);
				firstFour += numArray[i];
				sum -= numArray[i]; //update upperbound
			}else {
				numArray[i] = 100 - firstFour;
			}	
			
		}
		System.out.println("Well then, I have this highly reliable report on "+dogName+"'s prestigious background right here.");
		System.out.println(dogName + " is:");
		for(int i = 0; i < numOfType; i++) {
			System.out.print(numArray[i]+ "% " + dogBreeds[i]+" ");
		}
		System.out.println("\nWow, that's QUITE the dog!");
		
	}
}
