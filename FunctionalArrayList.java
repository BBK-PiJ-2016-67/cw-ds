/**
 * FunctionalArrayList is a class extending {@see ArrayList} and
 * implementing {@see FunctionalList}.
 *
 * @author BBK-PiJ-2016-67
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {
	/**
	 * Returns the element at the beginning of the list.
	 *
	 * @return 	an element conforming to {@see ReturnObject}
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
	 * @return 	a {@see FunctionalArrayList} containing a list of
	 *			elements if successful, otherwise an empty list
	 */
	public FunctionalList rest() {
		FunctionalArrayList newArrayList = new FunctionalArrayList();
		if (super.size() <= 1) {
			return newArrayList;
		}
		for (int i = 1; i < super.size(); i++) {
			newArrayList.add(super.get(i).getReturnValue());
		}
		return newArrayList;
	}
}
