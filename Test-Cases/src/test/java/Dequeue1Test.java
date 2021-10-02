import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Dequeue1Test {

	@Test
	public void A_test() {
		Dequeue1 dequeue = new Dequeue1(5);
		int array[] = {10, 20, 30, 40, 21};
		dequeue.addLeft(10);
		dequeue.addLeft(20);
		dequeue.addLeft(30);
		dequeue.addLeft(40);
		dequeue.addLeft(21);
		assertArrayEquals(dequeue.array, array);
	}
	
	@Test
	public void B_test() {
		Dequeue1 dequeue = new Dequeue1(3);
		int array[] = {10, 20, 30};
		dequeue.addRight(30);
		dequeue.addRight(20);
		dequeue.addRight(10);
		assertArrayEquals(dequeue.array, array);
	}
	@Test
	public void C_test(){
		Dequeue1 dequeue = new Dequeue1(4);
		int array[] = {10, 32, 20, 30};
		dequeue.addRight(30);
		dequeue.addRight(20);
		dequeue.addLeft(10);
		dequeue.addLeft(32);	
		assertArrayEquals(dequeue.array, array);
	}
	@Test
	public void D_test(){
		DequeueI.main(null);
	}

}
