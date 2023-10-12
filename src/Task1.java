import java.util.Arrays;

public class Task1 {
	public static void selectionSort(int[] array) {
		int temp;
		for (int i = 0; i <= array.length - 2; i++) {
			int minIndex=i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					minIndex=j;
				}
			}
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void bubbleSort(int[] array) {
		int temp;
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j=i;
			int B = array[i];
			while((j>0) && (array[j-1]<B)) {
				array[j] = array[j-1];
				j--;
			}
			array[j]=B;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		selectionSort(new int[] { 1, 2, 3 });
		bubbleSort(new int[] { 1, 2, 3 });
		insertionSort(new int[] { 1, 2, 3 });
	}

}
