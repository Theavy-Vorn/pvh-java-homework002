import java.util.Scanner;

public class CheckingAccount implements Account{
    static Scanner sc = new Scanner(System.in);
    private String username;
    private String datebirth;
    private String gender;
    private String phone;
    private double balance;
    private int accountNumber;

    public CheckingAccount(String datebirth, String username, String gender, String phone) {
        this.datebirth = datebirth;
        this.username = username;
        this.gender = gender;
        this.phone = phone;
        this.balance = 0;
        this.accountNumber = (int) (Math.random() * 90000) + 10000;
    }
    @Override
    public void deposit(double amount) {
        this.balance+=amount;
        System.out.println("Recieve :$ "+amount);
        System.out.println("Total Amount: $ "+this.balance);
    }

    @Override
    public void withdraw(double amount) {
        if(balance>=amount) {
            this.balance -= amount;
            System.out.println("\t\t\t\t");
            System.out.println("Withdraw :$ " + amount);
            System.out.println("Total balance: $ " + this.balance);
            }else{
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void transfer(double amount, Account targetAccount) {
        if (balance >= amount) {
            this.balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Transferred $" + amount + " from " + "Checking to Saving" );
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Username: " + username);
        System.out.println("Date of Birth: " + datebirth);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phone);
        System.out.println("Balance: " + balance);
    }

}