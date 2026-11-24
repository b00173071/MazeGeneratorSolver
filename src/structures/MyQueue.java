package structures;

import java.util.LinkedList;

public class MyQueue<Cell> {

	//queue used for BFS traversal
    private LinkedList<Cell> queue = new LinkedList<>();

    public void enqueue(Cell item) {
        queue.addLast(item);
    }

    public Cell dequeue() {
        if(isEmpty()) return null;
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}