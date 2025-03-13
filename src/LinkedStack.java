import java.util.Stack;

//implementation of a stack using a single linked list as storage
public class LinkedStack<E> extends Stack {

    private final SinglyLinkedList<E> list = new SinglyLinkedList<>(); //an empty list


    //new stack relies on the initially empty list
    public LinkedStack() {

    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E element) {
        list.addFirst(element);
    }

    public E top() {
        return list.first();
    }

    public E pop() {
        return list.removeFirst();
    }
}
