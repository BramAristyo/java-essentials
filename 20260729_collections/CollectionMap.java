import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

  public static void main(String[] args) {
    Map<String, Integer> scores  = new HashMap<>();

    scores.put("John", 90);
    scores.put("Jane", 85);
    scores.put("John", 95); // Will overwrite the value, because the key must unique value
    scores.put("James", 100);

    System.out.println(scores.get("John")); // get key by value
    System.out.println("Jack"); // key can't find the value .. NULL

    System.out.println(scores.containsKey("Jane")); // boolean
    scores.remove("Jane");
    System.out.println(scores.size()); // Pair size

    for (String key: scores.keySet()) {
      System.out.println(key + ":" + scores.get(key));
    }

    // java idiomatic
    for (Map.Entry<String, Integer> entry : scores.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
