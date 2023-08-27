public class GiveChangeCoins {
    public static void main(String[] args) {
        Coin DOLLAR = new Coin(1.0, "Dollar");
        Coin QUARTER =  new Coin(0.25, "Quarter");
        Coin DIME = new Coin(0.1, "Dime");
        Coin NICKEL = new Coin(0.05, "Nickel");
        Coin PENNY =  new Coin(0.01, "Penny");
        CashRegister register = new CashRegister();
        register.recordPurchase(5.25);
        register.recordPurchase(4.5);
        register.receivePayment(10, DOLLAR);
        register.receivePayment(4, DIME);
        register.receivePayment(4, NICKEL);
        System.out.println("Total purchased: " + register.getTotalPurchase());
        System.out.println("Total payed amount is: " + register.getTotalPayment());
        double change = register.giveChange();
        System.out.printf("Total Change : %.2f\n",change);
        System.out.println("changeable dollar:"+register.giveChange(DOLLAR));
        System.out.println("changeable Quarter:"+register.giveChange(QUARTER));
        System.out.println("changeable Dime:"+register.giveChange(DIME));
        System.out.println("changeable Nickel:"+register.giveChange(NICKEL));
    System.out.println("changeable Penny:"+register.giveChange(PENNY));



    }
}
