import static org.junit.Assert.*;

import org.junit.Test;

public class Queue2Test {

	@Test 
	public void A_testEnQueue1(){
		int actualArray[] = {1, 2, 0};
		int index = 0;
		Queue2 queue =  new Queue2();
		Queue2.enqueue(1);
		Queue2.enqueue(2);
		Queue2.enqueue(0);
		Queue2.Node temp = Queue2.head;
		while(temp != null)
		{
			assertEquals(temp.key, actualArray[index]);
			temp = temp.next;
			index++;
		}
	}
	@Test 
	public void B_testSize()  {
		Queue2 queue =  new Queue2();
		Queue2.enqueue(1);
		Queue2.enqueue(2);
		Queue2.enqueue(0);
		Queue2.enqueue(32);
		assertEquals(4, Queue2.size);
	}
	@Test 
	public void C_testDequeue()  {
		Queue2 queue =  new Queue2();
		Queue2.enqueue(1);
		Queue2.enqueue(2);
		Queue2.enqueue(0);
		Queue2.enqueue(32);
		Queue2.dequeue();
		Queue2.dequeue();
		Queue2.dequeue();
		assertEquals(32, Queue2.head.key);
	}
	@Test 
	public void D_testDequeue2()  {
		Queue2 queue =  new Queue2();
		Queue2.dequeue();
		assertEquals(null, Queue2.head);
	}
	@Test 
	public void testMain()
	{
		Queue2.main(null);
	}
}
