public class StackArray<T> implements Stack<T> {
	private int count;
	private T[] data;

	private StackArray() {
		data = (T[]) new Object[10];
	}
	@Override
	public T pop() {
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
			T temp = data[--count];
			data[count] = null;
			if (count <= data.length/2) {
				resize(data.length/2);
			}
		}
	}

	@Override
	public void push(T element) {

	}

	@Override
	public T peek() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

}
