import java.util.Scanner;

public class PrintThrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Give a word: ");
		String word = scanner.nextLine();

		// Print the word 3 times consecutively without newlines or loops
		System.out.print(word + word + word);
		System.out.println();
	}
}