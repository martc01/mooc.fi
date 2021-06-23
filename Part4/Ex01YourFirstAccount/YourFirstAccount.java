package Part4.Ex01YourFirstAccount;

public class YourFirstAccount {
    
    public static void main(String[] args) {
        //Do not touch the code in Account.java
        //Write your program here
        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's Account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        artosAccount.deposit(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.saldo());
        artosSwissAccount.deposit(200);
        System.out.println("The balance of the other Arto's account is now: " + artosSwissAccount.saldo());

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        
    }
}
