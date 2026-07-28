interface TestInterface {
  void display(); // declare the method for child implementor class
}

class TestClass implements TestInterface {
  // TestClass must have display Method
  public void display(){
    System.out.println("Geek");
  }
}

public class Geek {
  public static void main(String[] args) {
    TestClass t = new TestClass();
    t.display();

    // testInterface == TestClass
    TestInterface ti = new TestClass();
    ti.display();
  }
}
