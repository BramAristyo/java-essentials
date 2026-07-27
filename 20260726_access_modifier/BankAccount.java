public class BankAccount {
  // Private fields = encapsulation. Can only be accessed inside this class,
  // not directly from outside (e.g. BankAccountTest can't do acc.balance = 999)
  private String owner;
  private double balance;

  // Constructor: special method with the SAME NAME as the class.
  // Called automatically when you do "new BankAccount(...)"
  public BankAccount(String owner, double balance) {
    // Setter
    this.owner = owner;
    this.balance = balance;
  }

  // STATIC method: belongs to the CLASS itself, not to any specific object.
  public static void staticFunc() {
    System.out.println("this is static function!");
  }

  public void deposit(double cashIn) {
    balance = balance + cashIn;
  }

  public void withdraw(double cashOut) {
    if (balance - cashOut < 0) {
      System.out.println("Withdraw failed: out of balanace!");
    } else {
      balance = balance - cashOut;
    }

  }

  public String getOwner() {
    return owner;
  }

  public double getBalance() {
    return balance;
  }
}
