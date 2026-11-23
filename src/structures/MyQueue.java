package structures;

import java.util.LinkedList;

public class MyQueue<T> {

    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        if(isEmpty()) return null;
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}