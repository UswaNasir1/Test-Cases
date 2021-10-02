import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class StackTest {
		@Test
		public void A_testPush() {
			int array[] = {21, 33, 0};
			Stack stack = new Stack();
			Stack.push(21);
			Stack.push(33);
			Stack.push(0);
			for(int i = 0; i < Stack.size; i++){
				assertEquals(Stack.array[i], array[i]);
			}
		}
		@Test
		public void B_testPush() {
			Stack stack = new Stack();
			for(int i = 0; i < 101; i++)
			{
				Stack.push(21);
			}
			for(int i = 0; i < 100; i++){
			assertEquals(Stack.array[i], 21);
			}
		}

		@Test
		public void C_testPop() {
			Stack stack = new Stack();
			Stack.pop();
			assertEquals(Stack.addPointer, 0);
		}
		
		@Test 
		public void D_testPop()  {
			Stack stack = new Stack();
			Stack.push(11);
			int pop = Stack.pop();
			assertEquals(pop, 11);
		}
		@Test 
		public void E_testAfterPop()  {
			Stack stack = new Stack();
			Stack.push(11);
			int pop = Stack.pop();
			assertNotEquals(Stack.array[0], 11);
		}
		@Test 
		public void testMain()  {
			Stack.main(null);
		}
}
