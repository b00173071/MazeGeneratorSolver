package structures;

import java.util.ArrayList;

public class MyStack<Cell> {

    private ArrayList<Cell> stack = new ArrayList<>();

    public void push(Cell item) {
        stack.add(item);
    }

    public Cell pop() {
        if(isEmpty()) return null;
        return stack.remove(stack.size() - 1);
    }

    public Cell peek() {
        if(isEmpty()) return null;
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}