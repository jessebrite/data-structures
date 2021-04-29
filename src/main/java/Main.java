public class Main {
	public static void main(String[] args) {
		Stack<String> stack = new StackLinkedList<>();

//		System.out.println(stack);

		stack.push("Togo");
		stack.push("Cameroon");
		stack.push("Pakistan");
		stack.push("Iran");
		stack.push("Ethiopia");
		System.out.println(stack);

		System.out.println(stack.peek());

		stack.pop();
		System.out.println(stack);
		stack.peek();
	}
}
