/**
 * ReturnObjectImpl is a class implementing {@see ReturnObject}.
 *
 * @author BBK-PiJ-2016-67
 */
public class ReturnObjectImpl implements ReturnObject {
	private ErrorMessage errorMessage = ErrorMessage.NO_ERROR;
	private Object returnValue;
	/**
	 * Initialises the class with an {@see ErrorMessage}.
	 *
	 * @param errorMessage 	an error message
	 */
	public ReturnObjectImpl(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}
	/**
	 * Initialises the class with an {@see Object}.
	 *
	 * @param returnValue 	an object
	 */
	public ReturnObjectImpl(Object returnValue) {
		this.returnValue = returnValue;
	}
	/**
	 * Returns an {@see ErrorMessage}.
	 *
	 * @return 	an error message
	 */
	public ErrorMessage getError() {
		return this.errorMessage;
	}
	/**
	 * Returns an {@see Object}.
	 *
	 * @return 	an object is present, otherwise null
	 */
	public Object getReturnValue() {
		return this.returnValue;
	}
	/**
	 * Indicates whether an error message has been set.
	 *
	 * @return 	true if an error message has been set, false
	 *			otherwise
	 */
	public boolean hasError() {
		return this.errorMessage != ErrorMessage.NO_ERROR;
	}
}
