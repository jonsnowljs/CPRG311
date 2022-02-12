package sorting;

import java.util.Comparator;
import shapes.Shape;

/**
 * Class for different kinds of sorts, BubbleSort, SelectionSort, InsertionSort,
 * MergeSort, QuickSort, HeapSort
 *
 * @author Jiasheng Lu, Hardish Chander, Desmond Yuen
 *
 */

public class AllSorts {

	/**
	 * Bubble sort method with a comparable array as parameter.
	 * 
	 * @param <T> This describes the array type. It's upper boundary is Comparable
	 * @param arr This is the array to be compared
	 */
	public static <T extends Comparable<? super T>> void bubbleSort(T[] arr) {
		int N = arr.length;
		for (int i = N - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	/**
	 * Bubble sort method using comparator as a way to compare the elements in
	 * the array.
	 * 
	 * @param <T>        This describes the array type.
	 * @param arr        This is the array to be compared
	 * @param comparator This is the way of the array is compared
	 */
	public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
		int N = arr.length;

		for (int i = N - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (comparator.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	/**
	 * Selection sort method with a comparable array as parameter.
	 * 
	 * @param <T> This describes the array type. It's upper boundary is Comparable
	 * @param arr This is the array to be compared
	 */
	public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {

		if (arr == null || arr.length <= 1) {
			return;
		}

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int small = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[small]) < 0) {
					small = j;
				}
			}

			T temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}
	}

	/**
	 * Selection sort method using comparator as a way to compare the elements in
	 * the array.
	 * 
	 * @param <T>        This describes the array type.
	 * @param arr        This is the array to be compared
	 * @param comparator This is the way of the array is compared
	 */
	public static <T extends Comparable<? super T>> void selectionSort(T[] arr, Comparator<T> comparator) {

		if (arr == null || arr.length <= 1) {
			return;
		}

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int small = i;

			for (int j = i + 1; j < n; j++) {
				if (comparator.compare(arr[j], arr[small]) < 0) {
					small = j;
				}
			}

			T temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}

	}

	/**
	 * Insertion sort method with a comparable array as parameter.
	 * 
	 * @param <T> This describes the array type. It's upper boundary is Comparable
	 * @param arr This is the array to be compared
	 */
	public static <T extends Comparable<? super T>> void insertionSort(T[] arr) {

		for (int i = 1; i < arr.length; i++) {
			T temp = arr[i];
			int j;
			for (j = i - 1; j >= 0 && temp.compareTo(arr[j]) < 0; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;

		}

	}

	/**
	 * Insertion sort method using comparator as a way to compare the elements in
	 * the array.
	 * 
	 * @param <T>        This describes the array type.
	 * @param arr        This is the array to be compared
	 * @param comparator This is the way of the array is compared
	 */
	public static <T extends Comparable<? super T>> void insertionSort(T[] arr, Comparator<T> comparator) {

		for (int i = 1; i < arr.length; i++) {
			T temp = arr[i];
			int j;
			for (j = i - 1; j >= 0 && comparator.compare(temp, arr[j]) < 0; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;

		}

	}

	/**
	 * Merge sort method with a comparable array as parameter. Sorts recursively.
	 * 
	 * @param <T> This describes the array type. It's upper boundary is Comparable
	 * @param arr This is the array to be compared
	 */
	public static <T extends Comparable<? super T>> void mergeSort(T[] arr) {
		if (arr == null) {
			return;
		}

		if (arr.length > 1) {
			int mid = arr.length / 2;

			// Split left part
			T[] left = (T[]) new Shape[mid];
			for (int i = 0; i < mid; i++) {
				left[i] = arr[i];
			}

			// Split right part
			T[] right = (T[]) new Shape[arr.length - mid];
			for (int i = mid; i < arr.length; i++) {
				right[i - mid] = arr[i];
			}

			mergeSort(left);
			mergeSort(right);

			int i = 0;
			int j = 0;
			int k = 0;

			// Merge left and right arrays
			while (i < left.length && j < right.length) {
				if (left[i].compareTo(right[j]) < 0) {
					arr[k] = left[i];
					i++;
				} else {
					arr[k] = right[j];
					j++;
				}
				k++;
			}
			// Collect remaining elements
			while (i < left.length) {
				arr[k] = left[i];
				i++;
				k++;
			}
			while (j < right.length) {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
	}

	/**
	 * Merge sort method using comparator as a way to compare the elements in
	 * the array. Sorts recursively.
	 * 
	 * @param <T>        This describes the array type.
	 * @param arr        This is the array to be compared
	 * @param comparator This is the way of the array is compared
	 */
	public static <T> void mergeSort(T[] arr, Comparator<T> comparator) {
		if (arr == null) {
			return;
		}

		if (arr.length > 1) {
			int mid = arr.length / 2;

			// Split left part
			T[] left = (T[]) new Shape[mid];
			for (int i = 0; i < mid; i++) {
				left[i] = arr[i];
			}

			// Split right part
			T[] right = (T[]) new Shape[arr.length - mid];
			for (int i = mid; i < arr.length; i++) {
				right[i - mid] = arr[i];
			}
			mergeSort(left, comparator);
			mergeSort(right, comparator);

			int i = 0;
			int j = 0;
			int k = 0;

			// Merge left and right arrays
			while (i < left.length && j < right.length) {
				if (comparator.compare(left[i], right[j]) < 0) {
					arr[k] = left[i];
					i++;
				} else {
					arr[k] = right[j];
					j++;
				}
				k++;
			}
			// Collect remaining elements
			while (i < left.length) {
				arr[k] = left[i];
				i++;
				k++;
			}
			while (j < right.length) {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
	}

	/**
	 * Quick sort method with a comparable array as parameter. Sorts recursively.
	 * 
	 * @param <T> This describes the array type. It's upper boundary is Comparable
	 * @param arr This is the array to be compared
	 */
	public static <T extends Comparable<? super T>> void quickSort(T[] arr) {
		int low = 0;
		int high = arr.length - 1;
		quickSorting(arr, low, high);
	}

	/**
	 * Quick sort partition method that splits the array.
	 * 
	 * @param arr  This is the array to be split
	 * @param low  lower bound of the split array
	 * @param high upper bound of the split array
	 */
	public static <T extends Comparable<? super T>> void quickSorting(T[] arr, int low, int high) {
		// check for empty or null array
		if (arr == null || arr.length == 0) {
			return;
		}

		if (low >= high) {
			return;
		}

		// Get the pivot element from the middle of the list
		int middle = low + (high - low) / 2;
		T pivot = arr[middle];

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			// Check until all values on left side array are lower than pivot
			while (arr[i].compareTo(pivot) < 0) {
				i++;
			}
			// Check until all values on left side array are greater than pivot
			while (arr[j].compareTo(pivot) > 0) {
				j--;
			}
			// Now compare values from both side of lists to see if they need swapping
			// After swapping move the iterator on both lists
			if (i <= j) {
				swapQuick(arr, i, j);
				i++;
				j--;
			}
		}
		// Do same operation as above recursively to sort two sub arrays
		if (low < j) {
			quickSorting(arr, low, j);
		}
		if (high > i) {
			quickSorting(arr, i, high);
		}
	}

	/**
	 * Quick sort method using comparator as a way to compare the elements in
	 * the array. Sorts recursively.
	 * 
	 * @param <T>        This describes the array type.
	 * @param arr        This is the array to be compared
	 * @param comparator This is the way of the array is compared
	 */
	public static <T> void quickSort(T[] arr, Comparator<T> comparator) {
		int low = 0;
		int high = arr.length - 1;
		quickSorting(arr, low, high, comparator);
	}

	/**
	 * Quick sort method that sorts the arrays split by Quick Sort Partition method
	 * 
	 * @param <T>        This describes the array type.
	 * @param arr        This is the array to be sorted
	 * @param low        lower bound of the array to be sorted
	 * @param high       upper bound of the array to be sorted
	 * @param comparator This is the way of the array is compared
	 */
	public static <T> void quickSorting(T[] arr, int low, int high, Comparator<T> comparator) {
		// check for empty or null array
		if (arr == null || arr.length == 0) {
			return;
		}

		if (low >= high) {
			return;
		}

		// Get the pivot element from the middle of the list
		int middle = low + (high - low) / 2;
		T pivot = arr[middle];

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			// Check until all values on left side array are lower than pivot
			while (comparator.compare(arr[i], pivot) < 0) {
				i++;
			}
			// Check until all values on left side array are greater than pivot
			while (comparator.compare(arr[j], pivot) > 0) {
				j--;
			}
			// Now compare values from both side of lists to see if they need swapping
			// After swapping move the iterator on both lists
			if (i <= j) {
				swapQuick(arr, i, j);
				i++;
				j--;
			}
		}
		// Do same operation as above recursively to sort two sub arrays
		if (low < j) {
			quickSorting(arr, low, j, comparator);
		}
		if (high > i) {
			quickSorting(arr, i, high, comparator);
		}
	}

	/**
	 * Method for quick sort to swap values after comparison
	 * 
	 * @param <T> This describes the array type.
	 * @param arr This is the array to be compared
	 * @param x   Value 1 to be compared
	 * @param y   Value 2 to be compared
	 */
	public static <T> void swapQuick(T[] arr, int x, int y) {
		T temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	/*
		Description:
		Heap sort can be divided into two parts: 1. Build up a heap 2. created a sorted array repeatedly removing the largest elements from the heap and inserting into the array
	
		Complexity analysis: 
		The average, best-case and worst-case time complexity of O(nlogn).
	*/
	/**
	 * This is Heap sort method with a comparable array as parameter.
	 * 
	 * @author Jiasheng Lu
	 * @param <T> This describes the array type. It's upper boundary is Comparable
	 * @param arr This is the array to be compared
	 */
	public static <T extends Comparable<? super T>> void heapSort(T[] arr) {
		int N = arr.length;

		// Build the heap
		for (int i = getParent(N); i >= 0; i--) {
			heapify(arr, N, i);
		}

		// subtract the heap tree
		for (int i = N - 1; i > 0; i--) {
			// swap the root to end node
			swap(arr, 0, i);

			// Heapify the tree after subtract
			heapify(arr, i, 0);
		}

	}

	/**
	 * This is Heap sort method use comparator as a way to compare the elements in
	 * the array.
	 * 
	 * @param <T>        This describes the array type.
	 * @param arr        This is the array to be compared
	 * @param comparator This is the way of the array is compared
	 */
	public static <T> void heapSort(T[] arr, Comparator<T> comparator) {
		int N = arr.length;

		// Build the heap
		for (int i = getParent(N); i >= 0; i--) {
			heapify(arr, N, i, comparator);
		}

		// subtract the heap tree
		for (int i = N - 1; i > 0; i--) {
			// swap the root to end node
			swap(arr, 0, i);

			// Heapify the tree after subtract
			heapify(arr, i, 0, comparator);
		}

	}

	/**
	 * Heapify the tree structure
	 *
	 * @param arr        This is the array to be compared
	 * @param n          The size of the tree
	 * @param i          The index of the root node
	 * @param comparator This is the way of the array is compared
	 */
	// Private methods for heap sort
	// Function to recursively heapify the tree with comparator.
	private static <T> void heapify(T[] arr, int n, int i, Comparator<T> comparator) {
		int largest = i;
		int left = getLeft(i);
		int right = getRight(i);

		// if left node is larger than root node, put left as the largest node, stop
		// when left is out the range of tree
		if (left < n && comparator.compare(arr[left], arr[largest]) > 0) {
			largest = left;
		}

		// If right node is larger than root node, put right as the largest node, stop
		// when left is out the range of tree
		if (right < n && comparator.compare(arr[right], arr[largest]) > 0) {
			largest = right;
		}

		// If largest is not root, swap it with the largest node, recursively call this
		// heapify method to heapify all the sub-tree
		if (largest != i) {
			swap(arr, i, largest);

			heapify(arr, n, largest, comparator);
		}
	}

	/**
	 * @param arr
	 * @param n
	 * @param i
	 */
	// Function to recursively heapify the tree with comparable.
	private static <T extends Comparable<? super T>> void heapify(T[] arr, int n, int i) {
		int largest = i;
		int left = getLeft(i);
		int right = getRight(i);

		// if left node is larger than root node, put left as the largest node, stop
		// when left is out the range of tree
		if (left < n && arr[left].compareTo(arr[largest]) > 0) {
			largest = left;
		}

		// If right node is larger than root node, put right as the largest node, stop
		// when left is out the range of tree
		if (right < n && arr[right].compareTo(arr[largest]) > 0) {
			largest = right;
		}

		// If largest is not root, swap it with the largest node, recursively call this
		// heapify method to heapify all the sub-tree
		if (largest != i) {
			swap(arr, i, largest);

			heapify(arr, n, largest);
		}
	}

	/**
	 * @param i
	 * @return int
	 */
	// Utility function to get the left node index of node i
	private static int getLeft(int i) {
		return (i * 2 + 1);
	}

	/**
	 * @param i
	 * @return int
	 */
	// Utility function to get the left node index of node i
	private static int getRight(int i) {
		return (i * 2 + 2);
	}

	/**
	 * @param i
	 * @return int
	 */
	// Utility function to get the parent index of node i
	private static int getParent(int i) {
		return i / 2 - 1;
	}

	// Utility function to swap two elements in array {@code arr} at index {@code i}
	// and {@code j}
	private static <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
