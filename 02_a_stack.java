class Stack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Indicates the stack is initially empty
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("OVERFLOW");
        } else {
            stackArray[++top] = value;
        }
    }

    // Method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("UNDERFLOW");
            return -1; // Indicating that the stack is empty
        } else {
            return stackArray[top--];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to display the elements of the stack
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Creating a stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped element: " + stack.pop());
        stack.push(40);
        stack.push(50);
        System.out.println("Popped element: " + stack.pop());
        stack.displayStack();
    }
}
