package com.recursion.maze;

import java.util.ArrayList;

public class CountingPaths {
    public static void main(String[] args) {
        System.out.println("Without Diagonal Count: " + count(3,3));
        System.out.println("Path Without Diagonal: " + return_paths("",3,3));
        System.out.println("Path with Diagonal: " + return_paths_diagonal("",3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("",board,0,0); //starting from 0,0
    }

    /****** P1.Return Count of Paths ******/
    public static int count(int r, int c){
        if( r == 1 | c == 1){
            return 1;
        }
        int down = count(r-1, c);
        int right = count(r, c-1);
        return right+down;
    }

    /******* P2.Print actual path ********/
    public static ArrayList<String> return_paths(String str, int r, int c){
        if( r == 1 && c == 1){
            // we need both conditions to be true, because r=1 or c=1 does not guarantee(as in first case as there is only one path)
            // path as we need full path.
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> list = new ArrayList<>(); // local arraylist to add all paths from down or right
        if(r>1){ // if r=1 then we can't go down further (as in Q1 we were using || instead of && and in base condition)
            list.addAll(return_paths(str + "D", r-1, c));
        }
        if(c>1){
            list.addAll(return_paths(str + "R", r, c-1));
        }
        return list;
    }

    /******* P3.Added Diagonal Paths ********/
    public static ArrayList<String> return_paths_diagonal(String str, int r, int c){
        if( r == 1 && c == 1){
            // we need both conditions to be true, because r=1 or c=1 does not guarantee(as in first case as there is only one path)
            // path as we need full path.
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> list = new ArrayList<>(); //local arraylist to add all paths from down or right
        if(r>1){ // if r=1 then we can't go down further (as in P1 we were using || instead of && and in base condition)
            list.addAll(return_paths_diagonal(str + "V", r-1, c));
        }
        if(r>1 && c> 1){
            list.addAll(return_paths_diagonal(str + "D", r-1, c-1));
        }
        if(c>1){
            list.addAll(return_paths_diagonal(str + "R", r, c-1));
        }
        return list;
    }

    /****** Adding Obstacles in Maze ******/

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) { //starting from 0,0 to last block r,c
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c+1);
        }
    }

}




