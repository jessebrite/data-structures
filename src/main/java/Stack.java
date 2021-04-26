public interface Stack<T> {
	// remove element from stack
	public T pop();

	// add element to stac
	public void push(T element);

	// return the first element at top
	public T peek();

	// Checks if stack is empty or not
	public boolean isEmpty();

	// return the size of the stack
	public  int size();
}
