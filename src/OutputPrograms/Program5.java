//Program 5 
// java program to check whether the given input number is even or odd

package OutputPrograms;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("The given Number : ");
		int a = scanner.nextInt();

		scanner.close();

		// Write the logical for given number is odd or even using if condition
		if (a % 2 == 0) {
			System.out.println("The given number is Even ");
		} else {
			System.out.println("The given numnber is odd ");
		}

	}

}
