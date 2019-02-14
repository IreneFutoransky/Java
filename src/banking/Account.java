package banking;

public class Account {
	
	private double balance;
	private static int nextId = 1;
	private int id;
	private String description;
	
	//in C#: public int id {get; set;}
	public int getId() {return id;}
	public double getBalance() {return balance;}
	private void setBalance(double newBalance) {balance = newBalance;};
	public String getDescription() {return description;}
	public void setDescription(String newDescription) {
								description = newDescription;}
	
	public boolean TransferTo(Account account, double amount)throws
							DepositWithdrawTranserAmountNotPositiveException{
		try {withdraw(amount);		
				}catch(InsufficientFundsException ex) {return 
						false;
				}				
				account.deposit(amount);			
				return true;
		}
	private void checkAmountGtZero(double amount) throws DepositWithdrawTranserAmountNotPositiveException{		
		if (amount <= 0) {
			throw new DepositWithdrawTranserAmountNotPositiveException("Amount must be positive");
	}}
	public void deposit (double amount) throws DepositWithdrawTranserAmountNotPositiveException 
	{	 
		checkAmountGtZero(amount);	
		setBalance(getBalance()+ amount);		
	}
	public void withdraw(double amount) throws DepositWithdrawTranserAmountNotPositiveException,	
												InsufficientFundsException{
		checkAmountGtZero(amount);	
		if (getBalance() < amount) {
			throw new InsufficientFundsException("insufficiant funds");
		}
		setBalance(getBalance() - amount);
	}	
	
	//in C#: public Account(string NewDescription) : this()
	public Account(String newDescription) {
		this();		
		description = newDescription;	}	
		
		
	public Account() {
		id = nextId++;
		balance = 0;
		description = "*New Account*";		
		
	}
	
	
	

}
