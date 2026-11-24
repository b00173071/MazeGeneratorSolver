package gui;

import javax.swing.JPanel;
import java.awt.*;

import model.Cell;
import model.Maze;

public class MazePanel extends JPanel {

    private Maze maze;

    public MazePanel(Maze maze) {
        this.maze = maze;
    }
    //renders maze
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int size = 20;

        for(int r = 0; r < maze.getRows(); r++) {

            for(int c = 0; c < maze.getCols(); c++) {

                Cell cell = maze.getCell(r, c);

                int x = c * size;
                int y = r * size;

                if(cell.isPath()) {

                    g.setColor(Color.GREEN);

                    g.fillRect(
                            x + 2,
                            y + 2,
                            size - 4,
                            size - 4);
                }

                g.setColor(Color.BLACK);

                if(cell.hasTopWall())
                    g.drawLine(x,y,x+size,y);

                if(cell.hasBottomWall())
                    g.drawLine(x,y+size,x+size,y+size);

                if(cell.hasLeftWall())
                    g.drawLine(x,y,x,y+size);

                if(cell.hasRightWall())
                    g.drawLine(x+size,y,x+size,y+size);
            }
        }
    }
}