import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyStackTest {

	@Test(expected = Exception.class)
	public void A_testExceptionInPush() throws Exception {
		MyStack stack = new MyStack(2);
		stack.push(21);
		stack.push(33);
		stack.push(0);
	}
	@Test
	public void B_testPush() throws Exception {
		MyStack stack = new MyStack(3);
		int array[] = {21, 33, 0};
		stack.push(21);
		stack.push(33);
		stack.push(0);
		assertArrayEquals(stack.arraytostoreStack, array);
	}
	@Test
	public void C_testTop() throws Exception {
		MyStack stack = new MyStack(3);
		int array[] = {21, 33, 0};
		stack.push(21);
		stack.push(33);
		stack.push(0);
		int top = stack.top();
		assertEquals(0, top);
	}
	@Test (expected = Exception.class)
	public void D_testTop() throws Exception {
		MyStack stack = new MyStack(3);
		int top = stack.top();
	}
	@Test
	public void E_testPop() throws Exception {
		MyStack stack = new MyStack(3);
		int array[] = {21, 33};
		stack.push(21);
		stack.push(33);
		stack.push(0);
		stack.pop();
		stack.pop();
		for(int i = 0;i <= stack.topPointer; i++){
			assertEquals(stack.arraytostoreStack[i], array[i]);
		}
	}
	@Test (expected = Exception.class)
	public void F_testPop() throws Exception {
		MyStack stack = new MyStack(3);
		
		stack.push(21);
		stack.push(33);
		stack.push(0);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
	@Test 
	public void F_testSize() throws Exception {
		MyStack stack = new MyStack(3);
		
		stack.push(21);
		stack.push(33);
		stack.push(0);
		assertEquals(3, stack.size());
	}
	@Test 
	public void G_testMain()
	{
		StackImplementation.main(null);
	}
}


