//Program :3 
// Find the output of the program System.out.println(9+6-3*4/2%5);

package OutputPrograms;

public class Program3 {

	public static void main(String[] args) {
		System.out.println(9 + 6 - 3 * 4 / 2 % 5);

		// priority *,/,%,+,-

		// Step 1 : Multiplication take place : 3*4=12
		// step 2: Division take place: 12/2 =6
		// Step 3: Module take place : 6%5=1
		// step 4: addition take place : 9+6 =15
		// step 5 : subtraction take place :15-1 =14
		// Answer : 14

	}

}
