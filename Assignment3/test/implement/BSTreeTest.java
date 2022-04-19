package implement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

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
	public void testAdd() {
		assertThrows(NullPointerException.class, () -> intBST.add(null));
		assertEquals(3, intBST.size());
	}

}
