package sorting;

import java.util.Comparator;

import compareInterface.BaseAreaComp;
import compareInterface.VolumeComp;
import shapes.Shape;

public class AllSorts {
	/**
	 * bubble sort for comparable array
	 * 
	 * @param <T>
	 * @param arr
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
	 * bubble sort for comparable array and comparator
	 * 
	 * @param <T>
	 * @param arr
	 * @param comparator
	 */
	public static <T extends Comparable<? super T>> void bubbleSort(T[] arr, Comparator<T> comparator) {
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

//	Desmond
	public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {

		if (arr == null || arr.length <= 1) {
			return;
		}

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int small = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[small] < 0)) {
					small = j;
				}
			}

			int temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}
	}

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

			int temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}

	}

	public static <T extends Comparable<? super T>> void insertionSort(T[] ar, Comparator<T> comparatorr) {

	}

	/**
	 * merge sorting using comparable
	 * 
	 * @param <T>
	 * @param arr
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
	 * merge sorting using comparator
	 * 
	 * @param <T>
	 * @param arr
	 * @param comparator
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

	public static <T extends Comparable<? super T>> void quickSort(T[] arr, Comparator<T> comparator) {

	}

//Jiasheng
	public static <T extends Comparable<? super T>> void Sort(T[] arr, Comparator<T> comparator) {

	}

}
