package sorting;

import compareInterface.BaseAreaComp;
import shapes.Shape;

public class AllSorts {	
	public static void bubbleSort(Shape[] arr, String command) {
		
	 int N = arr.length;
	  for (int i = N - 1; i > 0; --i) { // i >= 0 --> OK
	    for (int j = 0; j < i; ++j) {
	      if (arr[j].compareTo(arr[j + 1]) > 0) {
              Shape temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
	      }
	    }
	  }
	  

	  for (int i = N - 1; i > 0; --i) { // i >= 0 --> OK
	    for (int j = 0; j < i; ++j) {
	      if (BaseAreaComp.compare(arr[j], arr[j+1]) > 0) {
              Shape temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
	      }
	    }
	  }
	  
	  
	}
	
	public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {
		
	}
	public static <T extends Comparable<? super T>> void insertionSort(T[] arr) {
		
	}
	public static <T extends Comparable<? super T>> void mergeSort(T[] arr) {
		
	}
	public static <T extends Comparable<? super T>> void quickSort(T[] arr) {
		
	}
	public static <T extends Comparable<? super T>> void Sort(T[] arr) {
		
	}
}
