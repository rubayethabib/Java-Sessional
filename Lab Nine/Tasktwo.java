class BankAccount {
private String accountHolder;
private String accountNumber;
private double balance
// Setter Methods
public void setAccountHolder(String accountHolder) {
this.accountHolder = accountholder;
public void setAccountNumber(String accountNumber) {
this.accountNumber = accountNumber;
public void setBalance(double balance) {
this.balance = balance;
}
// Method to show information securely
public void showAccountInfo() {
System.out.println("Account Holder: " + accountHolder);
System.out.println("Account Number: " + accountNumber);
System.out.println("Balance: $" + balance);
}}
public class Main {
public static void main(String[] args) {
BankAccount acc = new BankAccount();
acc.setAccountHolder("Rubayet Ahasan Habib");
acc.setAccountNumber("123456789123456");
acc.setBalance(15000.50);
System.out.println("Bank Account Information:");
acc.showAccountInfo();
}
}

