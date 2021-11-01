import java.util.Scanner;

public class Operations {

    private Account account;
    private Category category;
    private int choiceOperation;
    private double money;

    public Operations(Account account) {
        this.account = account;
    }

    public Operations(Account account, Category category) {
        this.account = account;
        this.category = category;
    }

    public Operations(Account account, Category category, int choiceOperation, int choiceOperation1, double money) {
        this.account = account;
        this.category = category;
        this.choiceOperation = choiceOperation1;
        this.money = money;
    }

    public  int getChoiceOperation() {
        Scanner scanner = new Scanner(System.in);
        final int MAX = 2;
        final int MIN = 1;
        boolean isCorrect;
        int choice = 0;
        do {
            System.out.print("Выбирите:\t1 - поподнить счет,\t2 - потратить: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("Ошибка ввода. Повторите ввод.");
                isCorrect = false;
            }
            if ((isCorrect) && (choice > MAX || choice < MIN)) {
                System.out.println("Число выходит за допустимые пределы. Повторите ввод.");
                isCorrect = false;
            }
        } while (!isCorrect);
        return choice;
    }

    public void transaction(double quantity) {
        this.money = quantity;
        int choice = getChoiceOperation();
        if (choice == 1) {
            account.putMoney(quantity);
        } else {
            account.pullMoney(quantity);
            category.getHistoryCategory().add(quantity);
            account.getHistory().add(quantity);
        }
    }

    @Override
    public String toString() {
        if (choiceOperation == 1) {
            return "На счет №" + account.getNumberAccount() + " зачислена сумма " + money;
        } else {
            return "Со счета № " + account.getNumberAccount() + " снята сумма " +
                    + money + " на категорию " + category.getName();
        }
    }
}
