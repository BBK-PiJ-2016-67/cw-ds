public class LinkedList implements List {
	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		// TODO
		return new ReturnObjectImpl(null);
	}
	public ReturnObject add(int index, Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		if (index < 0 || index >= this.size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		// TODO
		return new ReturnObjectImpl(null);
	}
	public ReturnObject get(int index) {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		if (index < 0) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		// TODO
		return new ReturnObjectImpl(null);
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
		// TODO
		return new ReturnObjectImpl(null);
	}
	public int size() {
		return 1; // TODO
	}
}