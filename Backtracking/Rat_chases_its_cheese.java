package Backtracking;

import java.util.Scanner;

public class Rat_chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char maze[][] = new char[n][m];
        for(int i=0; i<n; i++){
            String s = sc.next();
            for(int j=0; j<s.length(); j++){
                maze[i][j] = s.charAt(j);
            }
        }
        int ans[][] = new int[n][m];
        RatInMaze(maze, n, m , ans);
        if(flag == false) System.out.println("Path not found ");
    }

    static boolean flag = false;
    public static void RatInMaze(char maze[][] , int cr , int cc , int ans[][]  ){


        // base case

        if(cr == maze.length-1 && cc == maze[0].length-1 && maze[cr][cc] == 'O' ){
            ans[cr][cc] = 1;
            display(ans);
            flag = true;
            return ; 
            
        }

        if(cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X' ) {
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;

        int r[] = {0 , 0 , 1 , -1};
        int c[] = {-1 , 1 ,0 , 0};

        for(int i=0; i<r.length; i++){
            RatInMaze(maze, cr+r[i], cc+c[i] , ans);
        }
      
        // RatInMaze(maze, cr, cc-1 , ans);  // left call
        // RatInMaze(maze, cr, cc+1 , ans); // right call
        // RatInMaze(maze, cr+1, cc , ans);  // top call
        // RatInMaze(maze, cr-1, cc ,ans);  // bottom call

        maze[cr][cc] = 'O';  //undo
        ans[cr][cc] = 0;
    }

    public static void display(int ans[][]){

        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
        }
    }
}

