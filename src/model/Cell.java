package model;

public class Cell {

	//shows a single cell in a maze
	
    private int row;
    private int col;

    private boolean top = true;
    private boolean bottom = true;
    private boolean left = true;
    private boolean right = true;

    private boolean visited = false;
    private boolean path = false;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
    //getters and setters
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean hasTopWall() {
        return top;
    }

    public boolean hasBottomWall() {
        return bottom;
    }

    public boolean hasLeftWall() {
        return left;
    }

    public boolean hasRightWall() {
        return right;
    }

    public void setTopWall(boolean value) {
        top = value;
    }

    public void setBottomWall(boolean value) {
        bottom = value;
    }

    public void setLeftWall(boolean value) {
        left = value;
    }

    public void setRightWall(boolean value) {
        right = value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean value) {
        visited = value;
    }

    public boolean isPath() {
        return path;
    }

    public void setPath(boolean path) {
        this.path = path;
    }
}
