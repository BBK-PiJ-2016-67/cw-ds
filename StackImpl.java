public class StackImpl extends AbstractStack {
	public StackImpl(List list) {
		super(list);
	}
	public boolean isEmpty() {
		return this.size() == 0;
	}
	public ReturnObject pop() {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		int index = this.size() - 1;
		ReturnObject topObject = super.internalList.get(index);
		super.internalList.remove(index);
		return topObject;
	}
	public void push(Object item) {
		super.internalList.add(item);
	}
	public int size() {
		return super.internalList.size();
	}
	public ReturnObject top() {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		int index = this.size() - 1;
		return super.internalList.get(index);
	}
}
