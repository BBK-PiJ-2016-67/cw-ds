/**
 * FunctionalLinkedList is a class extending {@see LinkedList} and
 * implementing {@see FunctionalList}.
 *
 * @author BBK-PiJ-2016-67
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	/**
	 * Returns the element at the beginning of the list.
	 *
	 * @return 	an element implementing {@see ReturnObject}
	 *			containing a return value if successful, otherwise
	 *			an error
	 */
	public ReturnObject head() {
		return super.get(0);
	}
	/**
	 * Returns a list with all elements in the list except the
	 * first element in the list. The original list remains
	 * unchanged.
	 *
	 * @return 	a {@see FunctionalLinkedList} containing a list of
	 *			elements if successful, otherwise an empty list
	 */
	public FunctionalList rest() {
		FunctionalLinkedList newLinkedList = new FunctionalLinkedList();
		if (super.size() <= 1) {
			return newLinkedList;
		}
		for (int i = 1; i < super.size(); i++) {
			newLinkedList.add(super.get(i).getReturnValue());
		}
		return newLinkedList;
	}
}
