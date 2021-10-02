import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {	
	@Test
	public void testInsertionInLL1() {
		int array[] = {8, 10, 12, 14};
		int index = 0;
		LinkedList list = new LinkedList();
		LinkedList.pushFront(10);
		LinkedList.pushBack(12);
		LinkedList.pushFront(8);
		LinkedList.pushBack(14);
		LinkedList.display();
		LinkedList.Node temp = LinkedList.head;

		while(temp != null){
			assertEquals(temp.key, array[index]);
			index++;
			temp = temp.next;
		}
	}
	
	@Test
	public void testInsertionInLL2() {
		int array[] = {50, 12, 14};
		int index = 0;
		
		LinkedList list = new LinkedList();
		LinkedList.pushBack(12);
		LinkedList.pushBack(14);
		LinkedList.pushFront(50);
		LinkedList.Node temp = LinkedList.head;
		while(temp != null){
			assertEquals(temp.key, array[index]);
			index++;
			temp = temp.next;
		}

	}



	@Test
	public void testInsertionInLL3() {
		LinkedList list = new LinkedList();
		
		assertEquals(LinkedList.head , null);
	}

	@Test
	public void testDeletionInLL1() {
		
		LinkedList list = new LinkedList();
		LinkedList.pushBack(1);
		LinkedList.pushFront(12);
		LinkedList.pushBack(2);
		LinkedList.popBack();
		LinkedList.popBack();
		assertEquals(LinkedList.head.key, 12);
	}
	
	@Test
	public void testDeletionInLL2() {
		
		LinkedList list = new LinkedList();
		LinkedList.pushFront(1);
		LinkedList.pushFront(12);
		LinkedList.pushFront(2);
		LinkedList.popFront();
		LinkedList.popFront();
		assertEquals(LinkedList.head.key, 1);
	}
	
	@Test
	public void testDeletionInLL3() {
		
		LinkedList list = new LinkedList();
		LinkedList.pushFront(1);
		LinkedList.pushFront(12);
		LinkedList.pushFront(2);
		LinkedList.popFront();
		LinkedList.popBack();
		assertEquals(LinkedList.head.key, 12);
	}

	@Test
	public void testPop() {
		
		LinkedList list = new LinkedList();
		int array[] = {1, 12};
		int index = 0;
		LinkedList.pushFront(1);
		LinkedList.pushFront(12);
		LinkedList.pushFront(2);
		LinkedList.pop(2);
		LinkedList.Node temp = LinkedList.head;
		while(temp != null){
			assertEquals(temp.key, array[index]);
			index++;
			temp = temp.next;
		}
	}
	@Test
	public void testMain() {
		LinkedList list = new LinkedList();
		LinkedList.main(null);
	}
		
}

