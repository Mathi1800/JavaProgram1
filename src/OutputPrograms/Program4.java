// Program 4 :
//java program for intaking two numbers using scanner and printing their sum 

package OutputPrograms;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("First Number :");
		int firstNumber = scanner.nextInt();

		System.out.println("Second Number:");
		int secondNumber = scanner.nextInt();

		scanner.close();
		System.out.println("FirstNumber:" + firstNumber + "+" + "secondNumber :" + secondNumber + "is"
				+ (firstNumber + secondNumber));

	}

}
