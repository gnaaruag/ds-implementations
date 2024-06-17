package stack;

/**
 * A generic stack implementation.
 *
 * @param <T> the type of elements held in this stack
 */
public class Stack<T> {
    private T[] stack;
    private int size;
    private int top;
    
    /**
     * Constructs a new Stack with the specified size.
     *
     * @param size the maximum number of elements the stack can hold
     */
    @SuppressWarnings("unchecked")
    public Stack(int size) {
        this.size = size;
        this.stack = (T[]) new Object[this.size];
        this.top = -1;
    }

    /**
     * Checks if the stack is full.
     *
     * @return true if the stack is full, false otherwise
     */
    public boolean isFull() {
        return top == this.size - 1;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param data the element to be pushed onto the stack
     */
    public void push(T data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the top element of the stack, or null if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        T pop = stack[top--];
        return pop;
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return the top element of the stack, or null if the stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    /**
     * Displays the elements of the stack.
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
