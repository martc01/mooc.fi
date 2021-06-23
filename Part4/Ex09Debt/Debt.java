package Part4.Ex09Debt;

public class Debt {
   
    private double balance;
    private double interestRate;

    public Debt (double initialBalance, double initialInterestRate) {

    this.balance = initialBalance;
    this.interestRate = initialInterestRate;

    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
//  System.out.println(this.balance * (interestRate));
        this.balance = this.interestRate * this.balance;
    }    
}

