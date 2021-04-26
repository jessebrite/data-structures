public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new StackArray<>();

		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(40);
		System.out.println(stack);

		System.out.println(stack.peek());

		stack.pop();
		System.out.println(stack);
		stack.peek();
	}

}
