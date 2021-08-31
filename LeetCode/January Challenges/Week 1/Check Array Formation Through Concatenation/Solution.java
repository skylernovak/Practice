/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3589/
*/

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        // for loop to traverse 1D array arr
        for (int i = 0; i < arr.length; i++) {
            // try to match the first element of arr with the first element of some array in pieces
            // another for loop to traverse 2D array pieces
            for (int j = 0; j < pieces.length; j++) {
                for (int k = 0; k < pieces[j].length; k++) {
                    // if this sub array doesnt match arr, exit
                    if (arr[i] != pieces[j][k])
                        break;
                    
                }
            }
        }
    }
}