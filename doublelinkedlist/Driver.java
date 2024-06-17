package doublelinkedlist;

public class Driver {

    public static void main(String[] args) {
        DoublyLinkedList<Object> list = new DoublyLinkedList<>();

        System.out.println("Add elements:");
        list.add("Test String");
        list.display();

        list.add(10);
        list.display();

        list.add(4.20);
        list.display();

        list.add(true);
        list.display();

        System.out.println("\nDelete element '10':");
        boolean isDeleted = list.delete(10);
        System.out.println("Deleted: " + isDeleted);
        list.display();

        System.out.println("\nDelete element 'nonexistent':");
        isDeleted = list.delete("nonexistent");
        System.out.println("Deleted: " + isDeleted);
        list.display();

        System.out.println("\nDelete element 'Test String':");
        isDeleted = list.delete("Test String");
        System.out.println("Deleted: " + isDeleted);
        list.display();
    }
}
