import java.security.PublicKey;

public class BankAccount {

private  int accountNumber;
private  int accountBalance;
private  String customerName;
private String email;
private  String password;

    public BankAccount(int accountNumber, int accountBalance, String customerName, String email, String password) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public  void  withdraw(int amount){
if(amount>0){
    if (amount<= accountBalance){
        accountBalance-=amount;
        System.out.println(amount + " TL çekildi. Yeni bakiye: " + accountBalance + " TL");
    } else {
        System.out.println("Yetersiz bakiye. Çekilecek tutar, hesap bakiyesinden fazla.");

    }
} else {
        System.out.println("Geçersiz miktar. Para çekme işlemi gerçekleştirilemedi.");
    }
}
    public void deposit(int amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println(amount + " TL yatırıldı. Yeni bakiye: " + accountBalance + " TL");
        } else {
            System.out.println("Geçersiz miktar. Para yatırma işlemi gerçekleştirilemedi.");
        }
    }}



