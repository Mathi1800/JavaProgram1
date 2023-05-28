//Program 7:
//java program to check whether the giver year is leap year or not ?

//case 1 : if the given year divisible 4 remainder would be zero and the given year 
//divisible by 100 remainder not equal to 0 ;

//case 2 : if the given year is divisible by4 and the remainder would be 0 then the given number 
//is divisible by 100 , the remainder is 0 then then given year is divisible by 400 , the reminder 
//is zero then it is leap year 

package OutputPrograms;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year:");
//  if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		int y = scanner.nextInt();

		if ((y % 4 == 0) && (y % 100 != 0)) {
			System.out.println(y + "It is a leap year");
		} else {
			if ((y % 4 == 0) && (y % 100 == 0) && (y % 400 == 0)) {
				System.out.println(y + "It is a leap year");
			} else {
				System.out.println(y + " " + "It is not a  leap year");
			}
		}
		scanner.close();
	}

}
