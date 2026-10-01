import java.util.Scanner;

public class LineByLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.nextLine();

			// Halt when an empty string is entered
			if (input.equals("")) {
				break;
			}

			// Split the input string by whitespace
			String[] parts = input.split(" ");

			// Print each part on its own line
			for (String part : parts) {
				System.out.println(part);
			}
		}
	}
}