import java.util.ArrayList;
import java.util.List;

public class StorageAccounts {
    private final List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account createAccount(int numberAccount) {
        return new Account(numberAccount);
    }

    public void addAccount(int numberAccount) {
        Account account = new Account(numberAccount);
        if (accounts.contains(account)) {
            System.out.println("Такой счет уже существует!");
        } else {
            accounts.add(account);
        }
    }

    public void deleteAccount(int numberAccount) {
        Account account = findAccount(numberAccount);
        if (accounts.isEmpty()){
            System.out.println("У вас нет счетов");
        } else if (accounts.contains(account) && accounts.remove(account)) {
            System.out.println("Счет успешно удален!");
        } else {
            System.out.println("Ошибка! Удалить счет не получилось.");
        }
    }

    public Account findAccount(int numberAccount) {
        if (accounts.isEmpty()) {
            System.out.println("У вас нет счетов");
        } else {
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getNumberAccount() == numberAccount) {
                    return accounts.get(i);
                } else {
                    System.out.println("Счет не найден! Проверьте введенные данные.");
                }
            }
        }
        return null;
    }

    public Account updateAccount(int numberAccount) {
        if (accounts.isEmpty()) {
            System.out.println("У вас нет счетов");
        } else {
            Account changedAccount = findAccount(numberAccount);
            if(changedAccount != null) {
                changedAccount.putMoney(100.0);
                System.out.println("Вы успешно добавили денег на счет!");
                return  changedAccount;
            }
        }
        return null;
    }


}
