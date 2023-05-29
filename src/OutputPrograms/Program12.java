//Program 12:
//	Program of the perimeter of the circle
// 2pir 
package OutputPrograms;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {

		System.out.println("Enter the radius:");
		Scanner scanner = new Scanner(System.in);
		double Radius = scanner.nextDouble();
		scanner.close();

		System.out.println("Perimeter of the circle:" + (2 * Math.PI * Radius));
	}

}
