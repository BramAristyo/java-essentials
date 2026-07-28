import java.util.ArrayList;
import java.util.List;

// Contract
interface PaymentMethod {
  void pay(int amount);
}

// Explicit 'Implements'
class CreditCard implements PaymentMethod {
  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " via credit card.");
  }
}

class Cash implements PaymentMethod {
  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " via cash.");
  }
}

public class Payment {

  public static void main(String[] args) {
    // One list, holds DIFFERENT concrete types (CreditCard, Cash)
    // as long as they share the same interface — this is polymorphism
    List<PaymentMethod> payments = new ArrayList<>();
    payments.add(new CreditCard());
    payments.add(new Cash());

    // Loop doesn't care WHICH implementation it's calling —
    // just that each one has pay(). Same call, different behavior.
    for (PaymentMethod p: payments) {
      p.pay(50000);
    }
  }
}
