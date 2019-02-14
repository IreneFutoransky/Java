package banking;

@SuppressWarnings("serial")
 
public class DepositWithdrawTranserAmountNotPositiveException extends Exception {

	public DepositWithdrawTranserAmountNotPositiveException() {
		// TODO Auto-generated constructor stub
	}

	public DepositWithdrawTranserAmountNotPositiveException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}	
	
	public DepositWithdrawTranserAmountNotPositiveException (Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
	}
	public DepositWithdrawTranserAmountNotPositiveException(String message, Throwable cause) {
				super(cause);
				// TODO Auto-generated constructor stub
	}			
	public DepositWithdrawTranserAmountNotPositiveException(String message, Throwable cause, 
			boolean enableSuppression, boolean writableStackTrace) {
					super(message, cause, enableSuppression, writableStackTrace);
					// TODO Auto-generated constructor stub

	}
	
}
