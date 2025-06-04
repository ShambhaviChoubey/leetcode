import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> exist=new HashSet<>();
        for(int num:nums)
        {
            if(exist.contains(num))
            {
                return true;
            }
                exist.add(num);
            }
            return false; 
        }

    }
