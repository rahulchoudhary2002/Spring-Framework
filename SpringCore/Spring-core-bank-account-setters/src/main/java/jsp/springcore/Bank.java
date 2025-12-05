package jsp.springcore;

class Account {
	public void run() {
		System.out.println("Account in branch");

	}

}

public class Bank {
	private Account account;

	public void start() {
		account.run();
		System.out.println("bank branch");

	}

	public Bank(Account account) {
		super();
		this.account = account;
	}

}
