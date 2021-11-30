class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                while (nums[j] == 0 && j < nums.length-1) {
                    j++;
                }
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }
    }
}