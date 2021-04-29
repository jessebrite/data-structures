public interface Stack<T> {
	// remove element from stack
	T pop();

	// add element to stack
	void push(T element);

	// return the first element at top
	T peek();

	// Checks if stack is empty or not
	boolean isEmpty();
}
