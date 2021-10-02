import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void testArrayInsertion1() {
		int index = 0;
		int actualArray [] = {10, 2, 10, 2};
		Array array = new Array(); 
		Array.insert(10,0);
		Array.insert(2, 1);
		Array.insert(10,2);
		Array.insert(2, 3);
		for(int i = 0; i < Array.size; i++){
		assertEquals(Array.array[i], actualArray[i]);
		}
	}
	@Test
	public void testArrayInsertion2() {
		Array.insert(5, -1);
	}

	@Test
	public void testArrayInsertion3() {
		Array.insert(5, 101);
	}
	@Test
	public void testArrayDeletion1() {
		Array array = new Array(); 
		Array.insert(5, 0);
		Array.delete(0);
		assertNotEquals(Array.array[0], 5);
	}
	@Test
	public void testBubbleSort1() {
		int index = 0;
		int actualArray [] = {1, 2, 10, 20};
		Array array = new Array(); 
		Array.insert(10,0);
		Array.insert(20, 1);
		Array.insert(1,2);
		Array.insert(2, 3);
		Array.bubbleSort();
		for(int i = 0; i < Array.size; i++){
		assertEquals(Array.array[i], actualArray[i]);
		}
	}
	@Test
	public void testBubbleSort2() {
		int index = 0;
		int actualArray [] = {1, 10, 20, 20};
		Array array = new Array(); 
		Array.insert(10,0);
		Array.insert(20, 1);
		Array.insert(1,2);
		Array.insert(20, 3);
		Array.bubbleSort();
		for(int i = 0; i < Array.size; i++){
		assertEquals(Array.array[i], actualArray[i]);
		}
	}
	@Test
	public void testBinarySearch() {
		Array array = new Array(); 
		Array.insert(10,0);
		Array.insert(2, 1);
		Array.insert(1,2);
		Array.insert(20, 3);
		assertEquals(false, Array.binarySearch(200, 0, Array.size));
			
	}
	@Test
	public void testLinearSearch() {
		Array array = new Array(); 
		Array.insert(10,0);
		Array.insert(2, 1);
		Array.insert(1,2);
		Array.insert(20, 3);
		assertEquals(true, Array.linearSearch(10));
			
	}
	
}
