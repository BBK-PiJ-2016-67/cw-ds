public class SampleableListImpl extends ArrayList implements SampleableList {
	public SampleableList sample() {
		SampleableListImpl sampleableList = new SampleableListImpl();
		for (int i = 0; i < super.size(); i++) {
			if (i % 2 != 0) {
				continue;
			}
			sampleableList.add(super.get(i).getReturnValue());
		}
		return sampleableList;
	};
}
