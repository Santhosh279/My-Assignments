package week1.day2;

public class FindOddNumber {

	public static void main(String[] args) {
		// TODO Find odd number

		int number = 10;

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 1) {
				System.out.println("The number is odd " + i);
			} else {
				System.out.println("The number is Even " + i);

			}
		}

	}
}
