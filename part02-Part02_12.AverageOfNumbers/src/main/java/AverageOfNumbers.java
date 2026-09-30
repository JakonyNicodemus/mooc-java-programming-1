
import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		double average = 0;
		while (true) {
			System.out.println("Give a number:");
			int number = Integer.valueOf(scanner.nextLine());
			if (number == 0) {
				break;
			}
			if (number != 0) {
				sum = sum + number;
				num = num + 1;
				average = (double) sum / num;
			}
		}
		System.out.println("Average of the numbers: " + average);

	}
}
