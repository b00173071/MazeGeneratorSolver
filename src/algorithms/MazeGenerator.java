package algorithms;

import java.util.Random;

import model.Cell;
import model.Maze;
import structures.MyStack;

public class MazeGenerator {

    private Maze maze;
    private Random random = new Random();

    public MazeGenerator(Maze maze) {
        this.maze = maze;
    }

    public void generate() {

        MyStack<Cell> stack = new MyStack<>();

        Cell start = maze.getCell(0, 0);

        stack.push(start);

        while(!stack.isEmpty()) {

            Cell current = stack.peek();

        }
    }
}