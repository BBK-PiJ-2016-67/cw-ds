public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void launch() {
		Teste teste = new Teste();
		/**
		 * Return object implementation
		 */
		teste.section("Return Object");
		ReturnObjectImpl successObject = new ReturnObjectImpl("Hiii");
		teste.expect("It should have no error", successObject.hasError(), false);
		teste.expect("It should have no error", successObject.getError(), ErrorMessage.NO_ERROR);
		teste.expect("It should have a value", successObject.getReturnValue(), "Hiii");
		ReturnObjectImpl errorObject = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		teste.expect("It should have no error", errorObject.hasError(), true);
		teste.expect("It should have no error", errorObject.getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.expect("It should have a value", errorObject.getReturnValue(), null);
		/**
		 * Array list implementation
		 */
		teste.section("Array List");
		ArrayList arrayList = new ArrayList();
		teste.expect("It should indicate whether the array is empty", arrayList.isEmpty(), true);
		teste.expect("It should return an error if user attempts to access empty array", arrayList.get(0).getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.expect("It should return an error if user attempts to remove from empty array", arrayList.remove(1).getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.expect("It should add an item", arrayList.add("one").getReturnValue(), null);
		teste.expect("It should return an error if a null object is added", arrayList.add(null).getError(), ErrorMessage.INVALID_ARGUMENT);
		teste.expect("It should add an item at index", arrayList.add(0, "two").getReturnValue(), null);
		teste.expect("It should return an error if a null object is added", arrayList.add(1, null).getError(), ErrorMessage.INVALID_ARGUMENT);
		teste.expect("It should return an error if user attempts to access index out of bounds", arrayList.get(-1).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should return an error if user attempts to access index out of bounds", arrayList.get(10).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should return an error if user attempts to remove index out of bounds", arrayList.remove(-1).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should return an error if user attempts to remove index out of bounds", arrayList.remove(10).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should return an error if user attempts to add to index out of bounds", arrayList.add(-1, "some").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should return an error if user attempts to add to index out of bounds", arrayList.add(10, "thing").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should get an item at index", arrayList.get(1).getReturnValue(), "one");
		teste.expect("It should indicate whether the array is empty", arrayList.isEmpty(), false);
		teste.expect("It should remove an item at index", arrayList.remove(0).getReturnValue(), null);
		teste.expect("It should get an item at index", arrayList.get(0).getReturnValue(), "one");
		teste.expect("It should return the size of the array", arrayList.size(), 1);
		/**
		 * Array list implementation
		 */
		teste.section("Linked List");
		LinkedList linkedList = new LinkedList();
		teste.expect("It should indicate whether the list is empty", linkedList.isEmpty(), true);
		teste.expect("It should return an error if user attempts to access empty list", linkedList.get(0).getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.expect("It should return an error if user attempts to remove from empty list", linkedList.remove(1).getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.expect("It should add an item", linkedList.add("one").getReturnValue(), null);
		teste.expect("It should return an error if a null object is added", linkedList.add(null).getError(), ErrorMessage.INVALID_ARGUMENT);
		teste.expect("It should add an item at index", linkedList.add(1, "two").getReturnValue(), null);
		teste.expect("It should return an error if a null object is added", linkedList.add(1, null).getError(), ErrorMessage.INVALID_ARGUMENT);
		teste.expect("It should return an error if user attempts to access index out of bounds", linkedList.get(-1).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should return an error if user attempts to access index out of bounds", linkedList.get(10).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should return an error if user attempts to remove index out of bounds", linkedList.remove(-1).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should return an error if user attempts to remove index out of bounds", linkedList.remove(10).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should return an error if user attempts to add to index out of bounds", linkedList.add(-1, "some").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should return an error if user attempts to add to index out of bounds", linkedList.add(10, "thing").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.expect("It should get an item at index", linkedList.get(1).getReturnValue(), "two");
		teste.expect("It should indicate whether the list is empty", linkedList.isEmpty(), false);
		teste.expect("It should remove an item at index", linkedList.remove(0).getReturnValue(), null);
		teste.expect("It should get an item at index", linkedList.get(0).getReturnValue(), "two");
		teste.expect("It should return the size of the list", linkedList.size(), 1);
		/**
		 * Finish tests
		 */
		teste.finish();
	}
}
