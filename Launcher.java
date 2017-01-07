public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void launch() {
		Teste teste = new Teste();
		/**
		 * Successful return object implementation
		 */
		ReturnObjectImpl successObject = new ReturnObjectImpl("Hiii");
		teste.expect("It should have no error", successObject.hasError(), false);
		teste.expect("It should have no error", successObject.getError(), ErrorMessage.NO_ERROR);
		teste.expect("It should have a value", successObject.getReturnValue(), "Hiii");
		/**
		 * Error return object implementation
		 */
		ReturnObjectImpl errorObject = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		teste.expect("It should have no error", errorObject.hasError(), true);
		teste.expect("It should have no error", errorObject.getError(), ErrorMessage.EMPTY_STRUCTURE);
		teste.expect("It should have a value", errorObject.getReturnValue(), null);
	}
}
