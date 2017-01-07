public class FunctionalArrayList extends ArrayList implements FunctionalList {
	public ReturnObject head() {
		return super.get(0);
	}
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
