
public class AdvancedAstrology {

	public static void printStars(int number) {
		// part 1 of the exercise
		for (int i = 0; i < number; i++) {
			System.out.println("*");
		}
		System.out.println();
	}

	public static void printSpaces(int number) {
		// part 1 of the exercise
		for (int i = 0; i < number; i++) {
			System.out.println(" ");
		}
	}

	public static void printTriangle(int size) {
		// part 2 of the exercise
		for (int i = 0; i <= size; i++) {
			printSpaces(size - i);
			printStars(i);
		}
	}

	public static void christmasTree(int height) {
		// part 3 of the exercise
		for (int i = 0; i <= height; i++) {
			printSpaces(height - 1);
			printStars(2 * 1 - i);
		}
		for (int i = 0; i < 2; i++) {
			printSpaces(height - 2);
			printStars(3);
		}
	}

	public static void main(String[] args) {
		// The tests are not checking the main, so you can modify it freely.
		printSpaces(3);
		printStars(4);
		printTriangle(4);
		System.out.println("---");
		christmasTree(4);
		System.out.println("---");
		christmasTree(10);
	}
}
