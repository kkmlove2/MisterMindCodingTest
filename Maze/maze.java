class dfs {
	public static int MAZE_SIZE = 8;
    public static int MIN = MAZE_SIZE * MAZE_SIZE;
    public static int GOAL_Y = 2, GOAL_X = 6;
    public static int SEARCH_CNT = 0;
    public String[][] maze = new String[MAZE_SIZE][MAZE_SIZE];
    public void dfsMazeSearch(int y, int x, int l) {
        if (y == GOAL_Y && x == GOAL_X) {
        	System.out.println("done");
            maze[y][x] = "*";
            
            for(int i=0; i<maze.length; i++) {
                for(int j=0; j<maze[i].length; j++) {
                    System.out.print(maze[i][j] + " ");
                }
                System.out.println();
            }
            if (MIN > l) {
                MIN = l;
            }
            return;
        }
        maze[y][x] = "*";
        if (y > 0 && !maze[y-1][x].equals("*") && !maze[y-1][x].equals("■")) {
            System.out.print("↑ up ");
            dfsMazeSearch(y-1, x, l+1);
        }
        if (y < MAZE_SIZE-1 && !maze[y+1][x].equals("*") && !maze[y+1][x].equals("■")) {
            System.out.print("↓ down ");
            dfsMazeSearch(y+1, x, l+1);
        }
        if (x > 0 && !maze[y][x-1].equals("*") && !maze[y][x-1].equals("■")) {
            System.out.print("← left ");
            dfsMazeSearch(y, x-1, l+1);
        }
        if (x < MAZE_SIZE-1 && !maze[y][x+1].equals("*") && !maze[y][x+1].equals("■")) {
            System.out.print("→ right ");
            dfsMazeSearch(y, x+1, l+1);
        }
        maze[y][x] = "□";
        return ;
    }
 
}
    
public class maze {
    public static void main(String[] args) {
        
        dfs dfs = new dfs();
        for(int i=0; i<dfs.maze.length; i++) {
            for(int j=0; j<dfs.maze[i].length; j++) {
                dfs.maze[i][j] = (i == 0 || i == dfs.MAZE_SIZE-1 || j == 0 || j == dfs.MAZE_SIZE-1) ? "■" : "□";
            }
        }
        
        dfs.maze[7][2] = "□";
        dfs.maze[2][7] = "□";
        dfs.maze[0][5] = "□";
        dfs.maze[0][6] = "■";
        dfs.maze[0][7] = "■";
        dfs.maze[1][1] = "■";
        dfs.maze[1][6] = "■";
        dfs.maze[1][7] = "■";
        dfs.maze[2][1] = "■";
        dfs.maze[2][3] = "■";
        dfs.maze[2][4] = "■";
        dfs.maze[3][1] = "■";
        dfs.maze[3][3] = "■";
        dfs.maze[3][4] = "■";
        dfs.maze[3][5] = "■";
        dfs.maze[3][6] = "■";
        dfs.maze[3][7] = "■";
        dfs.maze[4][1] = "■";
        dfs.maze[4][3] = "■";
        dfs.maze[4][4] = "■";
        dfs.maze[4][5] = "■";
        dfs.maze[4][6] = "■";
        dfs.maze[4][7] = "■";
        dfs.maze[5][1] = "■";
        dfs.maze[6][1] = "■";
        dfs.maze[6][3] = "■";
        dfs.maze[6][4] = "■";
        dfs.maze[6][5] = "■";
        dfs.maze[6][6] = "■";
        dfs.maze[6][7] = "■";
        
        // 생성된 초기 미로 출력
        System.out.println("[ 초기 생성 미로 ]");
        for(int i=0; i<dfs.maze.length; i++) {
            for(int j=0; j<dfs.maze[i].length; j++) {
                System.out.print(dfs.maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        dfs.dfsMazeSearch(7, 2, 1);
    }
}

