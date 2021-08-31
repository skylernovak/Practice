/**
 * https://leetcode.com/problems/number-of-islands/
 * I did not solve this on my own. I watched Nick White's youtube solution and then attempted to solve it again on my own
 * I mostly got it, but I had some errors comparing char to Strings, and some stack overflow issues
 * the stack overflow was caused because in my recursion I forgot to call "grid[i][j] == '0'"
 * I will try this again wholly on my own continously until I get it. Then I may submit the solution to LeetCode
 * When Mr. White was explaining the solution, I knew it was a recursion problem, and that it was a breadth first search type problem,
 * I just did not recall the term BFS, nor how to properly implement it.
 * 
 * Skyler Novak
 * 01/12/21
 * 
 * 2nd attempt
 * I managed to do it all on my own from memory, 3 days later. The only thing I forgot to do was compare ">=", as my solution was only ">"
 * 01/15/21
 */

class Solution {
    public int numIslands(char[][] grid) {
        
        int numIslands = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    callBFS(grid, i, j);
                } // if
            } // for(j)
        } // for(i)
        
        return numIslands;
    
    } // numIslands()
    
    public void callBFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return;
        
        grid[i][j] = '0';
        callBFS(grid, i-1, j);    // up
        callBFS(grid, i+1, j);    // down
        callBFS(grid, i, j-1);    // left
        callBFS(grid, i, j+1);    // right
    }
    
} // Solution