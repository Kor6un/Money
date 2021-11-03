import java.util.ArrayList;
import java.util.List;

public class StorageAccounts {

    private final List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account createAccount(String name, int numberAccount) {
        return new Account(name, numberAccount);
    }

    public Account createAccount(String name, int numberAccount, double money) {
        return new Account(name, numberAccount, money);
    }

    public void addAccount(String name, int numberAccount) {
        Account account = new Account(name, numberAccount);
        if (accounts.contains(account)) {
            System.out.println("Такой счет уже существует!");
        } else {
            accounts.add(account);
        }
    }

    public void addAccount(String name, int numberAccount, double money) {
        Account account = new Account(name, numberAccount, money);
        if (accounts.contains(account)) {
            System.out.println("Такой счет уже существует!");
        } else {
            accounts.add(account);
        }
    }

    public void addAccount(Account account) {
        /*if (accounts.contains(account)) {
            System.out.println("Такой счет уже существует!");
        } else */if (findAccount(account.getNumberAccount()) != null) {
            System.out.println("Такой номер счета уже существует!");
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
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getNumberAccount() == numberAccount) {
                return accounts.get(i);
            }
        }
        return null;
    }

    public List<Account> findAccount(String name) {
        List<Account> findAccounts = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getName() == name) {
                findAccounts.add(accounts.get(i));
            }
        }
        return findAccounts;
    }

    public Account updateAccount(int numberAccount) {
        if (accounts.isEmpty()) {
            System.out.println("У вас нет счетов");
        } else {
            Account changedAccount = findAccount(numberAccount);
            if(changedAccount != null) {
                return  changedAccount;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if (accounts.isEmpty()) {
            return  "У вас нет счетов";
        } else {
            String result = "Ваши счета:\n";
            for (int i = 0; i < accounts.size(); i++) {
                result += " " + accounts.get(i);
            }
            return result;
        }
    }
}
