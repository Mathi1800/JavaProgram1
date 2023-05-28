//Program : 9

//Given character is a vowel or not 

package OutputPrograms;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character :");
		char name = scanner.next().charAt(0);
		scanner.close();
		switch (name) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(name + "It is a vowel ");
			break;
		default:
			System.out.println(name + " " + "It is a constant");
		}
	}
}
