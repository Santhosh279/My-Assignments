package homeAssignment.day3;

import java.util.Arrays;

public class FindingMissingelement {

	public static void main(String[] args) {
		// Compare both the arrays using a conditional statement

		// TODO Auto-generated method stub
				int array[] = {1, 4,3,2,8, 6, 7};
				
				Arrays.sort(array);
				
				for (int i = 0; i < array.length; i++) {
					 
					if(array[i] != i+1) {
						System.out.println(i+1);
						break;
				}
			}
		}

	}


