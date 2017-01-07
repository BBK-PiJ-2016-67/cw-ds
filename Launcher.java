public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void expect(String title, Object x, Object y) {
		if (x == y) {
			System.out.println("\u001B[32m" + "PASS: " + title + "\u001B[0m");
		} else {
			System.out.println("\u001B[31m" + "FAIL: " + title + "\u001B[0m");
		}
	}
	public void launch() {
		/**
		 * Successful return object implementation
		 */
		ReturnObjectImpl successObject = new ReturnObjectImpl("Hiii");
		this.expect("It should have no error", successObject.hasError(), false);
		this.expect("It should have no error", successObject.getError(), ErrorMessage.NO_ERROR);
		this.expect("It should have a value", successObject.getReturnValue(), "Hiii");
		/**
		 * Error return object implementation
		 */
		ReturnObjectImpl errorObject = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		this.expect("It should have no error", errorObject.hasError(), true);
		this.expect("It should have no error", errorObject.getError(), ErrorMessage.EMPTY_STRUCTURE);
		this.expect("It should have a value", errorObject.getReturnValue(), null);
	}
}
