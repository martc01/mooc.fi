package Part4.Ex15PaymentCard;

public class PaymentCard {
    private double balance;
    private double amount;

    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return "The card has balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance -2.60 >= 0.0) {
            this.balance -= 2.60; 
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 >= 0.0) {
            this.balance -= 4.60; 
        }
    }

    public void addMoney(double amount){
        if (amount >= 0) {
        this.balance = this.balance + amount;
        }
    }
}

