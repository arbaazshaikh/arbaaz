
public class BankAccount {
	
	int balance = 500;
	void depositCash(int amt){
		balance = balance+amt;
	}
	void withdrawCash(int amt){
		balance = balance -amt;
	}
	int getBalance(){
		return balance;
	}
	

}
