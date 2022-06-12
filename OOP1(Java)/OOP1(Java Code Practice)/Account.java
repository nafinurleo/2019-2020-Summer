import java.lang.*;

public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public Account(){
		
		System.out.println("Empty Account");
	}
	public Account(int an,String ahn,double b){
		
		this.accountNumber = an;
		this.accountHolderName = ahn;
		this.balance = b;
	}
	
	public void setAccountNumber(int an){
		
		this.accountNumber = an;
	}
	public int getAccountNumber(){
		
		return accountNumber;
		}
	public void setAccountHolderName(String ahn){
		
		this.accountHolderName = ahn;
	}
	public String getAccountHolderName(){
		
		return accountHolderName;
		}
	public void setBalance(double b){
		
		this.balance = b;
	}
	public double getBalance(){
		return balance;
		}
	
	public void showDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
	}
	public static void main(String [] args){
		Account A1=new Account(421951,"Nafinur Leo",500000);
		A1.showDetails();
	}
		
}