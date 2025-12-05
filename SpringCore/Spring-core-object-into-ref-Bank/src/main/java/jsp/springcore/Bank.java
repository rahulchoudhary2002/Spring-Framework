package jsp.springcore;

class Account {
	public void run() {
		System.out.println("branch have account");

	}

}

public class Bank {
	private Account account;
	public void start() {
		account.run();
		System.out.println("Bank have account");

	}
	
	public void setAccount(Account account) {
		this.account = account;
	}

}
