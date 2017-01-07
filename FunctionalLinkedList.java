public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	public ReturnObject head() {
		return super.get(0);
	}
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
