import java.text.SimpleDateFormat;
import java.util.Date;

public class OperationHistory {
    private Category category;
    private double money;
    private Date date;
    private SimpleDateFormat dateFormat=new SimpleDateFormat("dd.MM.yyyy");

    public OperationHistory(Category category, double money) {
        this.category = category;
        this.money = money;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "category='" + category.getName() + '\'' +
               ", money=" + money +
               ", date=" + dateFormat.format(date);
    }
}
