import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static CheckingAccount checkingAccount;
    public static CheckingAccount savingAccount;

    public static void main(String[] args) {
        int opt;
        do {
            System.out.println("================== Online Bank Account System ====================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Display Account Information");
            System.out.println("6. Delete Account");
            System.out.println("7. Exit");
            System.out.println("==========================================================");
            System.out.print("=> Choose option (1-7): ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withDrawMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    displayAccountInfo();
                    break;
                case 6:
                    break;
            }
        } while (opt != 7);

        System.out.println("Exiting Online Bank Account System...");
        sc.close();
    }

    public static void createAccount() {
        Scanner sc = new Scanner(System.in);
        int opt1;
        do {
            System.out.println("================= Create Account ====================");
            System.out.println("1. Checking Account");
            System.out.println("2. Saving Account");
            System.out.println("3. Back");
            System.out.println("=====================================================");
            System.out.print("=> What type of account do you want to create? ");
            opt1 = sc.nextInt();

            switch (opt1) {
                case 1:
                    createChecking();
                    break;
                case 2:
                    createSaving();
                    break;
            }
        } while (opt1 != 3);

    }

    public static void createChecking() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String username = scanner.nextLine();
        System.out.print("Input birth: ");
        String datebirth = scanner.nextLine();
        System.out.print("Input gender : ");
        String gender = scanner.nextLine();
        System.out.print("Input phone: ");
        String phone = scanner.nextLine();

        checkingAccount = new CheckingAccount(username, datebirth, gender, phone);
        System.out.println("Your Checking account has been created successfully!");
        checkingAccount.displayAccountInfo();
    }

    public static void createSaving() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String username = scanner.nextLine();
        System.out.print("Input birth: ");
        String datebirth = scanner.nextLine();
        System.out.print("Input gender : ");
        String gender = scanner.nextLine();
        System.out.print("Input phone: ");
        String phone = scanner.nextLine();

        SavingAccount createSaving = new SavingAccount(username, datebirth, gender, phone);
        System.out.println("Your Saving account has been created successfully!");
        createSaving.displayAccountInfo();
    }

    public static void depositMoney() {
        Scanner sc = new Scanner(System.in);
        int opt1;
        do {
            System.out.println("================= Deposit Money ===================");
            System.out.println("1. Checking Account");
            System.out.println("2. Saving Account");
            System.out.println("3. Back");
            System.out.println("=====================================================");
            System.out.print("=> What type of account do you want to deposit? ");
            opt1 = sc.nextInt();

            switch (opt1) {
                case 1:
                    System.out.print("Enter money to deposit :");
                    double deposit = sc.nextDouble();
                    checkingAccount.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter money to deposit :");
                    double deposit1 = sc.nextDouble();
                    break;
            }
        } while (opt1 != 3);

    }

    public static void withDrawMoney() {
        Scanner sc = new Scanner(System.in);
        int opt1;
        do {
            System.out.println("================= Withdraw Money ===================");
            System.out.println("1. Checking Account");
            System.out.println("2. Saving Account");
            System.out.println("3. Back");
            System.out.println("=====================================================");
            System.out.print("=> What type of account do you want to withdraw? ");
            opt1 = sc.nextInt();

            switch (opt1) {
                case 1:
                    System.out.print("Enter money to deposit :");
                    double deposit = sc.nextDouble();
                    checkingAccount.withdraw(deposit);
                    break;
                case 2:
                    System.out.print("Enter money to deposit :");
                    double deposit1 = sc.nextDouble();
                    break;
            }
        } while (opt1 != 3);

    }

    public static void transferMoney() {
        Scanner sc = new Scanner(System.in);
        int opt1;
        do {
            System.out.println("================= Transfer Moneys ===================");
            System.out.println("1. Checking Account -> Saving Account");
            System.out.println("2. Saving Account -> Checking Account");
            System.out.println("3. Back");
            System.out.println("=====================================================");
            System.out.print("=> What type of account do you want to transfer? ");
            opt1 = sc.nextInt();

            switch (opt1) {
                case 1:
                    System.out.print("Enter amount to transfer from Checking to Saving: ");
                    double amount = sc.nextDouble();
                    checkingAccount.transfer(amount, savingAccount);
                    break;
                case 2:
                    System.out.print("Enter amount to transfer from Saving to Checking: ");
                    amount = sc.nextDouble();
                    savingAccount.transfer(amount, checkingAccount);
                    break;
            }
        } while (opt1 != 3);
    }
    public static void displayAccountInfo(){
        checkingAccount.displayAccountInfo();
    }
}

