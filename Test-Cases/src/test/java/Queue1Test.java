import static org.junit.Assert.*;

import org.junit.Test;

public class Queue1Test {

	@Test
	public void A_testEnqueue() {
		Queue queue = new Queue(3);
		int array[] = {1, 4, 5};
		Queue1.enqueue(1);
		Queue1.enqueue(4);
		Queue1.enqueue(5);
		Queue1.enqueue(10);	
		for(int i = Queue1.removePointer; i < Queue1.size + Queue1.removePointer; i++){
			assertEquals(Queue1.array[i], array[i] );
		}
	}
	@Test 
	public void B_testDeQueue1() {
		Queue1 queue =  new Queue1(3);
		Queue1.enqueue(1);
		Queue1.enqueue(22);
		Queue1.enqueue(3);
		Queue1.dequeue();
		Queue1.dequeue();
		Queue1.dequeue();
		Queue1.dequeue();
		for(int i=Queue1.removePointer; i < Queue1.size+Queue1.removePointer;i++){
			assertEquals(Queue1.array[i], null);
		}
	}

	
}
