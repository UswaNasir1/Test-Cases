import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Stack1Test {

		@Test
		public void A_testPush()  {
			Stack1 stack = new Stack1();
			int index = 0;
			int array[] = { 0, 33, 21};
			Stack1.push(21);
			Stack1.push(33);
			Stack1.push(0);
			Stack1.Node temp = Stack1.head;
			while(temp != null){
				assertEquals(temp.key, array[index]);
				index++;
				temp = temp.next;
			}
		}

		@Test
		public void B_testTop()  {
			Stack1 stack = new Stack1();
			int array[] = {21, 33, 0};
			Stack1.push(21);
			Stack1.push(33);
			Stack1.push(0);
			int top = Stack1.top();
			assertEquals(0, top);
		}
		@Test 
		public void C_testTop() {
			Stack1 stack = new Stack1();
			int top = Stack1.top();
			assertEquals(top, -1);
		}
		@Test
		public void D_testPop(){
			int index = 0;
			Stack1 stack = new Stack1();
			int array[] = {21, 33, 0};
			Stack1.push(21);
			Stack1.push(33);
			Stack1.push(0);
			int pop1 = Stack1.pop();
			int pop2 = Stack1.pop();
			Stack1.Node temp = Stack1.head;
			assertEquals (pop1, 0);
			assertEquals (pop2, 33);
			while(temp != null){
				assertEquals(temp.key, array[index]);
				index++;
				temp = temp.next;
			}
		}
		@Test 
		public void E_testPop()  {
			Stack1 stack = new Stack1();
			
			Stack1.push(21);
			Stack1.push(33);
			Stack1.push(0);
			int pop1 = Stack1.pop();
			int pop2 = Stack1.pop();
			int pop3 = Stack1.pop();
			int pop4 = Stack1.pop();
			assertEquals(pop1, 0);
			assertEquals(pop2, 33);
			assertEquals(pop3, 21);
			assertEquals(pop4, -1);
		}
		
		@Test 
		public void F_testSize() {
			Stack1 stack = new Stack1();
			
			Stack1.push(21);
			Stack1.push(33);
			Stack1.push(0);
			assertEquals(3, stack.getSize());
		}
		@Test 
		public void testMain() {
			Stack1.main(null);
		}
}

