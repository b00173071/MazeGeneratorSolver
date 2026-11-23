package gui;

import javax.swing.JFrame;

import model.Maze;

public class MazeFrame extends JFrame {

    public MazeFrame(Maze maze) {

        setTitle("Maze Visualizer");

        add(new MazePanel(maze));

        setSize(800, 800);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);
    }
}