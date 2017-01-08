/**
 * 
 *
 * @author BBK-PiJ-2016-67
 */
public class ImprovedStackImpl implements ImprovedStack {
	/**
	 *
	 */
	private List list;
	/**
	 *
	 */
	public ImprovedStackImpl(List list) {
		this.list = list;
	}
	/**
	 *
	 */
	public boolean isEmpty() {
		return this.size() == 0;
	}
	/**
	 *
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
	 *
	 */
	public void push(Object item) {
		this.list.add(item);
	}
	/**
	 *
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
	 *
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
	 *
	 */
	public int size() {
		return this.list.size();
	}
	/**
	 *
	 */
	public ReturnObject top() {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		int index = this.size() - 1;
		return this.list.get(index);
	}
}
