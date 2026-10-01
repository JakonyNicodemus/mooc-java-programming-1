
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// implement here a program that reads user input
		// until the user enters 9999

		// after that, the program prints the smallest number
		// and its index -- the smallest number
		// might appear multiple times
		ArrayList<Integer> list = new ArrayList<>();

		while (true) {
			int input = Integer.parseInt(scanner.nextLine());
			if (input == 9999) {
				break;
			}

			list.add(input);
		}

		// 1. Find the smallest number
		int smallest = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			int number = list.get(i);
			if (number < smallest) {
				smallest = number;
			}
		}

		System.out.println("Smallest number: " + smallest);

		// 2. Find and print all indices where the smallest number occurs
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == smallest) {
				System.out.println("Found at index: " + i);
			}
		}

	}
}
