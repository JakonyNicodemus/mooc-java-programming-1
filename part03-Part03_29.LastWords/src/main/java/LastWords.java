import java.util.Scanner;

public class LastWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.nextLine();
			if (input.isEmpty()) {
				break;
			}

			String[] parts = input.split(" ");
			// Print the last element of the array using (length - 1)
			System.out.println(parts[parts.length - 1]);
		}
	}
}