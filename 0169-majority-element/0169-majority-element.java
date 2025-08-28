class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int len1=len/2;
        return nums[len1];
    }
}