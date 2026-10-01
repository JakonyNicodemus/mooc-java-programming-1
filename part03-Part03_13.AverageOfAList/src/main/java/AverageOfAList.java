import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		while (true) {
			int input = Integer.parseInt(scanner.nextLine());
			if (input == -1) {
				break;
			}

			list.add(input);
		}

		// Calculate the sum of all elements
		int sum = 0;
		for (int number : list) {
			sum += number;
		}

		// Cast to double to prevent integer division truncation
		double average = (double) sum / list.size();

		System.out.println("Average: " + average);
	}
}