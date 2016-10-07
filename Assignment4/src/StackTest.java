
public class StackTest {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);//overflow
		System.out.println(stack.pop());//10
		System.out.println(stack.pop());//9
		System.out.println(stack.pop());//8
		System.out.println(stack.pop());//7
		System.out.println(stack.pop());//6
		System.out.println(stack.pop());//5
		System.out.println(stack.pop());//4
		System.out.println(stack.pop());//3
		System.out.println(stack.pop());//2
		System.out.println(stack.pop());//1
		System.out.println(stack.pop());//underflow return null

	}

}
