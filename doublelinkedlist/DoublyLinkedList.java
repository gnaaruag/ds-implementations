package doublelinkedlist;

/**
 * A generic singly linked list implementation.
 *
 * @param <T> the type of elements held in this list
 */
public class DoublyLinkedList<T> {
    /**
     * The head (first node) of the linked list.
     */
    Node<T> head;

    /**
     * Constructs an empty singly linked list.
     */
    public DoublyLinkedList() {
        this.head = null;
    }

    /**
     * Adds a new element to the end of the linked list.
     *
     * @param data the data to be added to the list
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    /**
     * Deletes the first occurrence of the specified element from the linked list, if it is present.
     *
     * @param data the data to be deleted from the list
     * @return {@code true} if the element was found and deleted; {@code false} otherwise
     */
    public boolean delete(T data) {
        if (this.head == null) {
            return false;
        }
        if (head.data.equals(data)) {
            head = head.next;
            return true;
        }
        Node<T> current = this.head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next == null) {
            return false;
        }
        current.next = current.next.next;
        if (current.next != null) {
            current.next.prev = current;
        }
        return true;
    }

    /**
     * Displays the elements of the linked list.
     * The elements are printed in the format "element1 -> element2 -> ... -> null".
     */
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
