package algorithms;

import java.util.*;

import model.Cell;
import model.Maze;
import structures.MyQueue;

public class MazeSolver {

    private Maze maze;

    public MazeSolver(Maze maze) {
        this.maze = maze;
    }

    public void solve() {

        Map<Cell, Cell> parent = new HashMap<>();

        MyQueue<Cell> queue = new MyQueue<>();

        Cell start = maze.getCell(0, 0);
        Cell goal = maze.getCell(
                maze.getRows() - 1,
                maze.getCols() - 1);

        queue.enqueue(start);


        while(!queue.isEmpty()) {

            Cell current = queue.dequeue();

            if(current == goal)
                break;
        }

        Cell step = goal;

        while(step != null) {

            step.setPath(true);

            step = parent.get(step);
        }
    }
}