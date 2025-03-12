//we store elements in an array, named data, with capacity N for some fixed N. We oriented the stack so that the bottom
//element of the stack is always stored in cell data[0], and the top element of the
//stack in cell data[t] for index t that is equal to one less than the current size of the stack.
//
//Arrays start at index 0 in Java, when the stack holds elements
//from data[0] to data[t] inclusive, it has size t +1. By convention, when the stack is
//empty it will have t equal to −1 (and thus has size t + 1, which is 0).

import java.util.Stack;

public class ArrayStack<E> extends Stack<E> {
    public static final int CAPACITY = 1000; //default array capacity
    private final E[] data; //generic array for storage
    private int t = -1; //index of the top element in the stack


    //constructs stack with default capacity
    public ArrayStack() {
        this(CAPACITY);
    }

    //constructs stack with given capacity
    public ArrayStack(int capacity) {
        data = (E[]) new Object[CAPACITY]; //safe cast
    }

    public int size() {
        return (t + 1);
    }

    public boolean isEmpty() {
        return (t == -1); //return the empty stack
    }

    public void push(E e) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e; //increment t before storing new item
    }

    public E top() {
        if (isEmpty()) return null;
        return data[t];
    }

    public E pop() {
        if (isEmpty()) return null;
        E answer = data[t]; //assigning the last value of the stack to the answer generic value
        data[t] = null; //dereference to help garbage collection
        t--;
        return answer;
    }
}
