import java.util.Arrays;

public class Task2 {
	private static void mergeSort(int[] array, int low, int high) {
		if (high <= low)
			return;
		int mid = (low + high) / 2;
		mergeSort(array, low, mid);
		mergeSort(array, mid + 1, high);
		merge(array, low, mid, high);
	}

	private static void merge(int[] array, int low, int mid, int high) {
		int leftArray[] = new int[mid - low + 1];
		int rightArray[] = new int[high - mid];
		for (int i = 0; i < leftArray.length; i++)
			leftArray[i] = array[low + i];
		for (int i = 0; i < rightArray.length; i++)
			rightArray[i] = array[mid + i + 1];
		int leftIndex = 0;
		int rightIndex = 0;
		for (int i = low; i < high + 1; i++) {
			if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
				if (leftArray[leftIndex] >= rightArray[rightIndex]) {
					array[i] = leftArray[leftIndex];
					leftIndex++;
				} else {
					array[i] = rightArray[rightIndex];
					rightIndex++;
				}
			} else if (leftIndex < leftArray.length) {
				array[i] = leftArray[leftIndex];
				leftIndex++;
			} else if (rightIndex < rightArray.length) {
				array[i] = rightArray[rightIndex];
				rightIndex++;
			}
		}
	}

	// sort by ascending order
	public static void quickSort(int[] array) {
		int low=0, high=array.length-1;
		quickSortHelper(array, low, high);
	}
	public static void quickSortHelper(int[] array, int low, int high) {
		
		if (low < high) {
            // idx is index of pivot element which is at its
            // sorted position
            int idx = partitionFirst(array, low, high);
 
            // Separately sort elements before
            // partition and after partition
            quickSortHelper(array, low, idx - 1);
            quickSortHelper(array, idx + 1, high);
        }
	}
	 // select pivot element based on the median of three strategy
	static int partitionFirst(int arr[], int low, int high)
    {
        // First element as pivot
        int pivot = arr[low];
        int st = low; // st points to the starting of array
        int end
            = high; // end points to the ending of the array
        int k = high;
        for (int i = high; i > low; i--) {
            if (arr[i] > pivot)
                swap(arr, i, k--);
        }
        swap(arr, low, k);
        // As we got pivot element index is end
        // now pivot element is at its sorted position
        // return pivot element index (end)
        return k;
    }
	static int partitionLast(int arr[], int low, int high)
    {
        // First element as pivot
        int pivot = arr[high];
        int st = low; // st points to the starting of array
        int end
            = high; // end points to the ending of the array
        int k = high;
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot)
                swap(arr, i, k++);
        }
        swap(arr, low, k);
        // As we got pivot element index is end
        // now pivot element is at its sorted position
        // return pivot element index (end)
        return k;
    }
 
    // Function to swap two elements
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

	private static int getPivot_MedianOfThree(int[] array) {
		// TODO
		return 0;
	}

	// select pivot element based on the first element in the array
	

	
	
	

	private static int getPivot_Random(int[] array) {
		// TODO
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 6, 3, 0, 12, 5 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		int[] arr2 = new int[] { 2, 4, 6, 3, 0, 12, 5 };
		quickSort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
