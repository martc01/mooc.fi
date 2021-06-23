package Part4.Ex02YourFirstBankTransfer;

public class YourFirstBankTransfer {
    
    public static void main(String[] args) {
        //Do not touch the code in Account.java
        //Write your program here
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("myAccount", 0.00);

        matthewsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println("The balance of Matthews's account is now: " + matthewsAccount.saldo());
        System.out.println("The balance of my account is now: " + myAccount.saldo());

        
    }
}
