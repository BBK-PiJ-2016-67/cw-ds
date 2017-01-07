public class LinkedList implements List {
	private Node head;
	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		Node node = new Node();
		node.object = item;
		if (head == null) {
			head = node;
			return new ReturnObjectImpl(null);
		}
		if (this.head.next == null) {
			node.prev = this.head;
			this.head.next = node;
			return new ReturnObjectImpl(null);
		}
		Node current = this.head;
		while(current.next != null) {
			current = current.next;
		}
		node.prev = current;
		current.next = node;
		return new ReturnObjectImpl(null);
	}
	public ReturnObject add(int index, Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		if (index < 0 || index >= this.size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		Node node = new Node();
		node.object = item;
		if (index == 0) {
			node.next = this.head;
			this.head.prev = node;
			this.head = node;
			return new ReturnObjectImpl(null);
		}
		Node current = this.head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		node.next = current;
		current.prev.next = node;
		current.prev = node;
		return new ReturnObjectImpl(null);
	}
	public ReturnObject get(int index) {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		if (index < 0 || index >= this.size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		Node current = this.head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return new ReturnObjectImpl(current.object);
	}
	public boolean isEmpty() {
		return this.size() == 0;
	}
	public ReturnObject remove(int index) {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		if (index < 0 || index >= this.size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		if (index == 0 && this.size() == 1) {
			this.head = null;
			return new ReturnObjectImpl(null);
		}
		if (index == 0) {
			this.head.next.prev = null;
			this.head = this.head.next;
			return new ReturnObjectImpl(null);
		}
		Node current = this.head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		current.prev.next = current.next;
		current.next.prev = current.prev;
		return new ReturnObjectImpl(null);
	}
	public int size() {
		if (this.head == null) {
			return 0;
		}
		if (this.head.next == null) {
			return 1;
		}
		Node current = this.head;
		int length = 1;
		while(current.next != null) {
			length += 1;
			current = current.next;
		}
		return length;
	}
}