//Program :11
//Program for quotient and reminder ;

package OutputPrograms;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = scanner.nextInt();
		System.out.println("Enter num2:");
		int num2 = scanner.nextInt();
		scanner.close();

		// find the quotient
		System.out.println("Qotient of the program:" + (num1 / num2));

		// Find the remainder
		System.out.println("Remainder of the program :" + (num1 % num2));

	}

}
