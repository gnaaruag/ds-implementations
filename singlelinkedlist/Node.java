package singlelinkedlist;

/**
 * A node in a singly linked list.
 *
 * @param <T> the type of element held in this node
 */
class Node<T> {
    /**
     * The data stored in this node.
     */
    T data;

    /**
     * The next node in the linked list.
     */
    Node<T> next;

    /**
     * Constructs a new node with the specified data.
     *
     * @param data the data to be stored in this node
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
