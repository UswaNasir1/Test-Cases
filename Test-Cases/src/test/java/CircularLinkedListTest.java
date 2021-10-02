import static org.junit.Assert.*;

import org.junit.Test;

public class CircularLinkedListTest {

	@Test
	public void testInsertionInCLL1() {
		int array[] = {8, 10, 12, 14};
		int index = 0;
		CircularLinkedList list = new CircularLinkedList();
		CircularLinkedList.pushFront(10);
		CircularLinkedList.pushBack(12);
		CircularLinkedList.pushFront(8);
		CircularLinkedList.pushBack(14);
		CircularLinkedList.Node temp = CircularLinkedList.head;

		while(temp.next != CircularLinkedList.head){
			assertEquals(temp.key, array[index]);
			index++;
			temp = temp.next;
		}
	}
	
	@Test
	public void testInsertionInCLL2() {
		int array[] = {50, 12, 14};
		int index = 0;
		
		CircularLinkedList list = new CircularLinkedList();
		CircularLinkedList.pushBack(12);
		CircularLinkedList.pushBack(14);
		CircularLinkedList.pushFront(50);
		CircularLinkedList.Node temp = CircularLinkedList.head;
		while(temp.next != CircularLinkedList.head){
			assertEquals(temp.key, array[index]);
			index++;
			temp = temp.next;
		}

	}



	@Test
	public void testInsertionInCLL3() {
		CircularLinkedList list = new CircularLinkedList();
		
		assertEquals(CircularLinkedList.head , null);
	}

	@Test
	public void testDeletionInCLL1() {
		
		CircularLinkedList list = new CircularLinkedList();
		CircularLinkedList.pushBack(1);
		CircularLinkedList.pushFront(12);
		CircularLinkedList.pushBack(2);
		CircularLinkedList.popBack();
		CircularLinkedList.popBack();
		assertEquals(CircularLinkedList.head.key, 12);
	}
	
	@Test
	public void testDeletionInCLL2() {
		
		CircularLinkedList list = new CircularLinkedList();
		CircularLinkedList.pushFront(1);
		CircularLinkedList.pushFront(12);
		CircularLinkedList.pushFront(2);
		CircularLinkedList.popFront();
		CircularLinkedList.popFront();
		assertEquals(CircularLinkedList.head.key, 1);
	}
	
	@Test
	public void testDeletionInCLL3() {
		
		CircularLinkedList list = new CircularLinkedList();
		CircularLinkedList.pushFront(1);
		CircularLinkedList.pushFront(12);
		CircularLinkedList.pushFront(2);
		CircularLinkedList.popFront();
		CircularLinkedList.popBack();
		assertEquals(CircularLinkedList.head.key, 12);
	}
	
	@Test
	public void testMain() {
		CircularLinkedList.main(null);
	}
		
}
