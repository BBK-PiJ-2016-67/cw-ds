/**
 * SampleableListImpl is a class extending {@see ArrayList} and
 * implementing {@see SampleableList}.
 *
 * @author BBK-PiJ-2016-67
 */
public class SampleableListImpl extends ArrayList implements SampleableList {
	/**
	 * Returns a {@see SampleableListImpl} containing the first,
	 * third, fifth etc elements of the list.
	 *
	 * @return 	a list if elements are present, otherwise an empty
	 *			list
	 */
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
