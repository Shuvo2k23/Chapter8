public class Coin {
    private double coinValue;
    private String coinName;
    public Coin(double aValue, String aName) {
        this.coinValue = aValue;
        this.coinName = aName;
    }

    public double getCoinValue() {
        return this.coinValue;
    }

    public String getCoinName() {
        return this.coinName;
    }

}
