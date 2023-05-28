//Program : 6
//Multiplication table 

package OutputPrograms;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		System.out.println("Enter the value :");

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			int val = i * num;
			System.out.println(i + "*" + num + "=" + val);
		}
		scanner.close();
	}

}
