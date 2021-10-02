import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListSTest {

	@Test
	public void testSwapNodes1() {
		int array[] = {14, 10, 12, 8};
		int index = 0;
		LinkedListS list = new LinkedListS();
		LinkedListS.pushFront(10);
		LinkedListS.pushBack(12);
		LinkedListS.pushFront(8);
		LinkedListS.pushBack(14);
		LinkedListS.swap();
		LinkedListS.display();
		LinkedListS.Node temp = LinkedListS.head;

		while(temp != null){
			assertEquals(temp.key, array[index]);
			index++;
			temp = temp.next;
		}
	}
	
	@Test
	public void testSwapNodes2() {
		int array[] = { 14, 12};
		int index = 0;
		
		LinkedListS list = new LinkedListS();
		LinkedListS.pushBack(12);
		LinkedListS.pushBack(14);
		LinkedListS.swap();
		LinkedListS.Node temp = LinkedListS.head;
		while(temp != null){
			assertEquals(temp.key, array[index]);
			index++;
			temp = temp.next;
		}

	}



	@Test
	public void testSwapNodes3() {
		LinkedListS list = new LinkedListS();
		LinkedListS.pushBack(12);
		LinkedListS.swap();
		assertEquals(LinkedListS.head.key, 12);
	}
	@Test
	public void testMain() {
		LinkedListS.main(null);
	}
}
