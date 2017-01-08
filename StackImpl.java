/**
 * StackImpl is a class implementing {@see AbstractStack}.
 *
 * @author BBK-PiJ-2016-67
 */
public class StackImpl extends AbstractStack {
	/**
	 * Initialises the stack with a {@see List}.
	 *
	 * @param list 	a list of elements
	 */
	public StackImpl(List list) {
		super(list);
	}
	/**
	 * Indicates whether the stack is empty or not.
	 *
	 * @return 	true if the stack is empty, false otherwise
	 */
	public boolean isEmpty() {
		return this.size() == 0;
	}
	/**
	 * Returns and removes the element at the top of the stack.
	 *
	 * @return 	a {@see ReturnObjectImpl} containing a return value
	 *			if successful, otherwise an error
	 */
	public ReturnObject pop() {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		int index = this.size() - 1;
		ReturnObject topObject = super.internalList.get(index);
		super.internalList.remove(index);
		return topObject;
	}
	/**
	 * Adds an element to the stack.
	 *
	 * @param item	the element to be added
	 */
	public void push(Object item) {
		super.internalList.add(item);
	}
	/**
	 * Indicates the size of the stack.
	 *
	 * @return 	the size of the stack
	 */
	public int size() {
		return super.internalList.size();
	}
	/**
	 * Returns the element at the top of the stack.
	 *
	 * @return 	a {@see ReturnObjectImpl} containing a return value
	 *			if successful, otherwise an error
	 */
	public ReturnObject top() {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		int index = this.size() - 1;
		return super.internalList.get(index);
	}
}
