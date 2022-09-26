package algorithm.dataStructure.graph;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphSearch {
    private final int[][] DIR = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    private int width;
    private int length;
    private int[][] map;

    public GraphSearch(int w, int l) {
        this.width = w;
        this.length = l;
        this.map = new int[w][l];

        for(int i=0; i<width; i++) {
            for(int j=0; j<length; j++) {
                map[i][j] = (Math.random() < 0.3)?0:1;
            }
        }
    }

    public void printMap() {
        System.out.print("[");
        for(int i=0; i<width; i++) {
            System.out.print("[");
            for(int j=0; j<length; j++) {
                if(j!=length-1) {
                    System.out.print(map[i][j]+",");
                } else {
                    System.out.print(map[i][j]+"]");
                }
            }

            if(i!=width-1) {
                System.out.print(", \n");
            } else {
                System.out.print("]");
            }
        }
        System.out.print("\n");
    }

    public void printPath(List<int[]> path) {
        if(path.size()==0) {
            System.out.println("No Path Found! Total Num: 0");
            return ;
        }

        System.out.print("[");
        for(int i=0; i<path.size(); i++) {
            System.out.print("("+path.get(i)[0]+", "+path.get(i)[1]+")");
            if(i!=path.size()-1) {
                System.out.print(",");
            } else {
                System.out.print("]");
            }
        }
        System.out.print(" Total Num: "+path.size());
        System.out.print("\n");
    }


    public void recurDFSHelp(int row, int col, List<int[]> path, boolean[][] visited) {
        if((row < 0) || (row >= this.width) || (col < 0) || (col >= this.length) ||
        (map[row][col] == 0) || visited[row][col]) {
            return ;
        }

        path.add(new int[]{row, col});
        visited[row][col] = true;

        for(int[] direction : DIR) {
            int newRow = row+direction[0];
            int newCol = col+direction[1];
            recurDFSHelp(newRow, newCol, path, visited);
        }
    }

    public List<int[]> searchRecurDFS(int startRow, int startCol) {
        List<int[]> path = new ArrayList<>();
        boolean[][] visited = new boolean[width][length];
        recurDFSHelp(0, 0, path, visited);

        return path;
    }

    public List<int[]> searchRegularDFS(int startRow, int startCol) {
        List<int[]> path = new ArrayList<>();
        if(map[startRow][startCol] == 0) {
            return path;
        }

        boolean[][] visited = new boolean[width][length];
        Deque<int[]> stack = new LinkedList<>();
        stack.add(new int[] {startRow, startCol});
        visited[startRow][startCol] = true;

        while(!stack.isEmpty()) {
            int[] curGrid = stack.pop();
            int curRow = curGrid[0];
            int curCol = curGrid[1];
            path.add(new int[]{curRow, curCol});

            for(int[] direction : DIR) {
                int newRow = curRow+direction[0];
                int newCol = curCol+direction[1];

                if((newRow < 0) || (newRow >= this.width) || (newCol < 0) || (newCol >= this.length) ||
                (map[newRow][newCol] == 0) || visited[newRow][newCol]) {
                    continue;
                }
                stack.add(new int[]{newRow, newCol});
                visited[newRow][newCol] = true;
            }
        }

        return path;
    }

    public List<int[]> searchBFS(int startRow, int startCol) {
        List<int[]> path = new ArrayList<>();
        if(map[startRow][startCol] == 0) {
            return path;
        }

        boolean[][] visited = new boolean[width][length];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {startRow, startCol});
        visited[startRow][startCol] = true;

        while(!queue.isEmpty()) {
            int[] curGrid = queue.poll();
            int curRow = curGrid[0];
            int curCol = curGrid[1];
            visited[curRow][curCol] = true;
            path.add(new int[]{curRow, curCol});

            for(int[] direction : DIR) {
                int newRow = curRow+direction[0];
                int newCol = curCol+direction[1];

                if((newRow < 0) || (newRow >= this.width) || (newCol < 0) || (newCol >= this.length) ||
                (map[newRow][newCol] == 0) || visited[newRow][newCol]) {
                    continue;
                }
                queue.add(new int[]{newRow, newCol});
                visited[newRow][newCol] = true;
            }
        }

        return path;
    }

    public static void main(String[] args) {
        GraphSearch gs = new GraphSearch(4, 4);
        System.out.println("The Generated Map is:");
        gs.printMap();

        List<int[]> r1 = gs.searchRecurDFS(0, 0);
        System.out.print("Path By recursive DFS: ");
        gs.printPath(r1);

        List<int[]> r2 = gs.searchRegularDFS(0, 0);
        System.out.print("Path By regular DFS: ");
        gs.printPath(r2);

        List<int[]> r3 = gs.searchBFS(0, 0);
        System.out.print("Path By BFS: ");
        gs.printPath(r3);
    }
}
