public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(1);
        Account a2 = new Account(1);
        Account a3 = new Account(2, 500);
        Account a4 = new Account(3);
        Account a5 = new Account(4,800);

        StorageAccounts accounts = new StorageAccounts();
        accounts.addAccount(a1);
        accounts.addAccount(a2);
        accounts.addAccount(a3);
        accounts.addAccount(a4);
        accounts.addAccount(a5);

        System.out.println(accounts.toString());
    }
}
