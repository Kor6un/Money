import java.util.Date;
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


    public  int getChoiceOperation() {
        Scanner scanner = new Scanner(System.in);
        final int MAX = 2;
        final int MIN = 1;
        boolean isCorrect;
        int choice = 0;
        do {
            System.out.print("Выбирите:\t1 - пополнить счет,\t2 - потратить: ");
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

    public void transaction() {
        Scanner scanner = new Scanner(System.in);
        choiceOperation = getChoiceOperation();
        OperationHistory history;
        if (choiceOperation == 1) {
            System.out.println("Введите сумму");
            money = Double.parseDouble(scanner.nextLine());
            account.putMoney(money);
            category = new Category("Пополнение счета");
            history = new OperationHistory(category, money);
            account.addHistory(history);
        } else {
            System.out.println("Введите название категории");
            category = new Category(scanner.nextLine());
            System.out.println("Введите сумму");
            money = Double.parseDouble(scanner.nextLine());
            account.pullMoney(money);
            history = new OperationHistory(category, money);
            account.addHistory(history);
        }
        scanner.close();
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
