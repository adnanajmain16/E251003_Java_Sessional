interface ATMService {
 void withdraw(double amount);
 void deposit(double amount);
 void checkBalance();
}
class DBBL implements ATMService {
 double balance = 1000; // initial balance
 @Override
 public void withdraw(double amount) {
 if (amount > balance) {
 System.out.println("Insufficient balance!");
 } else {
 balance -= amount;
 System.out.println("Withdraw Successful! New Balance: " + balance);
 }
 }
 @Override
 public void deposit(double amount) {
 balance += amount;
 System.out.println("Deposit Successful! New Balance: " + balance);
 }
 @Override
 public void checkBalance() {
 System.out.println("Current Balance: " + balance);
 }
}
public class ATMTask2 {
 public static void main(String[] args) {
 DBBL atm = new DBBL();
 atm.checkBalance();
 atm.deposit(500);
 atm.withdraw(300);
 atm.checkBalance();
 }
}
