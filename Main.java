package StackDemo.LinkedListBasedStack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List-Based Stack:");
        LinkedListBasedStack linkedListStack = new LinkedListBasedStack();
        linkedListStack.push(4);
        linkedListStack.push(5);
        linkedListStack.push(6);
        System.out.println("Top element (peek): " + linkedListStack.peek());
        System.out.println("Popped element: " + linkedListStack.pop());
        System.out.println("Is stack empty? " + linkedListStack.isEmpty());
    }
}
