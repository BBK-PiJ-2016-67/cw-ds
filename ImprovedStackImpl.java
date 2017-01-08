/**
 * ImprovedStackImpl is a class implementing {@see ImprovedStack}.
 *
 * @author BBK-PiJ-2016-67
 */
public class ImprovedStackImpl implements ImprovedStack {
	private List list;
	/**
	 * Initialises the stack with a {@see List}.
	 *
	 * @param list 	a list of elements
	 */
	public ImprovedStackImpl(List list) {
		this.list = list;
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
		ReturnObject topObject = this.list.get(index);
		this.list.remove(index);
		return topObject;
	}
	/**
	 * Adds an element to the stack.
	 *
	 * @param item	the element to be added
	 */
	public void push(Object item) {
		this.list.add(item);
	}
	/**
	 * Removes all instances of the provided element from the stack.
	 *
	 * @param object the element to be removed from the stack
	 */
	public void remove(Object object) {
		if (this.isEmpty()) {
			return;
		}
		for (int i = 0; i < this.size(); i++) {
			Object item = this.list.get(i).getReturnValue();
			if (item.equals(object)) {
				this.list.remove(i);
				i -= 1;
			}
		}
	}
	/**
	 * Returns a stack containing all elements of the original
	 * stack in reverse order.
	 *
	 * @return 	an {@see ImprovedStackImpl} of elements
	 */
	public ImprovedStack reverse() {
		ArrayList newList = new ArrayList();
		for (int i = this.list.size() - 1; i >= 0; i--) {
			Object item = this.list.get(i).getReturnValue();
			newList.add(item);
		}
		return new ImprovedStackImpl(newList);
	}
	/**
	 * Indicates the size of the stack.
	 *
	 * @return 	the size of the stack
	 */
	public int size() {
		return this.list.size();
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
		return this.list.get(index);
	}
}
