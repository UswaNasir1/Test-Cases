import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayInsertionTest {
	
	@Test
	public void testArrayInsertion1() {
		int actualArray[] = {1, 2, 3, 4};
		int expectedArray[] = {5, 1, 2, 3};
		assertArrayEquals(expectedArray, ArrayInsertion.insert(actualArray, 5, 0));
	}
	@Test
	public void testArrayInsertion2() {
		int actualArray[] = {1, 2, 3, 4};
		int expectedArray[] = {1, 2, 3, 5};
		assertArrayEquals(expectedArray, ArrayInsertion.insert(actualArray, 5, 3));
	}
	
	@Test
	public void testArrayInsertion3() {
		int actualArray[] = {1, 2, 3, 4};
		ArrayInsertion.insert(actualArray, 5, -1);
	}

	@Test
	public void testArrayInsertion4() {
		int actualArray[] = {1, 2, 3, 4};
		ArrayInsertion.insert(actualArray, 5, 4);
	}
	@Test
	public void testArrayInsertion5() {
		int actualArray[] = {1, 2, 3};
		int expectedArray[] = {1, 2, 5};
		assertArrayEquals(expectedArray, ArrayInsertion.insert(actualArray, 5, 2));
	}

	@Test
	public void testArrayInsertionMain6() {
		ArrayInsertion.main(null);
		}

}
