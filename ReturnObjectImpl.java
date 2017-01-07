public class ReturnObjectImpl implements ReturnObject {
	private ErrorMessage errorMessage;
	private Object returnValue;
	public ReturnObjectImpl(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}
	public ReturnObjectImpl(Object returnValue) {
		this.errorMessage = ErrorMessage.NO_ERROR;
		this.returnValue = returnValue;
	}
	public ErrorMessage getError() {
		return this.errorMessage;
	}
	public Object getReturnValue() {
		return this.returnValue;
	}
	public boolean hasError() {
		return this.errorMessage != ErrorMessage.NO_ERROR;
	}
}
