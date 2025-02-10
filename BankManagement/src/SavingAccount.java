import java.util.Scanner;

public class SavingAccount implements Account{
    static Scanner sc = new Scanner(System.in);
    private String username;
    private String datebirth;
    private String gender;
    private String phone;

    public SavingAccount(String username, String datebirth, String gender, String phone) {
        this.username = username;
        this.datebirth = datebirth;
        this.gender = gender;
        this.phone = phone;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void transfer(double amount, Account targetAccount) {

    }

    @Override
    public void displayAccountInfo() {
//        System.out.println("Username: " + username);
//        System.out.println("Date of Birth: " + datebirth);
//        System.out.println("Gender: " + gender);
//        System.out.println("Phone: " + phone);
//        System.out.println("Interest Rate: " + rate + "%");
    }
}
