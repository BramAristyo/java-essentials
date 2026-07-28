class InsufficientBalanceException extends RuntimeException {
  public InsufficientBalanceException(String message) {
    super(message);
  }
}

public class Balance {

  static void checkBalanceWithCustomError(int balance, int withdrawAmount) {
    if (balance < withdrawAmount) {
        throw new InsufficientBalanceException("Insufficient balance: need " + withdrawAmount + " but only have " + balance);
    }
    System.out.println("Withdraw approved");
  }

  static void checkBalance(int balance, int withdrawAmount) {
      if (balance < withdrawAmount) {
          throw new RuntimeException("Insufficient balance");
      }
      System.out.println("Withdraw approved");
  }

  public static void main(String[] args) {
      try {
        checkBalanceWithCustomError(100000, 150000);
      } catch (InsufficientBalanceException e) {
        System.out.println("Custom Error: " + e.getMessage());
      } catch (RuntimeException e) {
          System.out.println("Error: " + e.getMessage());
      } finally {
          System.out.println("Program end");
      }
  }
}
