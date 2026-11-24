package algorithms;

import java.util.*;

import model.Cell;
import model.Maze;
import structures.MyQueue;

public class MazeSolver {

	//solves the maze using the other algorithm BFS
    private Maze maze;

    public MazeSolver(Maze maze) {
        this.maze = maze;
    }
    //finds the shortest path possible
    public void solve() {

        Map<Cell, Cell> parent = new HashMap<>();

        Set<Cell> visited = new HashSet<>();

        MyQueue<Cell> queue = new MyQueue<>();

        Cell start = maze.getCell(0, 0);
        Cell goal = maze.getCell(maze.getRows() - 1, maze.getCols() - 1);

        queue.enqueue(start);
        visited.add(start);

        while(!queue.isEmpty()) {

            Cell current = queue.dequeue();

            if(current == goal)
                break;

            addNeighbors(current, queue, visited, parent);
        }

        Cell step = goal;

        while(step != null) {

            step.setPath(true);

            step = parent.get(step);
        }
    }
    //adds reachable neighbouring cells to the BFS search
    private void addNeighbors(
            Cell cell,
            MyQueue<Cell> queue,
            Set<Cell> visited,
            Map<Cell, Cell> parent) {

        int r = cell.getRow();
        int c = cell.getCol();

        check(cell, maze.getCell(r - 1, c), !cell.hasTopWall(), queue, visited, parent);

        check(cell, maze.getCell(r + 1, c), !cell.hasBottomWall(), queue, visited, parent);

        check(cell, maze.getCell(r, c - 1), !cell.hasLeftWall(), queue, visited, parent);

        check(cell, maze.getCell(r, c + 1), !cell.hasRightWall(), queue, visited, parent);
    }
    
    //confirms and queues a neighbouring cell
    private void check(
            Cell current,
            Cell next,
            boolean open,
            MyQueue<Cell> queue,
            Set<Cell> visited,
            Map<Cell, Cell> parent) {

        if(next != null && open && !visited.contains(next)) {

            visited.add(next);

            parent.put(next, current);

            queue.enqueue(next);
        }
    }
}