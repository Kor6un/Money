public class Account {
    private final int numberAccount;
    private double money;

    public Account(int numberAccount) {
        this.numberAccount = numberAccount;
        this.money = 0.0;
    }

    public Account(int numberAccount, double money) {
        this.numberAccount = numberAccount;
        this.money = money;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void putMoney( double quantity) {
       setMoney(getMoney() + quantity);
    }

    public void pullMoney( double quantity) {
        setMoney(getMoney() - quantity);
    }

    @Override
    public String toString() {
        return "Номер счета: " + numberAccount + "\nСостояние счета: " + money;
    }
}
