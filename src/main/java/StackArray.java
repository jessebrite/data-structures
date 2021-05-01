import java.util.Arrays;

public class StackArray<T> implements Stack<T> {
	private int count;
	private T[] data;

	StackArray() {
		data = (T[]) new Object[1];
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		T temp = data[--count];
		data[count] = null;
		if (count <= size() / 2) {
			resize(data.length / 2);
		}
		return temp;
	}

	@Override
	public void push(T element) {
		if (count == data.length) {
			resize(data.length * 2);
		}

		data[count++] = element;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		return data[count--];
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	public int size() {
		return data.length;
	}

	public void  resize(int capacity) {
		T[] temp = (T[]) new Object[capacity];
		System.arraycopy(data, 0, temp, 0, count);
		data = temp;
	}

	@Override
	public String toString() {
		return Arrays.toString(data);
	}
}
