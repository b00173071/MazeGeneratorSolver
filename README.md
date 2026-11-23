# MazeGeneratorSolver

Very easy to compile the code, go to the Main class and hit run, otherwise you can change the parameters in the like "Maze maze = new Maze(25,100);" where 25 is rows and 100 is columns changing the general size of the generated maze.


I went for as simple as I could with this, starting by following the video and making the Cell and Maze classes first, where Maze has a parameter of rows and columns each one containing one Cell that the solver has to go through to find the exit.


MyStack is used in maze generation and MyQueue is used for solving going through each Cell using enqueue and dequeue.


As for the algorithm choice, the maze generation is random but it ALWAYS has to have an exit at the top left end and starts at the bottom right.


And for the solver it just finds the shortest path, not going to places it already visits and then highlighting all the Cells for the shortest path in green.