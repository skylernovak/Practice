# LeetCode #283

## Move Zeros

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

**Note** that you must do this in-place without making a copy of the array.

## Example 1:

Input: nums = [0,1,0,3,12]

Output: [1,3,12,0,0]

## Example 2:

Input: nums = [0]

Output: [0]

## Constraints:

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

## Personal Reflection

This problem was easy for my. I inuitively understood this could be solved with two pointers. Iterate through the array, and if it is zero (slow pointer), swap it with the next non-zero number (fast pointer). The only issue I had was I forgot to add the conditional on line 7 `j < nums.length-1` to keep the fast pointer from going out of bounds, but I figured it out in a few minutes. At the time of submission my code beat 7.98% of others in runtime, and 94.68% of other in memory usage.
