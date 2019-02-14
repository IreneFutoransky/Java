package banking;

public class Mainline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Savings acct = new Savings("my first savings account");
		
		Savings sav = new Savings("my second savings account");
		
		try {
		acct.deposit(1000);
		acct.withdraw(200);
		acct.PayInterest();
		System.out.println("balance is " + acct.getBalance());
		acct.deposit(100);
		acct.withdraw(100);
		boolean success = acct.TransferTo(sav,  500);
		System.out.println("Transfer was a success " + success);
		System.out.println("Balance in acct is " + acct.getBalance());
		System.out.println("Balance in sav is " + sav.getBalance());
		}catch(InsufficientFundsException ex) {
			System.out.println(ex.getMessage());
		}catch(DepositWithdrawTranserAmountNotPositiveException ex) {
			System.out.println(ex.getMessage());
		}catch (Exception ex ) {
			System.out.println(ex.getMessage());
		};
		
	}

}
