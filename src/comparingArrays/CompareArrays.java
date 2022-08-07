package comparingArrays;

public class CompareArrays {

	void merge(int one[], int two[], int length) {

		// Will hold the sorted low and high values of the arrays
		int low[] = new int[length];
		int high[] = new int[length];

		// Compares the two arrays and places the numbers in the correct arrays
		for (int i = 0; i < length; i++) {
				if (one[i] > two[i]) {
					low[i] = two[i];
					high[i] = one[i];
				} else {
					low[i] = one[i];
					high[i] = two[i];
				}
			}
			display(low, high);
		}

		// Prints out the new sorted arrays
		void display(int low[], int high[]) {
			for (int i = 0; i < low.length; i++) {
				System.out.print(low[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < high.length; i++) {
				System.out.print(high[i] + " ");
			}
		}

		public static void main(String[] args) {
			int[] arrayOne = { 6, 2, 4 };
			int[] arrayTwo = { 3, 5, 1 };
			int arrayLength = arrayOne.length;
			CompareArrays obj = new CompareArrays();
			obj.merge(arrayOne, arrayTwo, arrayLength);
		}

	}



