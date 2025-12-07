class BankAccount {
 private String accountHolder;
 private String accountNumber;
 private double balance;
 public void setAccountHolder(String h) {
 accountHolder = h;
 }
 public void setAccountNumber(String n) {
 accountNumber = n;
 }
 public void setBalance(double b) {
 balance = b;
 }
 public String getAccountHolder() {
 return accountHolder;
 }
 public String getAccountNumber() {
 return accountNumber;
 }
 public double getBalance() {
 return balance;
 }
}
public class AccountInfo {
 public static void main(String[] args) {
 BankAccount b1 = new BankAccount();
 b1.setAccountHolder("Adnan");
 b1.setAccountNumber("E251003");
 b1.setBalance(5000);
 System.out.println("Account Info:");
 System.out.println("Name: " + b1.getAccountHolder());
 System.out.println("Account Number: " + b1.getAccountNumber());
 System.out.println("Balance: " + b1.getBalance());
 }
}
