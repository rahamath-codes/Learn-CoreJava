package Java_Constructor;

/*
A base class BankAccount with constructors
A subclass SavingsAccount that extends it
Use of super() to call parent constructor
Show constructor chaining with this()
 */

//Base class
class BankAccount {
 String accountHolder;
 double balance;

 // Default constructor
 BankAccount() {
     this("Unknown", 0.0); // constructor chaining using this()
 }

 // Parameterized constructor
 BankAccount(String holder, double balance) {
     this.accountHolder = holder;
     this.balance = balance;
     System.out.println("BankAccount constructor called");
 }

 void showDetails() {
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Balance: $" + balance);
 }
}

//Subclass
class SavingsAccount extends BankAccount {
 double interestRate;

 // Constructor for SavingsAccount
 SavingsAccount(String holder, double balance, double rate) {
     super(holder, balance); // calls parent constructor
     this.interestRate = rate;
     System.out.println("SavingsAccount constructor called");
 }

 void showFullDetails() {
     showDetails();
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}

//Main class
public class BankDemo {
 public static void main(String[] args) {
     SavingsAccount sa = new SavingsAccount("Alice", 10000.0, 3.5);
     System.out.println("--- Account Details ---");
     sa.showFullDetails();
 }
}

/*	
| Concept              | Usage                                        |
| -------------------- | -------------------------------------------- |
| `super()`            | Calls parent class constructor               |
| `this()`             | Calls another constructor in same class      |
| Inheritance          | SavingsAccount inherits from `BankAccount` |
| Constructor chaining | Reduces code duplication                     |
*/

