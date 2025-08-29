class Solution {
    public int findMin(int[] nums) {

        // in this we have to find the minimum element 
        // first step is we check for entire array if sorted store the low 
        // if not then we check which one is sorted left half or either right half
        
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){

            int mid = (low+high)/2;

            // so first we check for the entire array
            if(nums[low] <= nums[high]){
                ans = Math.min(ans , nums[low]);
                break;
            }

            // check if left part is sorted

            if(nums[low] <= nums[mid]){
                ans = Math.min(ans , nums[low]);

                low = mid+1;
            } else{
                ans = Math.min(ans , nums[mid]);

                high = mid - 1;
            }

          
        }

        return ans ;
        
    }
}