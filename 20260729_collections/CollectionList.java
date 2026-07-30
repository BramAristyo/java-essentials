import java.util.ArrayList;
import java.util.List;

public class CollectionList {

  // List is just like slice in golang, array with dynamic size
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.add("John");
    names.add("Jane");
    names.add("James");

    System.out.println(names.getFirst()); // John
    System.out.println(names.get(0)); // John

    System.out.println(names.size()); // Get slice size
    names.remove("John");

    System.out.println(names.contains("John")); // false
    System.out.println(names.set(0, "Jack")); // change Jane to Jack

    // loop the List
    for (String name: names) {
      System.out.println(name);
    }
  }
}
