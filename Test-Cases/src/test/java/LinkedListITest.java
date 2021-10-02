import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LinkedListITest {
	
	
	@Test
	public void A_testAddNodes()  {
		int array[] = {5, 1, 6, 4};
		int index = 0;
		LinkedListI list = new LinkedListI();
		list.add(1);
		list.pushFront(5);
		list.pushBack(6);
		list.add(4);
		LinkedListI temp =  LinkedListI.headPointer;
		while(temp != null)
		{
			assertEquals(temp.data, array[index]);
			index++;
			temp = temp.nextPointer;
		}
	
	}
	@Test
	public void B_TestSize() {
		LinkedListI list = new LinkedListI();
		int size = list.size();
		assertEquals(4, size);
	}
	
	@Test
	public void C_testTopBack() throws Exception {
		LinkedListI list = new LinkedListI();
		int actualValue = list.topBack();
		assertEquals(4, actualValue);
	}
	
	@Test
	public void D_testTopFront() throws Exception {
		LinkedListI list = new LinkedListI();
		int actualValue = list.topFront();
		assertEquals(5, actualValue);
	}
	@Test
	(expected = Exception.class)
	public void E_testPopException()  throws Exception {
		LinkedListI list = new LinkedListI();
		list.popFront();
		list.popFront();
		list.popFront();
		list.popFront();
		list.popFront();
	}
	@Test
	(expected = Exception.class)
	public void F_testTopFrontException4() throws Exception {
		LinkedListI list = new LinkedListI();
		int data = list.topFront();
	}

	@Test
	(expected = Exception.class)
	public void G_testTopBackException5() throws Exception {
		LinkedListI list = new LinkedListI();
		int data = list.topBack();
	}
	@Test 
	public void testMain()
	{
		LinkedListImplementation.main(null);
	}
	
}