package stack;

public class Driver {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display the stack
        System.out.println("Stack elements:");
        stack.display();

        // Peek at the top element
        System.out.println("Peek element: " + stack.peek());

        // Pop some elements
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Display the stack after popping
        System.out.println("Stack elements after popping:");
        stack.display();

        // Push more elements
        stack.push(60);
        stack.push(70);

        // Display the stack again
        System.out.println("Stack elements after pushing:");
        stack.display();
    }
}
