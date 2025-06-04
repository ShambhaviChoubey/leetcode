class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> exist= new HashMap<>();
         for(int i=0;i<nums.length;i++)
         {
            int minus= target-nums[i];
            if(exist.containsKey(minus))
            {
                return new int[]{exist.get(minus),i};
            }
            exist.put(nums[i],i);
         }
         return new int[]{};
            

         

    }
}