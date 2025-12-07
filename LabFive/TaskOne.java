class BankAccount {
int accountNumber;
String accountHolderName;
double balance;
static String bankName = "Sonali Bank";
BankAccount(int accountNumber, String accountHolderName, double
balance) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = balance;
}
static void showBankName() {
System.out.println("Bank Name: " + bankName);
}
void displayAccount() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
System.out.println("Balance: " + balance + " BDT");
}
}
public class Task1 {
public static void main(String[] args) {
BankAccount acc1 = new BankAccount(101, "Rahat", 50000);
BankAccount acc2 = new BankAccount(102, "Salim", 32000);
BankAccount.showBankName();
System.out.println("\nAccount 1 Info:");
acc1.displayAccount();
System.out.println("\nAccount 2 Info:");
acc2.displayAccount();
}
}
