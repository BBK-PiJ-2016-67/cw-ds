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
		teste.itShould("have no error", successObject.hasError(), false);
		teste.itShould("have no error", successObject.getError(), ErrorMessage.NO_ERROR);
		teste.itShould("have a value", successObject.getReturnValue(), "Hiii");
		ReturnObjectImpl errorObject = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		teste.itShould("have no error", errorObject.hasError(), true);
		teste.itShould("have no error", errorObject.getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.itShould("have a value", errorObject.getReturnValue(), null);
		/**
		 * Array list implementation
		 */
		teste.section("Array List");
		ArrayList arrayList = new ArrayList();
		teste.itShould("indicate whether the array is empty", arrayList.isEmpty(), true);
		teste.itShould("return an error if user attempts to access empty array", arrayList.get(0).getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.itShould("return an error if user attempts to remove from empty array", arrayList.remove(1).getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.itShould("add an item", arrayList.add("one").getReturnValue(), null);
		teste.itShould("add an item", arrayList.add("two").getReturnValue(), null);
		teste.itShould("get an item at index", arrayList.get(0).getReturnValue(), "one");
		teste.itShould("return an error if a null object is added", arrayList.add(null).getError(), ErrorMessage.INVALID_ARGUMENT);
		teste.itShould("return an error if user adds at end index", arrayList.add(2, "three").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("add an item at index", arrayList.add(1, "three").getReturnValue(), null);
		teste.itShould("return an error if a null object is added", arrayList.add(1, null).getError(), ErrorMessage.INVALID_ARGUMENT);
		teste.itShould("return an error if user attempts to access index out of bounds", arrayList.get(-1).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("return an error if user attempts to access index out of bounds", arrayList.get(10).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("return an error if user attempts to remove index out of bounds", arrayList.remove(-1).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("return an error if user attempts to remove index out of bounds", arrayList.remove(10).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("return an error if user attempts to add to index out of bounds", arrayList.add(-1, "some").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("return an error if user attempts to add to index out of bounds", arrayList.add(10, "thing").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("get an item at index", arrayList.get(1).getReturnValue(), "three");
		teste.itShould("get an item at index", arrayList.get(2).getReturnValue(), "two");
		teste.itShould("indicate whether the array is empty", arrayList.isEmpty(), false);
		teste.itShould("remove an item at index", arrayList.remove(0).getReturnValue(), null);
		teste.itShould("get an item at index", arrayList.get(0).getReturnValue(), "three");
		teste.itShould("return the size of the array", arrayList.size(), 2);
		/**
		 * Array list implementation
		 */
		teste.section("Linked List");
		LinkedList linkedList = new LinkedList();
		teste.itShould("indicate whether the list is empty", linkedList.isEmpty(), true);
		teste.itShould("return an error if user attempts to access empty list", linkedList.get(0).getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.itShould("return an error if user attempts to remove from empty list", linkedList.remove(1).getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.itShould("add an item", linkedList.add("one").getReturnValue(), null);
		teste.itShould("add an item", linkedList.add("two").getReturnValue(), null);
		teste.itShould("get an item at index", linkedList.get(0).getReturnValue(), "one");
		teste.itShould("return an error if a null object is added", linkedList.add(null).getError(), ErrorMessage.INVALID_ARGUMENT);
		teste.itShould("return an error if user adds at end index", linkedList.add(2, "three").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("add an item at index", linkedList.add(1, "three").getReturnValue(), null);
		teste.itShould("return an error if a null object is added", linkedList.add(1, null).getError(), ErrorMessage.INVALID_ARGUMENT);
		teste.itShould("return an error if user attempts to access index out of bounds", linkedList.get(-1).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("return an error if user attempts to access index out of bounds", linkedList.get(10).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("return an error if user attempts to remove index out of bounds", linkedList.remove(-1).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("return an error if user attempts to remove index out of bounds", linkedList.remove(10).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("return an error if user attempts to add to index out of bounds", linkedList.add(-1, "some").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("return an error if user attempts to add to index out of bounds", linkedList.add(10, "thing").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		teste.itShould("get an item at index", linkedList.get(1).getReturnValue(), "three");
		teste.itShould("get an item at index", linkedList.get(2).getReturnValue(), "two");
		teste.itShould("indicate whether the list is empty", linkedList.isEmpty(), false);
		teste.itShould("remove an item at index", linkedList.remove(0).getReturnValue(), null);
		teste.itShould("get an item at index", linkedList.get(0).getReturnValue(), "three");
		teste.itShould("return the size of the list", linkedList.size(), 2);
		/**
		 * Functional array list implementation
		 */
		teste.section("Functional Array List");
		FunctionalArrayList functionalArrayList = new FunctionalArrayList();
		teste.itShould("return an error if the list is empty", functionalArrayList.head().getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.itShould("add an item", functionalArrayList.add("one").getReturnValue(), null);
		teste.itShould("return the first item in the list", functionalArrayList.head().getReturnValue(), "one");
		teste.itShould("return an empty list if there is only one item", functionalArrayList.rest().head().getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.itShould("leave the original list unchanged", functionalArrayList.head().getReturnValue(), "one");
		teste.itShould("add an item", functionalArrayList.add("two").getReturnValue(), null);
		teste.itShould("add an item", functionalArrayList.add("three").getReturnValue(), null);
		teste.itShould("return a list of all items except the first", functionalArrayList.rest().head().getReturnValue(), "two");
		teste.itShould("leave the original list unchanged", functionalArrayList.head().getReturnValue(), "one");
		/**
		 * Functional linked list implementation
		 */
		teste.section("Functional Linked List");
		FunctionalLinkedList functionalLinkedList = new FunctionalLinkedList();
		teste.itShould("return an error if the list is empty", functionalLinkedList.head().getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.itShould("add an item", functionalLinkedList.add("one").getReturnValue(), null);
		teste.itShould("return the first item in the list", functionalLinkedList.head().getReturnValue(), "one");
		teste.itShould("return an empty list if there is only one item", functionalLinkedList.rest().head().getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.itShould("leave the original list unchanged", functionalLinkedList.head().getReturnValue(), "one");
		teste.itShould("add an item", functionalLinkedList.add("two").getReturnValue(), null);
		teste.itShould("add an item", functionalLinkedList.add("three").getReturnValue(), null);
		teste.itShould("return a list of all items except the first", functionalLinkedList.rest().head().getReturnValue(), "two");
		teste.itShould("leave the original list unchanged", functionalLinkedList.head().getReturnValue(), "one");
		/**
		 * Finish tests
		 */
		teste.finish();
	}
}
