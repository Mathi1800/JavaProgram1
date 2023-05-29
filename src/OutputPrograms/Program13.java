//Program 13:
//	Power of the number

package OutputPrograms;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		System.out.println("Enter the Base:");
		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		int initalNumber = base;

		System.out.println("Enter the Power");
		int power = scanner.nextInt();
		scanner.close();
		for (int i = 1; i < power; i++) {

			base = initalNumber * base;

		}
		System.out.println(base);
	}

}
