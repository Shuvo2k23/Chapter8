public class CashRegister {
    private double payment = 0.0;
    private double purchase = 0.0;

    public CashRegister() {
    }

    public void recordPurchase(double amount) {

        this.purchase += amount;
    }

    public void receivePayment(int coinCount, Coin coinType) {
        this.payment += (double)coinCount * coinType.getCoinValue();
    }

    public double getTotalPurchase() {
        return purchase;
    }

    public double getTotalPayment() {
        return payment;
    }

    public double giveChange() {
        double change = payment - purchase;
        payment = 0.0;
        this.purchase = 0.0;
        return change;
    }
}
