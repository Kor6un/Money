import java.util.Date;

public class OperationHistory {
    private Category category;
    private double money;
    private Date date;

    public OperationHistory(Category category, double money, Date date) {
        this.category = category;
        this.money = money;
        this.date = date;
    }

    @Override
    public String toString() {
        return "category='" + category.getName() + '\'' +
               ", money=" + money +
               ", date=" + date;
    }
}
