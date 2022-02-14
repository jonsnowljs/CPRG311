/**
 * 
 */
package sorting;


import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import compare_interface.VolumeComp;
import shapes.*;

/**
 * @author Chinedu Alake
 *
 */
public class AllSortsTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link sorting.AllSorts#bubbleSort(T[])}.
	 * @param <T>
	 */
	@Test
	public void testBubbleSortTArray() {
		Cone c1 = new Cone(10, 25);
		Cylinder cy1 = new Cylinder(10, 5);
		Cylinder cy2 = new Cylinder(25, 7);
		Cone c2 = new Cone(25, 5);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
		
//		AllSorts sortB = new AllSorts();
		
		Shape [] expected = {c2,cy1,cy2,c1};
		
		AllSorts.bubbleSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
		
		
     }


	/**
	 * Test method for {@link sorting.AllSorts#bubbleSort(T[], java.util.Comparator)}.
	 */
	@Test
	public void testBubbleSortTArrayComparatorOfT() {
		Cone c1 = new Cone(10, 25);
		Cylinder cy1 = new Cylinder(10, 5);
		Cylinder cy2 = new Cylinder(25, 7);
		Cone c2 = new Cone(25, 5);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
		
		Shape [] expected = {c2,cy1,cy2,c1};
		
		AllSorts.bubbleSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

	/**
	 * Test method for {@link sorting.AllSorts#selectionSort(T[])}.
	 */
	@Test
	public void testSelectionSortTArray() {
		Cone c1 = new Cone(5, 10);
		Cylinder cy1 = new Cylinder(20, 25);
		Cylinder cy2 = new Cylinder(50, 15);
		Cone c2 = new Cone(12, 20);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
			
		Shape [] expected = {c1,c2,cy2,cy1};
		
		AllSorts.selectionSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

	/**
	 * Test method for {@link sorting.AllSorts#selectionSort(T[], java.util.Comparator)}.
	 */
	@Test
	public void testSelectionSortTArrayComparatorOfT() {
		Cone c1 = new Cone(5, 10);
		Cylinder cy1 = new Cylinder(20, 25);
		Cylinder cy2 = new Cylinder(50, 15);
		Cone c2 = new Cone(12, 20);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
			
		Shape [] expected = {c1,c2,cy2,cy1};
		
		AllSorts.selectionSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

	/**
	 * Test method for {@link sorting.AllSorts#insertionSort(T[])}.
	 */
	@Test
	public void testInsertionSortTArray() {
		Cone c1 = new Cone(5, 10);
		Cylinder cy1 = new Cylinder(20, 25);
		Cylinder cy2 = new Cylinder(50, 15);
		Cone c2 = new Cone(12, 20);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
			
		Shape [] expected = {c1,c2,cy2,cy1};
		
		AllSorts.selectionSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

	/**
	 * Test method for {@link sorting.AllSorts#insertionSort(T[], java.util.Comparator)}.
	 */
	@Test
	public void testInsertionSortTArrayComparatorOfT() {
		Cone c1 = new Cone(5, 10);
		Cylinder cy1 = new Cylinder(20, 25);
		Cylinder cy2 = new Cylinder(50, 15);
		Cone c2 = new Cone(12, 20);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
			
		Shape [] expected = {c1,c2,cy2,cy1};
		
		AllSorts.selectionSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

	/**
	 * Test method for {@link sorting.AllSorts#mergeSort(T[])}.
	 */
	@Test
	public void testMergeSortTArray() {
		Cone c1 = new Cone(15, 25);
		Cylinder cy1 = new Cylinder(3, 10);
		Cylinder cy2 = new Cylinder(50, 10);
		Cone c2 = new Cone(22, 5);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
			
		Shape [] expected = {c2,cy1,c1,cy2};
		
		AllSorts.mergeSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

	/**
	 * Test method for {@link sorting.AllSorts#mergeSort(T[], java.util.Comparator)}.
	 */
	@Test
	public void testMergeSortTArrayComparatorOfT() {
		Cone c1 = new Cone(15, 25);
		Cylinder cy1 = new Cylinder(3, 10);
		Cylinder cy2 = new Cylinder(50, 10);
		Cone c2 = new Cone(22, 5);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
			
		Shape [] expected = {c2,cy1,c1,cy2};
		
		AllSorts.mergeSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

	/**
	 * Test method for {@link sorting.AllSorts#quickSort(T[])}.
	 */
	@Test
	public void testQuickSortTArray() {
		Cone c1 = new Cone(20, 50);
		Cylinder cy1 = new Cylinder(10, 25);
		Cylinder cy2 = new Cylinder(7, 30);
		Cone c2 = new Cone(26, 10);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
			
		Shape [] expected = {c2,cy1,cy2,c1};
		
		AllSorts.quickSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

	/**
	 * Test method for {@link sorting.AllSorts#quickSorting(T[], int, int)}.
	 */
	@Test
	public void testQuickSortingTArrayIntInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sorting.AllSorts#quickSort(T[], java.util.Comparator)}.
	 */
	@Test
	public void testQuickSortTArrayComparatorOfT() {
		Cone c1 = new Cone(20, 50);
		Cylinder cy1 = new Cylinder(10, 25);
		Cylinder cy2 = new Cylinder(7, 30);
		Cone c2 = new Cone(26, 10);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
			
		Shape [] expected = {c2,cy1,cy2,c1};
		
		AllSorts.quickSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

	/**
	 * Test method for {@link sorting.AllSorts#quickSorting(T[], int, int, java.util.Comparator)}.
	 */
	@Test
	public void testQuickSortingTArrayIntIntComparatorOfT() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sorting.AllSorts#swapQuick(T[], int, int)}.
	 */
	@Test
	public void testSwapQuick() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sorting.AllSorts#heapSort(T[])}.
	 */
	@Test
	public void testHeapSortTArray() {
		Cone c1 = new Cone(8, 20);
		Cylinder cy1 = new Cylinder(17, 10);
		Cylinder cy2 = new Cylinder(35, 5);
		Cone c2 = new Cone(20, 5);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
			
		Shape [] expected = {c2,cy2,c1,cy1};
		
		AllSorts.heapSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

	/**
	 * Test method for {@link sorting.AllSorts#heapSort(T[], java.util.Comparator)}.
	 */
	@Test
	public void testHeapSortTArrayComparatorOfT() {
		Cone c1 = new Cone(8, 20);
		Cylinder cy1 = new Cylinder(17, 10);
		Cylinder cy2 = new Cylinder(35, 5);
		Cone c2 = new Cone(20, 5);
		
		Shape[] shapes = {c1, cy1, cy2, c2};
		
		Comparator<Shape> calcVolume = new VolumeComp();
			
		Shape [] expected = {c2,cy2,c1,cy1};
		
		AllSorts.heapSort(shapes, calcVolume);
		
		assertArrayEquals(expected, shapes);
	}

}
