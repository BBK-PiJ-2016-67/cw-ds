/**
 * ArrayList is a class implementing {@see List} based on arrays.
 *
 * @author BBK-PiJ-2016-67
 */
public class ArrayList implements List {
	private Object[] array = new Object[0];
	/**
	 * Adds an {@see Object} to the array.
	 *
	 * @param item		the item to be added
	 * @return 			a {@see ReturnObject} containing a null return
	 *					value if successful, otherwise an error
	 */
	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		Object[] newArray = new Object[this.size() + 1];
		for (int i = 0; i < this.size(); i++) {
			newArray[i] = this.array[i];
		}
		newArray[this.size()] = item;
		this.array = newArray;
		return new ReturnObjectImpl(null);
	}
	/**
	 * Adds an {@see Object} to the array at a given index.
	 *
	 * @param index 	the index at which to add the item
	 * @param item		the item to be added
	 * @return 			a {@see ReturnObject} containing a null return
	 *					value if successful, otherwise an error
	 */
	public ReturnObject add(int index, Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		if (index < 0 || index >= this.size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		Object[] newArray = new Object[this.size() + 1];
		for (int i = 0; i < index; i++) {
			newArray[i] = this.array[i];
		}
		newArray[index] = item;
		for (int i = index; i < array.length; i++) {
			newArray[i + 1] = this.array[i];
		}
		this.array = newArray;
		return new ReturnObjectImpl(null);
	}
	/**
	 * Returns an {@see Object} from the array at a given index.
	 *
	 * @param index 	the index at which to retrieve the item
	 * @return 			a {@see ReturnObject} containing a return
	 *					value if successful, otherwsie an error
	 */
	public ReturnObject get(int index) {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		if (index < 0) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		for (int i = 0; i < this.size(); i++) {
			if (i != index) {
				continue;
			}
			return new ReturnObjectImpl(this.array[i]);
		}
		return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
	}
	/**
	 * Indicates whether the array is empty or not.
	 *
	 * @return 	true if the array is empty, false otherwise
	 */
	public boolean isEmpty() {
		return this.size() == 0;
	}
	/**
	 * Removes an {@see Object} from the array at a given index.
	 *
	 * @return 	a {@see ReturnObject} containing a null return
	 *			value if successful, otherwise an error
	 */
	public ReturnObject remove(int index) {
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		if (index < 0 || index >= this.size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		Object[] newArray = new Object[this.size() - 1];
		for (int i = 0; i < index; i++) {
			newArray[i] = this.array[i];
		}
		for (int i = index; i < newArray.length; i++) {
			newArray[i] = this.array[i + 1];
		}
		this.array = newArray;
		return new ReturnObjectImpl(null);
	}
	/**
	 * Indicates the size of the array.
	 *
	 * @return 	the size of the array
	 */
	public int size() {
		return this.array.length;
	}
}
