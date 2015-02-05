public class BankAccount {
	private String myPassword;
	private double myBalance;
	public static final double OVERDRAWN_PENALTY = 20.00;

	// Constructors
	/* Default constructor
	 * Constructs bank account with default values */
	public BankAccount() {
		/* Implementation code */
	}

	/* Constructs bank account with specified password and balance */
	public BankAccount(String password, double balance) {
		/* Implementation code */
	}

	// Accessor
	/* Returns balance of this account */
	public double getBalance() {
		/* Implementation code */
	}

	// Mutators
	/* Deposits amount in bank account with given password */
	public void deposit(String password, double amount) {
		/* Implementation code */
	}

	/* Withdraws amount from bank account with given password
	 * Assesses penalty if myBalance is less than amount */
	public void withdraw(String password, double amount) {
		/* Implementation code */
	}
}
