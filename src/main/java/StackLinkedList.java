import java.util.NoSuchElementException;

public class StackLinkedList<T> implements Stack<T> {
	private Node data;

	private class Node {
		private T element;
		private Node next;
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			throw  new NoSuchElementException();
		}
		T temp = data.element;
		data = data.next;
		return temp;
	}

	@Override
	public void push(T element) {
		Node current = data;
		data = new Node();
		data.element = element;
		data.next = current;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return data.element;
	}

	@Override
	public boolean isEmpty() {
		return data == null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = data;
		sb.append("[");
		while (temp != null) {
			sb.append(temp.element).append(", ");
			temp = temp.next;
		}
		sb.deleteCharAt(sb.lastIndexOf(" "));
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(("]"));
		return sb.toString();
	}
}
