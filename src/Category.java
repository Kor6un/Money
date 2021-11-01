import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private final List<Double> historyCategory = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getHistoryCategory() {
        return historyCategory;
    }
}
