import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String longestName = "";
		int sumOfBirthYears = 0;
		int count = 0;

		while (true) {
			String input = scanner.nextLine();
			if (input.isEmpty()) {
				break;
			}

			String[] parts = input.split(",");
			String name = parts[0];
			int birthYear = Integer.parseInt(parts[1]);

			// Track longest name using length comparison
			if (name.length() > longestName.length()) {
				longestName = name;
			}

			// Accumulate sum and count for average calculation
			sumOfBirthYears += birthYear;
			count++;
		}

		System.out.println("Longest name: " + longestName);

		if (count > 0) {
			// Cast sum to double for decimal division
			double average = (double) sumOfBirthYears / count;
			System.out.println("Average of the birth years: " + average);
		}
	}
}