public class CashRegister {
    private double payment = 0.0;
    private double purchase = 0.0;
    private double change = 0.0;
    final double EPSILON = 1E-14;

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
        change = payment - purchase;
        payment = 0.0;
        this.purchase = 0.0;
        return change;
    }
    int giveChange(Coin coinType){
        int pics = (int) (change/coinType.getCoinValue());
        change = change-(double) (pics*coinType.getCoinValue());
        if(Math.abs(change-0)<=EPSILON){
            change = 0;
        }
        return pics;
    }
}
