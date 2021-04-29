import java.util.NoSuchElementException;

public class LinkedList<T> {

	private static class Node<T> {
		private Node<T> next;
		private final T value;

		public Node(T value) {
			this.value = value;
		}
	}

	private Node<T> first;
	private Node<T> last;

	// add node at the beginning
	public void addFirst(T item) {
		Node<T> node = new Node<>(item);
		if (isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}

	public void addLast(T item) {
		Node<T> node = new Node<>(item);
		if (isEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public int indexOf(T item) {
		int index = 0;
		var current = first;
		while (current != null) {
			if (current.value == item) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}

	public void removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		if (isSingleNode()) {
			first = last = null;
			return;
		}
		var temp = first.next;
		first.next = null;
		first = temp;
	}

	public void removeLast() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		if (isSingleNode()) {
			first = last = null;
			return;
		}
		last = getPrevious(last);
		last.next = null;
	}

	public boolean contains(T item) {
		return indexOf(item) != -1;
	}

	private Node<T> getPrevious(Node<T> node) {
		var current = first;
		while (current != null) {
//			if current node == given node, return current node;
			if (current.next == node) {
				return current;
			}
//			else, append current node to the next node
			current = current.next;
		}
		return null;
	}

	// contains ony one node
	private boolean isSingleNode() {
		return first == last;
	}

	private boolean isEmpty() {
		return first == null;
	}
}
