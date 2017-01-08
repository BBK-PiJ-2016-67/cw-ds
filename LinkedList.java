/**
 * LinkedList is a class implementing {@see List} based on linked
 * lists.
 *
 * @author BBK-PiJ-2016-67
 */
public class LinkedList implements List {
	private Node head;
	/**
	 * Adds an element to the list.
	 *
	 * @param item	the element to be added
	 * @return 		a {@see ReturnObjectImpl} containing a null
	 *				return value if successful, otherwise an error
	 */
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
	/**
	 * Adds an element to the list at a given index.
	 *
	 * @param index 	the index at which to add the element
	 * @param item		the element to be added
	 * @return 			a {@see ReturnObjectImpl} containing a
	 *					null return value if successful, otherwise
	 *					an error
	 */
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
	/**
	 * Returns an element from the list at a given index.
	 *
	 * @param index 	the index at which to retrieve the element
	 * @return 			a {@see ReturnObjectImpl} containing a
	 *					return value if successful, otherwise an
	 *					error
	 */
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
	/**
	 * Indicates whether the list is empty or not.
	 *
	 * @return 	true if the list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return this.size() == 0;
	}
	/**
	 * Removes an element from the list at a given index.
	 *
	 * @return 	a {@see ReturnObjectImpl} containing the removed
	 *			element if successful, otherwise an error
	 */
	public ReturnObject remove(int index) {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		if (index < 0 || index >= this.size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		if (index == 0 && this.size() == 1) {
			Object returnObject = this.head.object;
			this.head = null;
			return new ReturnObjectImpl(returnObject);
		}
		if (index == 0) {
			Object returnObject = this.head.object;
			this.head.next.prev = null;
			this.head = this.head.next;
			return new ReturnObjectImpl(returnObject);
		}
		Node current = this.head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		current.prev.next = current.next;
		if (current.next != null) {
			current.next.prev = current.prev;
		}
		Object returnObject = current.object;
		return new ReturnObjectImpl(returnObject);
	}
	/**
	 * Indicates the size of the list.
	 *
	 * @return 	the size of the list
	 */
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