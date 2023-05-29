//Program 15:
//	
//	java program which intakes 6 numbers as input and prints their average

package OutputPrograms;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int f1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		int f2 = scanner.nextInt();
		System.out.println("Enter the third number:");
		int f3 = scanner.nextInt();
		System.out.println("Enter the fourth number:");
		int f4 = scanner.nextInt();
		System.out.println("Enter the fiveth number:");
		int f5 = scanner.nextInt();
		System.out.println("Enter the sixth Number:");
		int f6 = scanner.nextInt();
		scanner.close();
		double Average = (f1 + f2 + f3 + f4 + f5 + f6) / 6;

		System.out.println("Average:" + Average);

	}

}
