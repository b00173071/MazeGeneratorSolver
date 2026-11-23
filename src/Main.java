import algorithms.MazeGenerator;
import algorithms.MazeSolver;
import gui.MazeFrame;
import model.Maze;

public class Main {

    public static void main(String[] args) {

        Maze maze = new Maze(25,100);

        MazeGenerator generator = new MazeGenerator(maze);

        generator.generate();

        MazeSolver solver = new MazeSolver(maze);
        
        solver.solve();

        new MazeFrame(maze);
    }
}