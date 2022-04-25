package implement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utilities.BSTreeNode;
import utilities.TreeException;

class BSTreeTest {
	// Attributes for tests
	BSTree<Integer> intBST = new BSTree<Integer>();
	private int int0 = 0;
	private int int1 = 1;
	private int int2 = 2;
	private int int3 = 3;
	private int int4 = 4;
	BSTree<String> strBST = new BSTree<String>();
	private String str0 = "a";
	private String str1 = "b";
	private String str2 = "c";
	private String str3 = "d";
	private String str4 = "e";

	@BeforeEach
	void setUp() throws Exception {
		intBST.add(int2);
		intBST.add(int1);
		intBST.add(int3);
		strBST.add(str2);
		strBST.add(str1);
		strBST.add(str3);
	}

	@AfterEach
	void tearDown() throws Exception {
		intBST.clear();
		strBST.clear();
	}

	@Test
	public void testGetRoot() throws TreeException {
		strBST.clear();
		assertThrows(TreeException.class, () -> strBST.getRoot());
		assertEquals(2, intBST.getRoot().getData());
	}

	@Test
	public void testGetHeight() {
		assertEquals(2, intBST.getHeight());
	}

	@Test
	public void testSize() {
		assertThrows(NullPointerException.class, () -> intBST.add(null));
		assertEquals(3, strBST.size());
	}

	@Test
	public void testIsEmpty() {
		assertEquals(false, intBST.isEmpty());
	}

	@Test
	public void testClear() {
		intBST.clear();
		assertEquals(0, intBST.size());
	}

	@Test
	public void testContains() throws TreeException {
		strBST.clear();
		assertThrows(TreeException.class, () -> strBST.contains("c"));
		assertEquals(true, intBST.contains(2));
	}

	@Test
	public void testSearch() throws TreeException {
		strBST.clear();
		assertThrows(TreeException.class, () -> strBST.search("c"));
		assertEquals(2, intBST.search(2).getData());
	}

	@Test
	public void testAdd() {
		assertThrows(NullPointerException.class, () -> intBST.add(null));
		intBST.add(int4);
		assertEquals(4, intBST.size());
	}

	@Test
	public void testInorderIterator() {
		utilities.Iterator<Integer> intIterator = intBST.inorderIterator();
		int accual = intIterator.next();
		assertEquals(1, accual);
	}

	@Test
	public void testPreorderIterator() {
		utilities.Iterator<Integer> intIterator = intBST.preorderIterator();
		int accual = intIterator.next();
		assertEquals(2, accual);
	}

	@Test
	public void testPostorderIterator() {
		utilities.Iterator<Integer> intIterator = intBST.postorderIterator();
		int accual = intIterator.next();
		assertEquals(1, accual);
	}

}
