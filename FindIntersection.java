package homeAssignment.day3;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// Compare both the arrays using a conditional statement

		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println("first array  "+ a[i]);
				}
			}
		}

	}

}
