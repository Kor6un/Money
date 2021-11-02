import java.util.ArrayList;
import java.util.List;

public class Account {

    private String name;
    private final int numberAccount;
    private double money;
    private final List<OperationHistory> history = new ArrayList<>();

    public Account(String name, int numberAccount) {
        this.name = name;
        this.numberAccount = numberAccount;
        this.money = 0.0;
    }

    public List<OperationHistory> getHistory() {
        return history;
    }

    public Account(String name, int numberAccount, double money) {
        this.name = name;
        this.numberAccount = numberAccount;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void putMoney(double quantity) {
        double result = getMoney() + quantity;
        setMoney(result);
    }

    public void pullMoney(double quantity) {
        setMoney(getMoney() - quantity);
    }

    @Override
    public String toString() {
        return "\tНазвание счета: " + name + ",\tномер счета: " + numberAccount + ",\tсумма: " + money + "\n";
    }
}
