package algorithms;

import java.util.ArrayList;
import java.util.Random;

import model.Cell;
import model.Maze;
import structures.MyStack;

public class MazeGenerator {

	//should generate a maze randomly with DFS
    private Maze maze;
    private Random random = new Random();

    public MazeGenerator(Maze maze) {
        this.maze = maze;
    }

    public void generate() {

        MyStack<Cell> stack = new MyStack<>();

        Cell start = maze.getCell(0, 0);
        start.setVisited(true);

        stack.push(start);

        while(!stack.isEmpty()) {

            Cell current = stack.peek();

            ArrayList<Cell> neighbors = getUnvisitedNeighbors(current);

            if(!neighbors.isEmpty()) {

                Cell next = neighbors.get(random.nextInt(neighbors.size()));

                removeWalls(current, next);

                next.setVisited(true);

                stack.push(next);

            }
            else {
                stack.pop();
            }
        }
    }

    private ArrayList<Cell> getUnvisitedNeighbors(Cell cell) {

        ArrayList<Cell> list = new ArrayList<>();

        int r = cell.getRow();
        int c = cell.getCol();

        Cell top = maze.getCell(r - 1, c);
        Cell bottom = maze.getCell(r + 1, c);
        Cell left = maze.getCell(r, c - 1);
        Cell right = maze.getCell(r, c + 1);

        if(top != null && !top.isVisited())
            list.add(top);

        if(bottom != null && !bottom.isVisited())
            list.add(bottom);

        if(left != null && !left.isVisited())
            list.add(left);

        if(right != null && !right.isVisited())
            list.add(right);

        return list;
    }

    private void removeWalls(Cell current, Cell next) {

        int dx = current.getCol() - next.getCol();
        int dy = current.getRow() - next.getRow();

        if(dx == 1) {
            current.setLeftWall(false);
            next.setRightWall(false);
        }

        if(dx == -1) {
            current.setRightWall(false);
            next.setLeftWall(false);
        }

        if(dy == 1) {
            current.setTopWall(false);
            next.setBottomWall(false);
        }

        if(dy == -1) {
            current.setBottomWall(false);
            next.setTopWall(false);
        }
    }
}