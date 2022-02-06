package sorting;

import compareInterface.BaseAreaComp;
import compareInterface.VolumeComp;
import shapes.Shape;

public class AllSorts {
	public static <T extends Comparable<? super T>> void bubbleSort(T[] arr, char command) {

		int N = arr.length;

		switch (Character.toUpperCase(command)) {
		case 'H':
			for (int i = N - 1; i > 0; --i) { // i >= 0 --> OK
				for (int j = 0; j < i; ++j) {
					if (arr[j].compareTo(arr[j + 1]) > 0) {
						T temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			break;

		case 'A':
			for (int i = N - 1; i > 0; --i) { // i >= 0 --> OK
				for (int j = 0; j < i; ++j) {
					BaseAreaComp baseAreaComp = new BaseAreaComp((Shape) arr[j], (Shape) arr[j + 1]);
					if (baseAreaComp.IfSwap()) {
						T temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			break;

		case 'V':
			for (int i = N - 1; i > 0; --i) { // i >= 0 --> OK
				for (int j = 0; j < i; ++j) {
					VolumeComp baseAreaComp = new VolumeComp((Shape) arr[j], (Shape) arr[j + 1]);
					if (baseAreaComp.IfSwap()) {
						T temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			break;

		default:
			System.out.println("Invalid Input");
			System.out.println(
					"Please use -TH for height comparison, -TA for base area comparison and -TV for volume comparison");
		}

	}

//	Desmond
	public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {
		// test
	}

	public static <T extends Comparable<? super T>> void insertionSort(T[] arr) {

	}

//Hardish
	public static <T extends Comparable<? super T>> void mergeSort(T[] arr, char command) {
		int N = arr.length;
		
		int mid = N / 2;
	    T[] l = (T[])new Object[mid];
	    T[] r = (T[])new Object[N - mid];

		switch (Character.toUpperCase(command)) {
		case 'H':
			for (int i = 0; i < mid; i++) {
		        l[i] = arr[i];
		    }
		    for (int i = mid; i < N; i++) {
		        r[i - mid] = arr[i];
		    }
		    mergeSort(l, mid);
		    mergeSort(r, N - mid);

		    merge(arr, l, r, mid, N - mid);
		
			break;

		case 'A':
			
			break;
			
		case 'V':
			
			break;
		
		default:
			System.out.println("Invalid Input");
			System.out.println("Please use -TH for height comparison, -TA for base area comparison and -TV for volume comparison");
		}
		
	}
	
	public static void merge(
			  int[] arr, int[] l, int[] r, int left, int right) {
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            arr[k++] = l[i++];
			        }
			        else {
			            arr[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        arr[k++] = l[i++];
			    }
			    while (j < right) {
			        arr[k++] = r[j++];
			    }
			}

	public static <T extends Comparable<? super T>> void quickSort(T[] arr) {

	}

//Jiasheng
	public static <T extends Comparable<? super T>> void Sort(T[] arr) {

	}

}
