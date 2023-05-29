//Program :10
//Find the Area of the circle 

package OutputPrograms;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		System.out.println("Enter the radius:");
		Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();
		scanner.close();

		// Math.pi is the function of pi

		System.out.println("Area of the circle =" + (Math.PI * radius * radius));

	}

}
