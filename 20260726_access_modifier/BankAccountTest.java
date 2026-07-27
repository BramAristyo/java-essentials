public class BankAccountTest {
  public static void main(String[] args) {
    BankAccount.staticFunc(); // can call without create the Object

    BankAccount acc = new BankAccount("Andi", 100000);
    acc.deposit(50000);
    acc.withdraw(30000);
    acc.withdraw(150000);

    System.out.println("Owner: " + acc.getOwner());
    System.out.println("Balance: " + acc.getBalance());
  }
}
