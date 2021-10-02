import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayDeletionTest {

	@Test
	public void testDeletion1() {
		int array[] = {1, 2, 6, 8};
		int expectedArray[] = {1, 6, 8, -1}; 
		
		array = ArrayDeletion.delete(array,1);
		for(int i = 0; i < array.length; i++){
			assertEquals(expectedArray[i], array[i]);
		}
	}
	@Test
	public void testDeletion2() {
		int array[] = {};
		int expectedArray[] = {}; 
		
		array = ArrayDeletion.delete(array,0);
		assertArrayEquals(expectedArray, array);
	}
	@Test
	public void testDeletion3() {
		int array[] = {1, 2, 3};
		int expectedArray[] = {1, 2, 3}; 
		
		array = ArrayDeletion.delete(array,3);
		assertArrayEquals(expectedArray, array);
	}
	@Test
	public void testMain() {
	ArrayDeletion.main(null);
	}
}
