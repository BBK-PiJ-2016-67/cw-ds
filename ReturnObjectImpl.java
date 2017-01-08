/**
 * 
 *
 * @author BBK-PiJ-2016-67
 */
public class ReturnObjectImpl implements ReturnObject {
	/**
	 *
	 */
	private ErrorMessage errorMessage = ErrorMessage.NO_ERROR;
	/**
	 *
	 */
	private Object returnValue;
	/**
	 *
	 */
	public ReturnObjectImpl(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}
	/**
	 *
	 */
	public ReturnObjectImpl(Object returnValue) {
		this.returnValue = returnValue;
	}
	/**
	 *
	 */
	public ErrorMessage getError() {
		return this.errorMessage;
	}
	/**
	 *
	 */
	public Object getReturnValue() {
		return this.returnValue;
	}
	/**
	 *
	 */
	public boolean hasError() {
		return this.errorMessage != ErrorMessage.NO_ERROR;
	}
}
