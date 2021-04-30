import java.util.NoSuchElementException;

public class LinkedList<E> {

	private static class Node<E> {
		private Node<E> next;
		private final E value;

		public Node(E value) {
			this.value = value;
		}
	}

	private Node<E> head = null;
	private Node<E> tail = null;
	private static int size = 0;

	public int size() {
		return size;
	}

	// add node at the beginning
	public void addFirst(E item) {
		Node<E> node = new Node<>(item);
		if (isEmpty()) {
			head = tail = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
	}

	public void addLast(E item) {
		Node<E> node = new Node<>(item);
		if (isEmpty()) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public int indexOf(E item) {
		int index = 0;
		var current = head;
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
			head = tail = null;
			return;
		}
		var temp = head.next;
		head.next = null;
		head = temp;
		size--;
	}

	public void removeLast() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		if (isSingleNode()) {
			head = tail = null;
			return;
		}
		tail = getPrevious(tail);
		tail.next = null;
		size--;
	}

	public boolean contains(E item) {
		return indexOf(item) != -1;
	}

	private Node<E> getPrevious(Node<E> node) {
		var current = head;
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
		return head == tail;
	}

	private boolean isEmpty() {
		return head == null;
	}
}
