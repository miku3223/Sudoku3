import java.io.*;
import java.util.*;

public class SudokuEngine {

   public static void main(String[] args) {
      try {
         SudokuBoard myBoard = new SudokuBoard("boards/valid-incomplete.sdk");
         System.out.print(myBoard.solve());
         System.out.println(myBoard);
         System.out.println(myBoard.isSolved());

      } catch(FileNotFoundException e) {
         System.out.println("Board file not found!");
      }
   }
}
/*
53..7....
6..195...
.98....6.
8...6...3
4..8.3..1
7...2...6
.6....28.
...419..5
....8..79
 Sample output of pretty board
 
  ----jGRASP exec: java SudokuEngine
 ┏━━━┯━━━┯━━━┳━━━┯━━━┯━━━┳━━━┯━━━┯━━━┓
 ┃ 2 │   │   ┃ 1 │   │ 5 ┃   │   │ 3 ┃
 ┠───┼───┼───╂───┼───┼───╂───┼───┼───┨
 ┃   │ 5 │ 4 ┃   │   │   ┃ 7 │ 1 │   ┃
 ┠───┼───┼───╂───┼───┼───╂───┼───┼───┨
 ┃   │ 1 │   ┃ 2 │   │ 3 ┃   │ 8 │   ┃
 ┣━━━┿━━━┿━━━╋━━━┿━━━┿━━━╋━━━┿━━━┿━━━┫
 ┃ 6 │   │ 2 ┃ 8 │   │ 7 ┃ 3 │   │ 4 ┃
 ┠───┼───┼───╂───┼───┼───╂───┼───┼───┨
 ┃   │   │   ┃   │   │   ┃   │   │   ┃
 ┠───┼───┼───╂───┼───┼───╂───┼───┼───┨
 ┃ 1 │   │ 5 ┃ 3 │   │ 9 ┃ 8 │   │ 6 ┃
 ┣━━━┿━━━┿━━━╋━━━┿━━━┿━━━╋━━━┿━━━┿━━━┫
 ┃   │ 2 │   ┃ 7 │   │ 1 ┃   │ 6 │   ┃
 ┠───┼───┼───╂───┼───┼───╂───┼───┼───┨
 ┃   │ 8 │ 1 ┃   │   │   ┃ 2 │ 4 │   ┃
 ┠───┼───┼───╂───┼───┼───╂───┼───┼───┨
 ┃ 7 │   │   ┃ 4 │   │ 2 ┃   │   │ 1 ┃
 ┗━━━┷━━━┷━━━┻━━━┷━━━┷━━━┻━━━┷━━━┷━━━┛
 
 
  ----jGRASP: Operation complete.
  */