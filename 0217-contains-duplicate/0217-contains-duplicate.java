import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);  // Sort the array first
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {  // Check adjacent elements
                return true;
            }
        }
        return false;
    }
}