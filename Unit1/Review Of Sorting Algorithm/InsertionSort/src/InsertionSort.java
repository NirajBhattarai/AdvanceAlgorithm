
public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers = { 5, 1, 4, 10, 9 };

		System.out.println("Before Sorting");
		for (int value : numbers) {
			System.out.print(value);
			System.out.print(" ");
		}
		insertionSort(numbers);
		System.out.println();

		System.out.println("After Sorting");
		for (int value : numbers) {
			System.out.print(value);
			System.out.print(" ");
		}
	}

	static void insertionSort(int[] numbers) {

		for (int i = 1; i < numbers.length; i++) {

			int j = i - 1;
			int key = numbers[i];

			while (j >= 0 && numbers[j] > key) {
				numbers[j + 1] = numbers[j];
				j = j - 1;
			}
			numbers[j + 1] = key;

		}
	}

}
