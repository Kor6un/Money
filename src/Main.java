public class Main {
    public static void main(String[] args) {

        StorageAccounts accounts = new StorageAccounts();

        Account a1 = accounts.createAccount("счет 1",1, 100);
       /* Account a2 = accounts.createAccount("счет 2",2, 1500);
        Account a3 = accounts.createAccount("счет 3",3);
        Account a4 = accounts.createAccount("счет 4",4);
        Account a5 = accounts.createAccount("Счет Антона",5,5400);

        accounts.addAccount(a1);
        accounts.addAccount(a2);
        accounts.addAccount(a3);
        accounts.addAccount(a4);
        accounts.addAccount(a5);
        accounts.addAccount("Счет 5", 6);
        accounts.addAccount("Счет 6", 7, 8500);

        Account a7 = new Account("Счет Антона", 8, 5000);
        Account a8 = new Account("Счет Zmey", 9);

        accounts.addAccount(a7);
        accounts.addAccount(a8);

        System.out.println(accounts);

        System.out.println(accounts.findAccount("Счет Антона"));
        System.out.println(accounts.updateAccount(5));
        System.out.println(accounts.findAccount("Счет Антона"));*/

        Category category = new Category("Food");


        Operations operations = new Operations(a1, category);

        operations.transaction(50);

        System.out.println(a1);
        System.out.println(operations);

       /* operations.transaction(1500);*/
        System.out.println(a1);

        System.out.println(a1.getHistory());

    }
}
