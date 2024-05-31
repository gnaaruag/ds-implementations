package arraylist;

public class Driver {

  public static void main(String[] args) {
    // Test String ArrayList
    ArrayList<String> stringList = new ArrayList<>(4);  // Specify type and initial capacity

    System.out.println("String ArrayList:");
    System.out.println("add:");
    stringList.add("Hello");
    System.out.println(stringList.size());
    stringList.display();  // Assuming you have a display method for printing elements

    System.out.println("add:");
    stringList.add("World");
    System.out.println(stringList.size());
    stringList.display();

    System.out.println("get test 1:");
    try {
      System.out.println(stringList.get(3));
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Expected IndexOutOfBoundsException for get on invalid index");
    }

	System.out.println("get test 1:");
    try {
      System.out.println(stringList.get(1));
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Expected IndexOutOfBoundsException for get on invalid index");
    }

    System.out.println("delete:");
    stringList.delete(0);
    System.out.println(stringList.size());
    stringList.display();

    // Test Double ArrayList
    ArrayList<Double> doubleList = new ArrayList<>(4);  // Specify type and initial capacity

    System.out.println("\nDouble ArrayList:");
    System.out.println("add:");
    doubleList.add(3.14);
    System.out.println(doubleList.size());
    doubleList.display();  // Assuming the display method can handle Doubles

    System.out.println("add:");
    doubleList.add(2.72);
    System.out.println(doubleList.size());
    doubleList.display();

    System.out.println("get test:");
    try {
      System.out.println(doubleList.get(1));
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Expected IndexOutOfBoundsException for get on invalid index");
    }

    System.out.println("delete:");
    doubleList.delete(0);
    System.out.println(doubleList.size());
    doubleList.display();
  }
}
